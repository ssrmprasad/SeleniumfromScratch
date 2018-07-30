package org.dice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import sel.dice.selfw.selfwscratch.BasePageObject;

public class LoginPage extends BasePageObject<LoginPage>{
	
	private static final String URL = "https://www.dice.com/dashboard/login";
	
	private By emailField = By.xpath("//input[@id='email']");
	private By passwordField = By.xpath("//input[@id='email']");
	private By signInButton = By.xpath("//button[@type='submit']");

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void openLoginPage()
	{
		getPage(URL);
		
	}
	
	public void fillUpEmailAndPassword(String email, String password)
	{
		type(email, emailField);
		type(password, passwordField);
	}
	
	public ProfilePage pushSignInButton()
	{
		click(signInButton);
		return new ProfilePage(driver);
		
	}

}
