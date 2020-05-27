package mousehandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		Actions action=new Actions(driver);
		//action.contextClick();//provide id/name/xpath in the () of the element you want to right click
		driver.get("https://www.spicejet.com");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		//driver.switchTo().frame(0);
		driver.findElement(By.linkText("SpiceMax")).click();
		////*[@id="header-addons"]/ul/li[2]/a
		Thread.sleep(5000);
	}

}
