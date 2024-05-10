package bulldoggy.app.appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
	private By username = By.name("username");
	private By password = By.name("password");
	private By loginBtn = By.xpath("//button[text()='Login']");
	
	private By bulldoggyImg = By.id("bulldoggy-logo");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void doLogin(String user, String pass) {
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(user);
		driver.findElement(loginBtn).click();
	}
}
