package bulldoggy.app.rough;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchingTheApp {

	public static void main(String[] args) throws MalformedURLException {
          ChromeOptions co = new ChromeOptions();
          co.setCapability("browserName", "chrome");
          
          FirefoxOptions fo = new FirefoxOptions();
          fo.setCapability("browserName", "firefox");
          
          EdgeOptions eo = new EdgeOptions();
          eo.setCapability("browserName", "edge");
          
          WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), eo);
          driver.get("http://host.docker.internal:8000/login");
          System.out.println(driver.getTitle());
         
          driver.quit();
	}
}
