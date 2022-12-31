package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.TestBase;

public class LoginPage2 extends TestBase{

	/*
	 * public WebDriver driver;
	 * 
	 * //Create a constructor and initialize the global driver for this class
	 * 
	 * public LoginPage(WebDriver driver) { this.driver=driver;
	 * System.out.println("Cons called and driver initialized : "+driver); }
	 */
	public WebElement getLogo() {

		return driver.findElement(By.cssSelector("div.login_logo"));
	}

	public HomePage login(String username, String password) {

		driver.findElement(By.cssSelector("input#user-name")).sendKeys(username);
		driver.findElement(By.cssSelector("input#password")).sendKeys(password);
		driver.findElement(By.cssSelector("input#login-button")).click();
		
		return new HomePage();

	}

	public void getPassword() {

	}

}
