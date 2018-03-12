package selenium_api;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_01_CheckEnvironment {
	WebDriver driver;

	
	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		//open http://live.guru99.com/
		driver.get("http://live.guru99.com/");
		//Wait 15s for loading
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Zoom in browser
		driver.manage().window().maximize();
	}

	@Test
	public void TC_01() {
		// Verify title
		String homePageTitle = driver.getTitle();
		Assert.assertEquals("Home page", homePageTitle);
				
	}

	@AfterClass
	public void afterClass() {
		//close browser
		driver.quit();
	}
	
	//Test					  
	
	
	
}
	