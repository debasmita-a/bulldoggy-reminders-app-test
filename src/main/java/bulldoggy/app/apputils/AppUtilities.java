package bulldoggy.app.apputils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppUtilities {

	private WebDriver driver;
	
	public AppUtilities(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void doElementClick(By locator) {
		getElement(locator).click();
	}
	
	public void doSendKeys(By locator, String keys) {
		getElement(locator).clear();
		getElement(locator).sendKeys(keys);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getElementText(By locator) {
		return getElement(locator).getText();
	}
	
	public boolean isElementPresent(By locator) {
		return getElement(locator).isDisplayed();
	}
	// WebDriver waits::
	
	public WebElement getElementWithWait(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
	}
}
