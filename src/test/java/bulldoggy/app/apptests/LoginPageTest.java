package bulldoggy.app.apptests;

import org.testng.Assert;
import org.testng.annotations.Test;

import bulldoggy.app.basetest.AppBaseTest;
import bulldoggy.app.constants.AppConstants;

public class LoginPageTest extends AppBaseTest{
	
	@Test
	public void getTitleTest() {
		Assert.assertEquals(loginPage.getTitle(), AppConstants.APP_LOGIN_TITLE);
	}
	
	@Test
	public void isAppLogoPresentTest() {
		Assert.assertTrue(loginPage.isAppLogoPresent());
	}
	
	@Test
	public void getHeaderTextTest() {
		Assert.assertEquals(loginPage.getHeaderText(), AppConstants.APP_HEADER);
	}
	
}
