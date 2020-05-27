package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30,  TimeUnit.SECONDS);
	driver.get("https://classic.crmpro.com/index.html");
}
	
	
	@DataProvider
	public Object [][] getLoginData() {
		
		Object [][] data=new Object[2][2];
		data [0][0]= "user1";
		data [0][1]= "password1";
		data [1][0]= "user2";
		data [1][1]= "password2";
		return data;
	}
	
	@Test(dataProvider="getLoginData")
	public void setCredentials(String uname, String password) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
}