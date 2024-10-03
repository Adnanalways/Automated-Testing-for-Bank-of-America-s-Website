package titleandurl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyHomepage {
	WebDriver driver;
	
	@BeforeMethod
	public void setup () {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.bankofamerica.com/");
	}
	
	@Test
	public void verifyHomepageTitleAndURL() {
		//verify Home page title
		String expectedTitle="Bank of America - Banking, Credit Cards, Loans and Merrill Investing";
	    String actualTitle=driver.getTitle();
	    Assert.assertEquals(actualTitle, expectedTitle);
	    
	    //verify URL
	    String expectedURL="https://www.bankofamerica.com/";
	    String actualURL=driver.getCurrentUrl();
	    Assert.assertEquals(actualURL, expectedURL);
	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
