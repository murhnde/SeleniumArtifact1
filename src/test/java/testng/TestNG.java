package testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG {
@BeforeSuite
public void globalSetup() {
	System.out.println("calling before suite");
}
	
/* Sequence of TestNG annotation execution
 * @BeforeSuite
 * @BeforeClass
 * @BeforeMethod
 * @Test
 * @AfterMethod
 * @AfterClass
 * @AfterSuite 
 */

	@BeforeMethod
public void openURL() {
	System.out.println("opening url");
}
	
@AfterMethod	
public void teardown() {
System.out.println("closing the browser");	
}
	
@Test(priority=1, description="This test is for login")
	public void Login() {
		System.out.println("Method1");
	}

	@Test(enabled=true, priority=2)
	public void Homepage() {
		System.out.println("Method2");
		Assert.assertEquals(40, 30, "both are not matching");
	}
	
	
	
	@Test(dependsOnMethods="Homepage")
	public void method3() {
		System.out.println("Method3");
	}
	
	
	
	
}
