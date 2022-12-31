package pages.checkout;

import org.openqa.selenium.By;

import base.TestBase;

public class CartPage extends TestBase {

	public String getYourCartHeader() {

		return driver.findElement(By.cssSelector("span.title")).getText();

	}

	public int getItemQuantity() {
		return Integer.parseInt(driver.findElement(By.cssSelector("div.cart_quantity")).getText());
	}

	public String getItemName() {

		return driver.findElement(By.cssSelector("div.inventory_item_name")).getText();
	}

	public CheckoutInfoPage goToCheckOutPage() {
		driver.findElement(By.cssSelector("[name='checkout']")).click();
	
		return new CheckoutInfoPage();
	
	}
	
}
