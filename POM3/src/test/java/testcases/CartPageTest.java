package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage2;
import pages.checkout.CartPage;

public class CartPageTest extends TestBase {

	@Test
	public void productCheckOutTest() throws InterruptedException {

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

		Thread.sleep(6000);
		System.out.println(driver.getTitle());

		// Cart Page
		CartPage cart = new CartPage();
		System.out.println(cart.getYourCartHeader());
		System.out.println(cart.getItemName());
		System.out.println(cart.getItemQuantity());

		cart.goToCheckOutPage();
		System.out.println("Navigated to check out page");

	}

}
