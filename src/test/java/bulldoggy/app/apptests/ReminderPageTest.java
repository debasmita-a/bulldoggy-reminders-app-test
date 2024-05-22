package bulldoggy.app.apptests;

import java.util.ArrayList;
import java.util.Arrays;

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
		remindersPage.addReminderList("New List to delete");
		remindersPage.deleteReminderList();
	}
	
	@DataProvider
	public Object[][] updateReminderListData(){
		return new Object[][] {
			{"New List added", "New List updated"}
		};
	}
	
	@Test(dataProvider="updateReminderListData")
	public void updateReminderListTest(String added, String updated) {
		remindersPage.addReminderList(added);
		Assert.assertEquals(remindersPage.updateReminderList(updated), updated);
	}
	
	@Test
	public void getRemindersForReminderListTest() {

	}
	
	@Test
	public void addReminderTest() {
		remindersPage.addReminderList("new list");
		remindersPage.addReminder(Arrays.asList("new reminder 1", "new reminder 2"));
	}
	
	@Test
	public void deleteReminderTest() {
		remindersPage.addReminderList("new list");
		remindersPage.addReminder(Arrays.asList("new reminder 1", "new reminder 2"));
		remindersPage.deleteReminder();
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
