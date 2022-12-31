package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage2;

public class HomePageTest extends TestBase {
	HomePage home;

	@Test
	public void homePageTest() {
		LoginPage2 login = new LoginPage2();
		login.login("standard_user", "secret_sauce");
		System.out.println("Login test passed");
		home = new HomePage();

		System.out.println(home.getLogo());
		Assert.assertTrue(home.getLogo(), "Home page Logo is not displayed");
		String product =home.getProductHeader();
		Assert.assertEquals(product, "PRODUCTS");
		
	
		
		System.out.println("homePageTest passed");
		
	}
	
	
	
	

}
