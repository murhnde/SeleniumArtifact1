package basics;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.util.TimeUtils;

public class Navigation {
	
	@Test
		public void myBasics() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
		Thread.sleep(5000);
		driver.navigate().to("https://google.com");
		Thread.sleep(5000);
//		driver.navigate().back();
//		Thread.sleep(5000);
//		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());//to print page title
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandle());
		
		
//		assert.assertEquals(driver.getTitle(), "google");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Google");
		
		//capturing the screenshot
		
	
		driver.quit();
		
	}	
	
	
	

}
