package org.test.POM;

import org.POM.Base.UserBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends UserBaseClass {
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='radiobutton_0']")
	private WebElement radiobutton;

	public WebElement getRadiobutton() {
		return radiobutton;
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='continue']")
	private WebElement continues;

	public WebElement getContinues() {
		return continues;
	}

	


}
