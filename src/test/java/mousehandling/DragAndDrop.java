package mousehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement dragItem=driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement dropLocation=driver.findElement(By.xpath("//*[@id='droppable']"));
		
		Actions obj=new Actions(driver);//Actions is a Java class, especially used for Mouse actions(drag and drop)
		
		obj.clickAndHold(dragItem).moveToElement(dropLocation).release().build().perform();
		
		Thread.sleep(10000);
		
		//driver.quit();

	}

}
