package org.test.POM;

import org.POM.Base.UserBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends UserBaseClass {
	
	
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="//select[@id='location']")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}

	@FindBy(how=How.XPATH,using="//select[@id='hotels']")
	private WebElement hotels;

	public WebElement getHotels() {
		return hotels;
	}

	@FindBy(how=How.XPATH,using="//select[@name='room_type']")
	private WebElement room_type;

	public WebElement getRoom_type() {
		return room_type;
	}

	@FindBy(how=How.XPATH,using="//select[@name='room_nos']")
	private WebElement room_nos;

	

	public WebElement getRoom_nos() {
		return room_nos;
	}

	@FindBy(how=How.XPATH,using="//input[@id='datepick_in']")
	private WebElement datepick_in;

	public WebElement getDatepick_in() {
		return datepick_in;
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='datepick_out']")
	private WebElement datepick_out;

	public WebElement getDatepick_out() {
		return datepick_out;
	}
	
	@FindBy(how=How.XPATH,using="//select[@id='adult_room']")
	private WebElement adult_room;

	public WebElement getAdult_room() {
		return adult_room;
	}
	
	@FindBy(how=How.XPATH,using="//select[@id='child_room']")
	private WebElement child_room;

	public WebElement getChild_room() {
		return child_room;
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='Submit']")
	private WebElement Submit;

	public WebElement getSubmit() {
		return Submit;
	}
	
	
	
	
	}
	
	
	


	
	