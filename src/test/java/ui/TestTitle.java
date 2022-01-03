package ui;

import org.testng.annotations.Test;

import common.CommonData;

import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTitle extends CommonData{
	
	@Test
	public void voidTitleTest () {
		// TODO Auto-generated method stub
		
		String actualTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String expectedTitle = driver.getTitle();
		
		AssertJUnit.assertEquals(actualTitle, expectedTitle);
		driver.manage().window().maximize();
		driver.close();
		
	}

}
