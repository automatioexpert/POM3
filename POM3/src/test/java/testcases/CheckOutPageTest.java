package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage2;

public class CheckOutPageTest extends TestBase {

	@Test
	public void checkOutTest() throws InterruptedException  {

		LoginPage2 login = new LoginPage2();
		login.login("standard_user", "secret_sauce");
		System.out.println("Login test passed");
		HomePage home = new HomePage();

		System.out.println(home.getLogo());
		Assert.assertTrue(home.getLogo(), "Home page Logo is not displayed");
		String product = home.getProductHeader();
		Assert.assertEquals(product, "PRODUCTS");

		System.out.println("homePageTest passed");
		
		home.selectProduct();
		home.navigateToCartPage();
		
		Thread.sleep(10000);
		System.out.println(driver.getTitle());
		
		
		

	}
}
