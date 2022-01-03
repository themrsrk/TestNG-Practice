package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RetryTestCase {
	public static WebDriver driver;
	
	public static String browser = "chrome";
	
	
	@Test (retryAnalyzer=common.Retry.class) //Thats how you can bind your class with retry method which is in common
	public void LaunchApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		Assert.assertTrue(false);
	}
}
