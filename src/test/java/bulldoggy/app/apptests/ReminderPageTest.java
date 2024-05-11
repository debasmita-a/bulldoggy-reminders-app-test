package bulldoggy.app.apptests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bulldoggy.app.basetest.AppBaseTest;

public class ReminderPageTest extends AppBaseTest{

	@BeforeClass
	public void reminderPageSetup() {
		remindersPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void getTitleTest() {
		
	}
	
	@Test
	public void isAppLogoPresentTest() {
		
	}
	
	@Test
	public void getHeaderTextTest() {
		
	}
	
	@Test
	public void getRemindersMsgTest() {
		
	}
	
	@Test
	public void isLogoutBtnAvailableTest() {
		
	}
	
	@Test
	public void getReminderListsHeaderTextTest() {
		
	}
	
	@Test
	public void getReminderListsTest() {
		
	}
	
	@Test
	public void addReminderListTest() {
		
	}
	
	@Test
	public void deleteReminderListTest() {
		
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
