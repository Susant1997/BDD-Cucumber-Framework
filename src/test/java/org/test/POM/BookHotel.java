package org.test.POM;

import org.POM.Base.UserBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends UserBaseClass{
	
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='first_name']")
	private WebElement first_name;

	public WebElement getFirst_name() {
		return first_name;
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='last_name']")
	private WebElement last_name;

	public WebElement getLast_name() {
		return last_name;
	}
	
	@FindBy(how=How.XPATH,using="//textarea[@id='address']")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}

	
	@FindBy(how=How.XPATH,using="//input[@id='cc_num']")
	private WebElement cc_num;

	public WebElement getCc_num() {
		return cc_num;
	}
	
	@FindBy(how=How.XPATH,using="//select[@id='cc_type']")
	private WebElement cc_type;

	public WebElement getCc_type() {
		return cc_type;
	}
	
	@FindBy(how=How.XPATH,using="//select[@id='cc_exp_month']")
	private WebElement cc_exp_month;

	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}
	
	@FindBy(how=How.XPATH,using="//select[@id='cc_exp_year']")
	private WebElement cc_exp_year;

	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='cc_cvv']")
	private WebElement cc_cvv;

	public WebElement getCc_cvv() {
		return cc_cvv;
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='book_now']")
	private WebElement book_now;

	public WebElement getBook_now() {
		return book_now;
	}

	
	
	
	
	
	
	
	
}
