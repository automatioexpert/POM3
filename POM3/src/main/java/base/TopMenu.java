package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopMenu  {

	public WebDriver driver;
	
	public TopMenu(WebDriver driver) {
		System.out.println("Top menu constructor called");
		this.driver=driver;
	}

	public void openMenu() {

		driver.findElement(By.cssSelector("button#react-burger-menu-btn")).click();

	}

	public void closeMenu() {
		driver.findElement(By.cssSelector("button#react-burger-cross-btn")).click();
	}

	// Select any option from Menu
	public void openAllItems() {
		driver.findElement(By.cssSelector("nav.bm-item-list>a:nth-child(1)")).click();
	}

	public void openAbout() {
		driver.findElement(By.cssSelector("nav.bm-item-list>a:nth-child(2)")).click();
	}

	public void openLogOut() {
		driver.findElement(By.cssSelector("nav.bm-item-list>a:nth-child(3)")).click();
	}

	public void openAppState() {
		driver.findElement(By.cssSelector("nav.bm-item-list>a:nth-child(4)")).click();
	}

}
