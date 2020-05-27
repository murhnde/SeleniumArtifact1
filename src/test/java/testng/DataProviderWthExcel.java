package testng;

import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWthExcel {
	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://classic.crmpro.com/index.html");
	}

	@DataProvider
	public Object[][] getLoginDatafronExcel() throws InvalidFormatException {
		Object[][] data = ReadExcelUtil.getData("Sheet1");

		return data;
	}

	@Test(dataProvider = "getLoginDatafronExcel")
	public void setCredentials(String uname, String password) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		Thread.sleep(3000);
		driver.quit();
	}

}
