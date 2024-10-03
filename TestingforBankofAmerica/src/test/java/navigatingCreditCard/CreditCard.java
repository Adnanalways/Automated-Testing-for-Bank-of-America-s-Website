package navigatingCreditCard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreditCard {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver.get("https://www.bankofamerica.com/");
		
	}
	
	@Test
	public void TestCreditCardNavigation() {
		WebElement creditCardLink= driver.findElement(By.linkText("Credit Cards"));
		creditCardLink.click();
		
		// validate the page title after navigation
		String expectedURL="https://www.bankofamerica.com/credit-cards/";
		String actualUrL=driver.getCurrentUrl();
		Assert.assertEquals(actualUrL.contains(expectedURL),"Navigated to incorrect URL for Credit Cards");
	}
	@Test
	public void testNavigation() {
		WebElement personalBangkingLink= driver.findElement(By.linkText("personal Banking"));
		personalBangkingLink.click();
		
		String expectedTitle="Bank of America -personal Bangking";
		Assert.assertTrue(driver.getTitle().contains(expectedTitle),"Navigated to incorrect Personal Banking page");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
    


