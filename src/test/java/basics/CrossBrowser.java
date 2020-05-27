package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver driver;

	@Test
	@Parameters("browser")
	public void startBrowser(String browserName)
	{
		if 		(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
			
		}
		else if(browserName.equalsIgnoreCase("firefox"))
				{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			
		}
		else if (browserName.equalsIgnoreCase("IE"))
				{
			System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
//	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//	driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
	}

}
