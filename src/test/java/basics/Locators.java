package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Locators {
	/*public Locators(WebElement findElement) {
		// TODO Auto-generated constructor stub
	}*/

	@Test
	public void learnLocators() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
		Thread.sleep(5000);
		driver.findElement(By.id("firstname")).sendKeys("Murali");
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Murali");
		driver.findElement(By.name("lastname")).sendKeys("Hari");
		driver.findElement(By.id("address1")).sendKeys("813 cowboys");
		driver.findElement(By.name("address2")).sendKeys("3045 Triving");
		driver.findElement(By.id("city")).sendKeys("Dallas");
		driver.findElement(By.id("zip")).sendKeys("75089");
		/*Locators listbox=new Locators();
		listbox.driver.findElement(By.id("state"));*/
		
		WebElement listbox = driver.findElement(By.id("state"));
		Select selectedState=new Select(listbox);
		selectedState.selectByIndex(1);
		Thread.sleep(3000);
		selectedState.selectByVisibleText("Texas");
				
		
		

		Thread.sleep(5000);
		
		driver.close(); //it closes only the browser where the control is
		driver.quit();//it closes all the browsers instances
		
		
	}

}
