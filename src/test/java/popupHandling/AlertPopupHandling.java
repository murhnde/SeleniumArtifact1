package popupHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		
		Alert alert1=driver.switchTo().alert();
		
		System.out.println(alert1.getText());
		
		String s1=alert1.getText();
		
		if (s1.equals("Please enter a valid user nam")) {
			System.out.println("Alert message is successful");
			alert1.accept();
		}
		else
		{
			System.out.println("Message is incorrect");
		}
	
		
		
		
		
		driver.quit();
		

	}

}
