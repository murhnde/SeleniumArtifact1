package basics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Screenshot {
	
		@Test
		
	public void screenshot1() throws IOException{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver= new ChromeDriver();	
			driver.manage().window().maximize();
			driver.navigate().to("https://google.com");
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE) ;//TakesScreenshot is an interface. 
			Files.copy(source, new File(".\\MyScreenshot\\screenshot1.png"));
			driver.quit();
			
			
		}
		



}
