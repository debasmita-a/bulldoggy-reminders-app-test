package bulldoggy.app.appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import bulldoggy.app.apputils.AppUtilities;

public class RemindersPage {

	private WebDriver driver;
	private AppUtilities util;
	
	public RemindersPage(WebDriver driver) {
		this.driver = driver;
		util = new AppUtilities(driver);
	}
	
	private By header = By.id("bulldoggy-title");
	private By remindersMsg = By.xpath("//div[@class='title-card-right']/p");
	private By logoutBtn = By.xpath("//button[text()='Logout']");
	
	private By reminderListsHeader = By.xpath("//h3[text()='Reminder Lists']");
	
	private By reminderList = By.xpath("//div//p[@hx-target='.reminders-content']");
	private By editBtn = By.xpath("//div//img[contains(@hx-get,'list-row-edit') and @hx-trigger='click']");
	private By deleteBtn = By.xpath("//div//img[contains(@hx-delete,'list-row') and @hx-trigger='click']");
	
	private By listHeader = By.xpath("(//div//h3[@class='reminders-card-title'])[2]");
	private By listItems = By.xpath("//div[@class='reminders-item-list']//p[contains(@hx-patch,'item-row-strike')]");
	private By completedList = By.xpath("//div[contains(@class,'completed')]");
}
