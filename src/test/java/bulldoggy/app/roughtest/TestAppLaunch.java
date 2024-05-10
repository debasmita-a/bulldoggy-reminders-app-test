package bulldoggy.app.roughtest;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import bulldoggy.app.rough.MainLaunchApp;

public class TestAppLaunch {
	
	
	@Test
	public void getTitle() {
		MainLaunchApp app = new MainLaunchApp();
		String title = app.launchApp();
		System.out.println(title);
		Assert.assertEquals(title, "Login | Bulldoggy reminders app");
	}
}
