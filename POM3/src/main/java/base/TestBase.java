package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;

	public TestBase() {

		if (driver == null) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	}
	
	@AfterMethod
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}

}
