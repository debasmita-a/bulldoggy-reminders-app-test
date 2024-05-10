package bulldoggy.app.driverfactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverFactory {

	private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	private BrowserOptionsSettings options;
	private Properties prop;

	/**
	 * This method returns the WebDriver reference. Here we are initializing the
	 * ThreadLocal<WebDriver> object and setting it to different browser drivers as
	 * per browser names.
	 * 
	 * @param prop
	 * @return WebDriver
	 */

	public WebDriver getWebDriverDriver(Properties prop) {
		this.prop = prop;
		options = new BrowserOptionsSettings(prop);

		String browser = prop.getProperty("browser");
		System.out.println("Launching browser... " + browser);

		switch (browser.toLowerCase().trim()) {
		case "chrome":
			if (Boolean.parseBoolean(prop.getProperty("remote"))) {
				getRemoteWebDriver("chrome");
			} else {
				tlDriver.set(new ChromeDriver(options.getChromeOptions()));
			}
			break;
		case "firefox":
			if (Boolean.parseBoolean(prop.getProperty("remote"))) {
				getRemoteWebDriver("firefox");
			} else {
				tlDriver.set(new FirefoxDriver(options.getFirefoxOptions()));
			}
			break;
		case "edge":
			if (Boolean.parseBoolean(prop.getProperty("remote"))) {
				getRemoteWebDriver("edge");
			} else {
				tlDriver.set(new EdgeDriver(options.getEdgeOptionsOptions()));
			}
			break;

		default:
			System.out.println("Incorrect Browser Name!! Please provide correct browser name.");
			break;
		}

		getDriver().get(prop.getProperty("appUrl"));
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();

		return getDriver();

	}

	/**
	 * This method returns the current instance of ThreadLocal<WebDriver>
	 * 
	 * @return
	 */

	public static WebDriver getDriver() {
		return tlDriver.get();
	}

	private void getRemoteWebDriver(String browser) {
		System.out.println("Running tests on selenium grid server:::" + browser);

		try {
			switch (browser) {
			case "chrome":
				tlDriver.set(new RemoteWebDriver(new URL(prop.getProperty("huburl")), options.getChromeOptions()));
				break;
			case "firefox":
				tlDriver.set(new RemoteWebDriver(new URL(prop.getProperty("huburl")), options.getFirefoxOptions()));
				break;
			case "edge":
				tlDriver.set(new RemoteWebDriver(new URL(prop.getProperty("huburl")), options.getEdgeOptionsOptions()));
				break;
			default:
				System.out.println("Please pass correct browser for remote execution.." + browser);
				break;
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}
}
