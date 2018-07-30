package sel.dice.selfw.selfwscratch;

import org.testng.annotations.Test;

public class FirstClass extends BaseTest {
	
	@Test
	public void firstTestMethod()
	{

        
        driver.get("http://www.dice.com");
        System.out.println("Diceopened");
    }

	
}
