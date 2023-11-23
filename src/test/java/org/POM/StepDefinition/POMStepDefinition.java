package org.POM.StepDefinition;

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
import org.test.POM.Login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class POMStepDefinition extends UserBaseClass{
	
	Login lp;
	int rw =1;
	@Given("Launch the URL")
	public void launch_the_url() throws InterruptedException, IOException {
		urlLaunch(excelRead(rw, 1));
		maximize();
		Thread.sleep(2000);
	    
	}


	@Given("Enter the valid username")
	public void enter_the_valid_username() throws IOException {
		lp = new Login();
		sendKeys(lp.getUser(), excelRead(rw, 2));
	}
	
	
	@Given("Enter the password")
	public void enter_the_password() throws IOException {
		lp = new Login();
		sendKeys(lp.getPass(), excelRead(rw, 3));
	}
	
	
	@Given("Click the login button")
	public void click_the_login_button() {
		lp = new Login();
		clicks(lp.getLogin());
	    
	}
	
	@Given("Select the location")
	public void select_the_location() throws IOException {


	}
	

	@Given("Select the hotel Name")
	public void select_the_hotel_name() throws IOException {


	}
	
	
	@Given("Select the room type")
	public void select_the_room_type() throws IOException {


	}
	
	
	@Given("Select the number of rooms")
	public void select_the_number_of_rooms() throws IOException {


		
	}
	
	@Given("Enter the check in date")
	public void enter_the_check_in_date() throws IOException {


	}


	@Given("Enter the check out date")
	public void enter_the_check_out_date() throws IOException {


	}
	
	@Given("Select the adults per room")
	public void select_the_adults_per_room() throws IOException {
	    
		
	}

	
	@Given("Select the childern per room")
	public void select_the_childern_per_room() throws InterruptedException, IOException {
		
	}
	
	
	@Given("Click the search button")
	public void click_the_search_button() throws InterruptedException {


	}
	
	@Then("Select the hotel using radio button")
	public void select_the_hotel_using_radio_button() throws InterruptedException {


	}



	@Then("Click the continue button")
	public void click_the_continue_button() {


	}
	
	
	@Then("Enter the first name")
	public void enter_the_first_name() throws IOException {


	}
	
	
	@Then("Enter the last name")
	public void enter_the_last_name() throws IOException {


	}
	
	
	@Then("Enter the billing address")
	public void enter_the_billing_address() throws IOException {


		
	}
	@Then("Enter the Credit card number")
	public void enter_the_credit_card_number() throws  IOException {


		
	}
	
	@Then("Selecet the Credit card type")
	public void selecet_the_credit_card_type() throws IOException {


	}


	@Then("Select the card expiry month")
	public void select_the_card_expiry_month() throws IOException {


	}
	
	@Then("Select the card expiry year")
	public void select_the_card_expiry_year() throws IOException {


	}
	
	
	@Then("Enter the CVV number")
	public void enter_the_cvv_number() throws IOException, InterruptedException {


		
	}
	
	
	@Then("Click the Book Now button")
	public void click_the_book_now_button() throws InterruptedException, IOException {


		
	}

	@Then("Take the Screen shot")
	public void take_the_screen_shot() throws IOException, InterruptedException {


	    
	}


	@Then("Click the logout button")
	public void click_the_logout_button() {


	}
}
	
	