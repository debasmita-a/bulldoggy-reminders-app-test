package bulldoggy.app.basetest;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import bulldoggy.app.appPages.LoginPage;
import bulldoggy.app.appPages.RemindersPage;
import bulldoggy.app.driverfactory.ConfigFileReader;
import bulldoggy.app.driverfactory.WebDriverFactory;

public class AppBaseTest {

	protected WebDriver driver;
	protected Properties prop;
	protected WebDriverFactory driverFactory;
	protected ConfigFileReader configReader;

	protected LoginPage loginPage;
	protected RemindersPage remindersPage;
	
	@BeforeTest
	public void setup() {
		driverFactory = new WebDriverFactory();
		configReader = new ConfigFileReader();
		prop = configReader.getProp();
		
		if(Boolean.parseBoolean(prop.getProperty("remote"))) {
			driver = driverFactory.getRemoteWebDriver(prop);
		}else {
			driver = driverFactory.getWebDriver(prop);
		}
		
		loginPage = new LoginPage(driver);
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
