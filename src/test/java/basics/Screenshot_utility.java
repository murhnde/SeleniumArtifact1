package basics;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Screenshot_utility {

	public  void captureSnap(WebDriver driver, String fileName) throws IOException {
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(fileName);
		Files.move(source, dest);
		System.out.println("File location is: " + dest.getAbsolutePath());
	}
	
	@Test
	public void callCaptureSnap() throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.navigate().to("https://google.com");
		Screenshot_utility obj = new Screenshot_utility();
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss.SSS").format(new Date());
		obj.captureSnap(driver, ".\\MyScreenshot\\"  + timeStamp  + "HomePage.png");
		driver.quit();
	}
	

}
