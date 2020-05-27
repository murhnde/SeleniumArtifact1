package waitMechanism;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
// explicit	
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstnameA")));
		element.sendKeys("test");
		
//fluent		
//		System.out.println("Fluent");
//		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
//				.withTimeout(5, TimeUnit.SECONDS)
//				.pollingEvery(2, TimeUnit.SECONDS)
//				.ignoring(NoSuchElementException.class);
//		WebElement element1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstnamew")));
//		
	}

}
