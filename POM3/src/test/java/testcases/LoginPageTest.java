package testcases;

import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage2;

public class LoginPageTest extends TestBase {

	@Test
	public void loginTest() throws InterruptedException {

		LoginPage2 login = new LoginPage2();
		login.login("standard_user", "secret_sauce");
		System.out.println("Login test passed");
		Thread.sleep(4000);
		driver.quit();

	}

}
