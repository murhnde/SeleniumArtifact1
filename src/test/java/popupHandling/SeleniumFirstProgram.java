package popupHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumFirstProgram {


	@Test
	public void openURL() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("Test");
		Thread.sleep(5000);
		///html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button
		
		////*[@id="searchbox"]/button
		
		//#searchbox > button
		
		driver.findElement(By.xpath("//*[@id='searchbox']/button")).click();
		Thread.sleep(5000);
		
		driver.close();
	}
	

}
