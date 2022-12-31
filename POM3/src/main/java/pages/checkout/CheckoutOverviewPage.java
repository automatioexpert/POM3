package pages.checkout;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.TestBase;
import pages.HomePage;

public class CheckoutOverviewPage extends TestBase {

	// CheckOut Overview

	public ArrayList<String> pricing = new ArrayList<String>();

	public String getProductDescription() {
		String productInfo = driver.findElement(By.cssSelector("div.inventory_item_name")).getText();

		return productInfo;
	}

	public void getAllProductDetails() {

		String price = driver.findElement(By.cssSelector("div.item_pricebar")).getText();
		List<WebElement> priceDetails = driver.findElements(By.cssSelector("div.summary_info>div"));

		for (WebElement prices : priceDetails) {
			pricing.add(prices.getText());
		}

		pricing.add(price);
	}

	public ArrayList<String> displayProductDetails() {

		return pricing;

	}

	public ThankYouPage finishPurchaseAndGoToThankYouPage() {
		driver.findElement(By.cssSelector("button#finish")).click();
		return new ThankYouPage();
	}

}
