package bulldoggy.app.appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import bulldoggy.app.apputils.AppUtilities;

public class LoginPage {

	private WebDriver driver;
	private AppUtilities util;
	
	private By username = By.name("username");
	private By password = By.name("password");
	private By loginBtn = By.xpath("//button[text()='Login']");
	
	private By bulldoggyImg = By.id("bulldoggy-logo");
	private By header = By.xpath("//h1");
	
	private By logoutMsg = By.xpath("//div[@class='invalid-login-warning']/p");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		util = new AppUtilities(driver);
	}
	
	public String getTitle() {
		return util.getPageTitle();
	}
	
	public boolean isAppLogoPresent() {
		return util.isElementPresent(bulldoggyImg);
	}
	
	public String getHeaderText() {
		return util.getElementText(header);
	}
	
	public String getLogoutMsg() {
		return util.getElementText(logoutMsg);
	}
	
	public RemindersPage doLogin(String user, String pass) {
		util.doSendKeys(username, user);
		util.doSendKeys(password, pass);
		util.doElementClick(loginBtn);
		
		return new RemindersPage(driver);
	}
}
