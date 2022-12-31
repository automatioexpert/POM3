package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import base.TopMenu;
import pages.HomePage;
import pages.LoginPage2;
import pages.checkout.CartPage;
import pages.checkout.CheckoutInfoPage;
import pages.checkout.CheckoutOverviewPage;
import pages.checkout.ThankYouPage;

public class CheckOverviewPageTest extends TestBase {

	@Test
	public void checkOutOverviewTest() throws InterruptedException {
	/**	LoginPage2 login = new LoginPage2();
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

		// Checkout info page:
		CheckoutInfoPage info = new CheckoutInfoPage();
		info.enterCustomerDetails("truson", "steswat", "82382323228");
		info.goToCheckOutOverviewPage();

		// Product overview page Test
		CheckoutOverviewPage prodOverview = new CheckoutOverviewPage();
		prodOverview.getAllProductDetails();
		System.out.println(prodOverview.displayProductDetails());
		prodOverview.finishPurchase();
		System.out.println("CheckoutOverviewPage test passed");

		// Navigate to About page
		//TopMenu top = new TopMenu(driver);
		//top.openAbout();
		System.out.println(driver.getTitle());

	//	System.out.println("Navigate to About");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(8000);
		
		//Thank You Page
		
		ThankYouPage thanks = new ThankYouPage();
		System.out.println(thanks.getCompleteStatus());
		System.out.println(thanks.getDispatchMessage());
		System.out.println(thanks.getPonyExpressLogoStatus());
		System.out.println(thanks.getThankYouMessage());
		thanks.navigateBackToProducts();
		Thread.sleep(4000);
		System.out.println("Navigate to Produts Page from Thank You Page...Test passed..Thank You Vishwakarma Bhagwan..!!!");
		
		
		//Go to About page now
		TopMenu menu = new TopMenu(driver);
		menu.openMenu();
		menu.openAbout();
		System.out.println("Navigate to About");
		System.out.println("End to End testing completed..Thanks!!!"); **/
		
	System.out.println("======================JAI BABA VISHWAKARMA JI===================");
	
	LoginPage2 login = new LoginPage2();
	HomePage home=login.login("standard_user", "secret_sauce");
	System.out.println("Login test passed");
	//HomePage home = new HomePage();
	System.out.println(home.getLogo());
	Assert.assertTrue(home.getLogo(), "Home page Logo is not displayed");
	String product = home.getProductHeader();
	Assert.assertEquals(product, "PRODUCTS");

	System.out.println("homePageTest passed");
	home.selectProduct();
	CartPage cart =home.navigateToCartPage();
	Thread.sleep(6000);
	System.out.println(driver.getTitle());

	// Cart Page
	//CartPage cart = new CartPage();
	System.out.println(cart.getYourCartHeader());
	System.out.println(cart.getItemName());
	System.out.println(cart.getItemQuantity());
	CheckoutInfoPage info =cart.goToCheckOutPage();
	System.out.println("Navigated to check out page");

	// Checkout info page:
	//CheckoutInfoPage info = new CheckoutInfoPage();
	info.enterCustomerDetails("truson", "steswat", "82382323228");
	CheckoutOverviewPage prodOverview=	info.goToCheckOutOverviewPage();

	// Product overview page Test
	//CheckoutOverviewPage prodOverview = new CheckoutOverviewPage();
	prodOverview.getAllProductDetails();
	System.out.println(prodOverview.displayProductDetails());
	ThankYouPage thanks =prodOverview.finishPurchaseAndGoToThankYouPage();
	System.out.println("CheckoutOverviewPage test passed");

	// Navigate to About page
	//TopMenu top = new TopMenu(driver);
	//top.openAbout();
	System.out.println(driver.getTitle());

//	System.out.println("Navigate to About");
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(8000);
	
	//Thank You Page
	
	//ThankYouPage thanks = new ThankYouPage();
	System.out.println(thanks.getCompleteStatus());
	System.out.println(thanks.getDispatchMessage());
	System.out.println(thanks.getPonyExpressLogoStatus());
	System.out.println(thanks.getThankYouMessage());
	thanks.navigateBackToProducts();
	Thread.sleep(4000);
	System.out.println("Navigate to Produts Page from Thank You Page...Test passed..Thank You Vishwakarma Bhagwan..!!!");
	
	
	//Go to About page now
	TopMenu menu = new TopMenu(driver);
	menu.openMenu();
	menu.openAbout();
	System.out.println("Navigate to About");
	System.out.println("End to End testing completed..Thanks!!!");

	
	
	}
}
