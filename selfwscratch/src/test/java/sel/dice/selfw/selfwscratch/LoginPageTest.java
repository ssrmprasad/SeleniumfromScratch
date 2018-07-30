package sel.dice.selfw.selfwscratch;

import org.dice.pages.LoginPage;
import org.dice.pages.ProfilePage;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{
	
	@Test
	public void positiveLoginTest()
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.openLoginPage();
		loginPage.fillUpEmailAndPassword("rangaprasad.sanga@gmail.com", "rf0rRanga");
		ProfilePage profilePage = loginPage.pushSignInButton();
	}

}
