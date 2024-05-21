package bulldoggy.app.apptests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import bulldoggy.app.basetest.AppBaseTest;
import bulldoggy.app.constants.AppConstants;

public class ReminderPageTest extends AppBaseTest{

	@BeforeClass
	public void reminderPageSetup() {
		remindersPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void getTitleTest() {
		Assert.assertEquals(remindersPage.getTitle(), AppConstants.APP_REMINDERS_TITLE);
	}
	
	@Test
	public void isAppLogoPresentTest() {
		Assert.assertTrue(remindersPage.isAppLogoPresent());
	}
	
	@Test
	public void getHeaderTextTest() {
		Assert.assertEquals(remindersPage.getHeaderText(), AppConstants.APP_HEADER);
	}
	
	@Test
	public void getRemindersMsgTest() {
		Assert.assertEquals(remindersPage.getRemindersMsg(), AppConstants.REMINDER_HEADER);
	}
	
	@Test
	public void isLogoutBtnAvailableTest() {
		Assert.assertTrue(remindersPage.isLogoutBtnAvailable());
	}
	
	@Test
	public void getReminderListsHeaderTextTest() {
		Assert.assertEquals(remindersPage.getReminderListsHeaderText(), AppConstants.REMINDER_LIST_HEADER);
	}
	
	@Test
	public void getReminderListsTest() {
		System.out.println(remindersPage.getReminderLists());
	}
	
	@DataProvider
	public Object[][] addNewReminerListData() {
		return new Object[][] {
			{"New List 1"},
			{"New List 2"},
			{"New List 3"},
			{"New List 4"}
		};
	}
	
	@Test(dataProvider="addNewReminerListData")
	public void addReminderListTest(String data) {
		remindersPage.addReminderList(data);
	}
	
	@Test
	public void deleteReminderListTest() {
		//remindersPage.addReminderList("New List to delete");
		remindersPage.deleteReminderList();
	}
	
	@Test
	public void updateReminderListTest() {
		
	}
	
	@Test
	public void getRemindersForReminderListTest() {
		
	}
	
	@Test
	public void addReminderTest() {
		
	}
	
	@Test
	public void deleteReminderTest() {
		
	}
	
	@Test
	public void updateReminderTest() {
		
	}
	
	@Test
	public void strikeReminderTest() {
		
	}
	
	@Test
	public void getCompletedRemindersTest() {
		
	}
}
