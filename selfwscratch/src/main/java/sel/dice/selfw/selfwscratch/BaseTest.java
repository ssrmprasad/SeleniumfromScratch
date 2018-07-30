package sel.dice.selfw.selfwscratch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void methodSetUp()
	{
		System.out.println("Method Set up");
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.home")+"/git/masteringseleniumtestngnew/src/resources/geckodriver");
        
		driver = new FirefoxDriver();
		
	}
	
	@AfterMethod
	public void methodTearDown()
	{
		System.out.println("Method Tear Down");
		driver.quit();
	}

}
