package org.POM.StepDefinition2;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.Base.BaseClass;
import org.POM.Base.UserBaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.test.POM.BookHotel;
import org.test.POM.Login;
import org.test.POM.Logout;
import org.test.POM.SearchHotel;
import org.test.POM.SelectHotel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class POMStepDefinition2 extends UserBaseClass{
	

	int rw =1;
	
	@Given("Launch the URL")
	public void launch_the_url() throws IOException, InterruptedException {
		urlLaunch(excelRead(rw, 1));
		maximize();
		Thread.sleep(2000);
	}
	
	@Given("Enter the valid username and password and click the login button")
	public void enter_the_valid_username_and_password_and_click_the_login_button() throws IOException, InterruptedException {
		Login lp = new Login();
		sendKeys(lp.getUser(), excelRead(rw, 2));
		Thread.sleep(1000);
		sendKeys(lp.getPass(), excelRead(rw, 3));
		Thread.sleep(1000);
		clicks(lp.getLogin());
	}
	
	@Given("Select the location, hotel name, room type, no. of rooms, enter the check in date, enter the check out date, adults per room, childern per room and Click the search button")
	public void select_the_location_hotel_name_room_type_no_of_rooms_enter_the_check_in_date_enter_the_check_out_date_adults_per_room_childern_per_room_and_click_the_search_button() throws IOException, InterruptedException {
		SearchHotel sh = new SearchHotel();
		selectByvalue(sh.getLocation(), excelRead(rw, 4));
		selectByVisibilText(sh.getHotels(), excelRead(rw, 5));
		selectByVisibilText(sh.getRoom_type(), excelRead(rw, 6));
		selectByVisibilText(sh.getRoom_nos(), excelRead(rw, 7));
		Thread.sleep(2000);
		clear(sh.getDatepick_in());
		sendKeys(sh.getDatepick_in(), excelRead(rw, 8));
		Thread.sleep(2000);
		clear(sh.getDatepick_out());
		sendKeys(sh.getDatepick_out(), excelRead(rw, 9));
		selectByVisibilText(sh.getAdult_room(), excelRead(rw, 10));
		selectByVisibilText(sh.getChild_room(), excelRead(rw, 11));
		Thread.sleep(2000);
		clicks(sh.getSubmit());
		
		
	}
	
	@Given("Select the hotel using radio button and Click the continue button")
	public void select_the_hotel_using_radio_button_and_click_the_continue_button() throws InterruptedException {
		SelectHotel hs = new SelectHotel();
		clicks(hs.getRadiobutton());
		Thread.sleep(2000);
		clicks(hs.getContinues());
	    
	}
	
	@Given("Enter the first name, last name, billing address, CC number, select the CC type, card expiry month and card expiry year, enter the CCV number, click on the book now button and Take the Screen shot")
	public void enter_the_first_name_last_name_billing_address_cc_number_select_the_cc_type_card_expiry_month_and_card_expiry_year_enter_the_ccv_number_click_on_the_book_now_button_and_take_the_screen_shot() throws IOException, InterruptedException {
		BookHotel bh = new BookHotel();
		sendKeys(bh.getFirst_name(), excelRead(rw, 12));
		sendKeys(bh.getLast_name(), excelRead(rw, 13));
		sendKeys(bh.getAddress(), excelRead(rw, 14));
		Thread.sleep(2000);
		sendKeys(bh.getCc_num(), excelRead(rw, 15));
		Thread.sleep(2000);
		selectByvalue(bh.getCc_type(), excelRead(rw, 16));
		selectByVisibilText(bh.getCc_exp_month(), excelRead(rw, 17));
		selectByVisibilText(bh.getCc_exp_year(), excelRead(rw, 18));
		sendKeys(bh.getCc_cvv(), excelRead(rw, 19));
		Thread.sleep(2000);
		clicks(bh.getBook_now());
		Thread.sleep(6000);
		takesScreenShot();
		
	}
	
	@Given("Click the logout button")
	public void click_the_logout_button() {
		Logout lo = new Logout();
		clicks(lo.getLogout());
	}

	




}	