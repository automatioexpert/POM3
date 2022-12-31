package utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uitlity {
	public static WebDriver driver;
	public void screenShot() {
		
		driver = new ChromeDriver();
		
		TakesScreenshot src=(TakesScreenshot) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	//	FileUtils.copyFile(src, new File("//src/test/resources/image.png"));
	}

}
