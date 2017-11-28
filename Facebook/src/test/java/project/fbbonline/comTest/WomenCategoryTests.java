package project.fbbonline.comTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WomenCategoryTests {
	public  WebDriver driver;

	@Test
	public void openbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://facebook.com");
		//driver.findElement(By.id("lst-ib")).sendKeys("tutorial");
		driver.findElement(By.id("//*[@id=\"js_0\"]/table/tbody/tr[1]/td[4]/a")).click();
		System.out.println("Current Page Title is : " + driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println("Back Page Title is : " + driver.getCurrentUrl());
		
		driver.findElement(By.id("id_of_checkbox")).isSelected();
	}

}
