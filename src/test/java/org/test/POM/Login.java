package org.test.POM;

import org.POM.Base.UserBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends UserBaseClass{
	
	public Login() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement user;

	public WebElement getUser() {
		return user;
	}
	
	@FindBy(id="password")
	private WebElement pass;

	public WebElement getPass() {
		return pass;
	}
	
	@FindBy(id="login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

}
