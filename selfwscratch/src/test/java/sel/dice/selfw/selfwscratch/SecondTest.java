package sel.dice.selfw.selfwscratch;

import org.testng.annotations.Test;


public class SecondTest extends BaseTest{
	
	@Test
	public void secondTestMethod()
	{

        System.setProperty("webdriver.gecko.driver", System.getProperty("user.home")+"/git/masteringseleniumtestngnew/src/resources/geckodriver");
        //WebDriver driver = new FirefoxDriver();
        driver.get("http://www.linkedin.com");
        System.out.println("linkedin opened");
    }

}
