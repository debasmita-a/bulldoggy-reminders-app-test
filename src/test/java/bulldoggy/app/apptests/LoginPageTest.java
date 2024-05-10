package bulldoggy.app.apptests;

import org.testng.Assert;
import org.testng.annotations.Test;

import bulldoggy.app.basetest.AppBaseTest;

public class LoginPageTest extends AppBaseTest{

	@Test
	public void doLoginTest() {
		loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
}
