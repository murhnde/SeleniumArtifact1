package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j {

	public static void main(String[] args) {
		Logger log0 = Logger.getLogger(Log4j.class.getName());
		Logger log1 = Logger.getLogger("Log4j");
		String path = System.getProperty("user.dir")+"/src/test/java/log4j/log4j.properties";
		PropertyConfigurator.configure(path);
		WebDriver driver = new ChromeDriver();
		log1.info("Chrome is launched");
		log0.info("Launched my browser chrome");
		log0.warn("Warn");
		log0.fatal("Fatal error");
		log0.debug("Debug error");
		
		driver.close();
		
	}

}
