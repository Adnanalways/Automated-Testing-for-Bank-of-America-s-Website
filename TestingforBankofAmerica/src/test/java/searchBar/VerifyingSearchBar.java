package searchBar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyingSearchBar {
	 WebDriver driver;
	 
	 @BeforeMethod
	 public void setUp() {
		 driver.get("https://www.bankofamerica.com/");
	 }
	 
	 @Test
	 public void testSearchBarPresence() {
		 WebElement searchBar= driver.findElement(By.name("query"));
		 Assert.assertTrue(searchBar.isDisplayed(),"Search bar is not displayed");
	 }
	 
	 @Test
	 public void testContactUsLink() {
		WebElement contactUsLink= driver.findElement(By.linkText("Contact Us"));
	    contactUsLink.click();
	    
	    // Verify the URL contains 'contact-us'
	    String expectedURL="contact-us";
	    String actualURL=driver.getCurrentUrl();
	    Assert.assertTrue(actualURL.contains(expectedURL),"Contact Us link did not navigate to the correct page");
	 }
	 
	 @AfterMethod
	 public void teardown() {
		 driver.quit();
	 }
	 

}
