package org.POM.StepDefinition3;

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

public class POMStepDefinition3 extends UserBaseClass{

	@Given("Launch the URL {string}")
	public void launch_the_url(String url) throws InterruptedException {
		urlLaunch(url);
		maximize();
		Thread.sleep(2000);
	}



	@Given("Enter the valid username {string}, password {string} and click the login button")
	public void enter_the_valid_username_password_and_click_the_login_button(String username, String password) {
		Login lp = new Login();
		sendKeys(lp.getUser(), username);
		sendKeys(lp.getPass(), password);
		clicks(lp.getLogin());
	}

	@Given("Select the location {string}, hotel name {string}, room type {string}, no. of rooms {string}, enter the check in date {string}, enter the check out date {string}, adults per room {string}, childern per room {string} and Click the search button")
	public void select_the_location_hotel_name_room_type_no_of_rooms_enter_the_check_in_date_enter_the_check_out_date_adults_per_room_childern_per_room_and_click_the_search_button(String location, String hotel, String room_type, String room_nos, String date_in, String date_out, String adult_no, String child_no) throws InterruptedException {

		SearchHotel sh = new SearchHotel();
		selectByvalue(sh.getLocation(), location);
		selectByVisibilText(sh.getHotels(), hotel);
		selectByVisibilText(sh.getRoom_type(), room_type);
		selectByVisibilText(sh.getRoom_nos(), room_nos);
		Thread.sleep(2000);
		clear(sh.getDatepick_in());
		sendKeys(sh.getDatepick_in(), date_in);
		Thread.sleep(2000);
		clear(sh.getDatepick_out());
		sendKeys(sh.getDatepick_out(), date_out);
		selectByVisibilText(sh.getAdult_room(), adult_no);
		selectByVisibilText(sh.getChild_room(), child_no);
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
	
	
	
	@Given("Enter the first name {string}, last name {string}, billing address {string}, CC number {string}, select the CC type {string}, card expiry month {string} and card expiry year {string}, enter the CCV number {string}, click on the book now button and Take the Screen shot")
	public void enter_the_first_name_last_name_billing_address_cc_number_select_the_cc_type_card_expiry_month_and_card_expiry_year_enter_the_ccv_number_click_on_the_book_now_button_and_take_the_screen_shot(String first, String last, String add, String cc_no, String cc_type, String expiry_month, String expiry_year, String ccv_no) throws InterruptedException, IOException {
		BookHotel bh = new BookHotel();
		sendKeys(bh.getFirst_name(), first);
		sendKeys(bh.getLast_name(), last);
		sendKeys(bh.getAddress(), add);
		Thread.sleep(2000);
		sendKeys(bh.getCc_num(), cc_no);
		Thread.sleep(2000);
		selectByvalue(bh.getCc_type(), cc_type);
		selectByVisibilText(bh.getCc_exp_month(), expiry_month);
		selectByVisibilText(bh.getCc_exp_year(), expiry_year);
		sendKeys(bh.getCc_cvv(), ccv_no);
		Thread.sleep(2000);
		clicks(bh.getBook_now());
		Thread.sleep(6000);
		takesScreenShot();
	}
	@Given("Click the logout button")
	public void click_the_logout_button() throws InterruptedException {
		Logout lo = new Logout();
		clicks(lo.getLogout());
		Thread.sleep(6000);
		quit();
	}




}	