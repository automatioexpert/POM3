package pages.checkout;

import org.openqa.selenium.By;

import base.TestBase;

public class ThankYouPage extends TestBase {

	public String getCompleteStatus() {

		String status = driver.findElement(By.cssSelector("span.title")).getText();

		return status;

	}

	public String getThankYouMessage() {

		return driver.findElement(By.cssSelector("h2.complete-header")).getText();
	}

	public String getDispatchMessage() {

		return driver.findElement(By.cssSelector("div.complete-text")).getText();
	}

	public boolean getPonyExpressLogoStatus() {
		return driver.findElement(By.cssSelector("img[alt='Pony Express']")).isDisplayed();
	}

	public void navigateBackToProducts() {
		driver.findElement(By.cssSelector("button#back-to-products")).click();
	}

}
