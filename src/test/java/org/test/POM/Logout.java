package org.test.POM;

import org.POM.Base.UserBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Logout extends UserBaseClass {
	public Logout() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='logout']")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}
}
