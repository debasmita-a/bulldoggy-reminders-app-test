package bulldoggy.app.appPages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import bulldoggy.app.apputils.AppUtilities;

public class RemindersPage {

	private WebDriver driver;
	private AppUtilities util;
	
	public RemindersPage(WebDriver driver) {
		this.driver = driver;
		util = new AppUtilities(driver);
	}
	
	private By header = By.id("bulldoggy-title");
	private By bulldoggyImg = By.id("bulldoggy-logo");
	private By remindersMsg = By.xpath("//div[@class='title-card-right']/p");
	private By logoutBtn = By.xpath("//button[text()='Logout']");
	
	private By reminderListsHeader = By.xpath("//h3[text()='Reminder Lists']");
	
	private By reminderList = By.xpath("//div//p[@hx-target='.reminders-content']");
	private By editBtn = By.xpath("//div//img[contains(@hx-get,'list-row-edit') and @hx-trigger='click']");
	private By deleteBtn = By.xpath("//div//img[contains(@hx-delete,'list-row') and @hx-trigger='click']");
	
	private By listHeader = By.xpath("(//div//h3[@class='reminders-card-title'])[2]");
	private By listItems = By.xpath("//div[@class='reminders-item-list']//p[contains(@hx-patch,'item-row-strike')]");
	private By completedList = By.xpath("//div[contains(@class,'completed')]");
	
	public String getTitle() {
		return util.getPageTitle();
	}
	
	public boolean isAppLogoPresent() {
		return util.isElementPresent(bulldoggyImg);
	}
	
	public String getHeaderText() {
		return util.getElementText(header);
	}
	
	public String getRemindersMsg() {
		return util.getElementText(remindersMsg);
	}
	
	public boolean isLogoutBtnAvailable() {
		return util.isElementPresent(logoutBtn);
	}
	
	public String getReminderListsHeaderText() {
		return util.getElementText(reminderListsHeader);
	}
	
	public List<String> getReminderLists(){
		List<String> reminders = new ArrayList<>();
		for(WebElement ele : util.getElements(reminderList)) {
			reminders.add(ele.getText());
		}
		return reminders;
	}
	//data provider -- list of reminder list -- add
	public void addReminderList() {
		
	}
	//data provider -- list of reminder list -- 1. add 2.delete
	public void deleteReminderList() {
		
	}
	//data provider -- list of reminder list -- 1. add 2.update 3.delete
	public void updateReminderList() {
		
	}
	//data provider -- list of reminder list -- 1. add, 2.print list, 3. delete
	public void getRemindersForReminderList() {
		
	}
	//data provider -- list of reminder list -- 1. add ; list of reminders for each list -- 1. add
	public void addReminder() {
		
	}
	//data provider -- list of reminder list -- 1. add ; list of reminders for each list -- 1. add, 2. delete
	public void deleteReminder() {
		
	}
	//data provider -- list of reminder list -- 1. add ; list of reminders for each list -- 1. add, 2. update
	public void updateReminder() {
		
	}
	//data provider -- list of reminder list -- 1. add ; list of reminders for each list -- 1. add, 2. strike
	public void strikeReminder() {
		
	}
	//data provider -- list of reminder list -- 1. add ; list of reminders for each list -- 1. add, 2. strike, 3.print reminders
	public void getCompletedReminders() {
		
	}
}
