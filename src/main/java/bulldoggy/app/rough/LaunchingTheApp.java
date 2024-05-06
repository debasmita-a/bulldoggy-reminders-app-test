package bulldoggy.app.rough;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchingTheApp {

	

	public static void main(String[] args) throws MalformedURLException {
		
		ChromeOptions eo = new ChromeOptions();

		
		//eo.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), eo);

		driver.get("http://localhost:8000/login");
		//driver.get("https://google.com");

		driver.quit();
	}

}
