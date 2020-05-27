package waitMechanism;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
		
		
		try {
		driver.findElement(By.name("firstname1")).sendKeys("test");
		} catch(NoSuchElementException ex) {
			System.out.println("First name is not found");
		}
		
		
		System.out.println("Checking 2nd element");
		
		try {
			driver.findElement(By.name("lastname1")).sendKeys("test");
			} catch(NoSuchElementException ex) {
				System.out.println("Last name is not found");
			}
		
		
		
	}

}
