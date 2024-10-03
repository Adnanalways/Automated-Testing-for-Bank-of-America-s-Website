package testingLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingLoginForm {
	WebDriver driver;

	
	@BeforeMethod
	public void setup() {
		driver.get("https://www.bankofamerica.com/");
	}
	
	@Test
	public void testLoginForm() {
		WebElement userField= driver.findElement(By.id("onlineId1"));
		WebElement passField= driver.findElement(By.id("passcode1"));
		
		Assert.assertTrue(userField.isDisplayed(),"Username dield is not displyed");
	    Assert.assertTrue(passField.isDisplayed(),"Password field is not displyed");
	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
