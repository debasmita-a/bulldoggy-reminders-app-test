package bulldoggy.app.rough;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MainLaunchApp {

	WebDriver driver;
	String title;

	public String launchApp() {

		ChromeOptions co = new ChromeOptions();
		co.setCapability("browserName", "chrome");

		EdgeOptions eo = new EdgeOptions();
		//eo.setCapability("browserName", "msedge");

		try {
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), eo);
			driver.get("http://host.docker.internal:8000/login");
			title = driver.getTitle();
			driver.quit();

		} catch (MalformedURLException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

		return title;

	}
}
