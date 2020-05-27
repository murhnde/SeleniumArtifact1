package popupHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class PopUpWindowHandling {
	
	@Test
	
	public void popup() throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.popuptest.com/goodpopups.html");
	driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[1]")).click();
	
	
	Thread.sleep(5000);
	Set<String> handler = driver.getWindowHandles();
	Iterator<String> itr = handler.iterator();
	String parent = itr.next();
	System.out.println("Parent window handle "+parent);
	System.out.println(driver.getTitle());
	
	String child = itr.next();
	System.out.println("Child window handle "+child);
	driver.switchTo().window(child);
//	driver.close();
driver.quit();	
//	driver.switchTo().window(parent);
//	driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[1]")).click();
//	System.out.println(driver.getTitle());
//	driver.switchTo().window(parent);
//	System.out.println(driver.getTitle());
//	
//	driver.quit();
	}

}
