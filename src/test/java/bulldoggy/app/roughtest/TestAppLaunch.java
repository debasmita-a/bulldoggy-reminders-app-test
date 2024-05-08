package bulldoggy.app.roughtest;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import bulldoggy.app.rough.LaunchApp;

public class TestAppLaunch {
	
	@Parameters({"browser"})
	@Test(invocationCount=10)
	public void getTitle(String browserName) {
		LaunchApp app = new LaunchApp();
		String title = app.launchApp();
		System.out.println(title);
		Assert.assertEquals(title, "Login | Bulldoggy reminders app");
	}
}
