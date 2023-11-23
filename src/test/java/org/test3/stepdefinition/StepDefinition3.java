package org.test3.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.Base.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition3 extends BaseClass{
	
	int rw =1;
	@Given("Launch the URL")
	public void launch_the_url() throws InterruptedException, IOException {
		urlLaunch(excelRead(rw, 1));
		Thread.sleep(2000);
	    
	}


	@Given("Enter the valid username")
	public void enter_the_valid_username() throws IOException {
		findElement("//input[@id='username']");
		sendKeys(excelRead(rw, 2));
	}
	
	
	@Given("Enter the password")
	public void enter_the_password() throws IOException {
		findElement("//input[@id='password']");
		sendKeys(excelRead(rw, 3));
	    
	}
	
	
	@Given("Click the login button")
	public void click_the_login_button() {
		findElement("//input[@id='login']");
		clicks();
	    
	}
	
	@Given("Select the location")
	public void select_the_location() throws IOException {
		findElement("//select[@id='location']");
		selectByvalue(excelRead(rw, 4));
	}
	

	@Given("Select the hotel Name")
	public void select_the_hotel_name() throws IOException {
		findElement("//select[@id='hotels']");
		selectByVisibilText(excelRead(rw, 5));
	}
	
	
	@Given("Select the room type")
	public void select_the_room_type() throws IOException {
		findElement("//select[@name='room_type']");
		selectByVisibilText(excelRead(1, 6));
	}
	
	
	@Given("Select the number of rooms")
	public void select_the_number_of_rooms() throws IOException {
		findElement("//select[@name='room_nos']");
		selectByVisibilText(excelRead(1, 7));
		
	}
	
	@Given("Enter the check in date")
	public void enter_the_check_in_date() throws IOException {
		findElement("//input[@id='datepick_in']");
		clear();
		sendKeys(excelRead(1, 8));
	}


	@Given("Enter the check out date")
	public void enter_the_check_out_date() throws IOException {
		findElement("//input[@id='datepick_out']");
		clear();
		sendKeys(excelRead(1, 9));
	}
	
	@Given("Select the adults per room")
	public void select_the_adults_per_room() throws IOException {
	    
		findElement("//select[@name='adult_room']");
		selectByVisibilText(excelRead(1, 10));
	}

	
	@Given("Select the childern per room")
	public void select_the_childern_per_room() throws InterruptedException, IOException {
		findElement("//select[@name='child_room']");
		selectByVisibilText(excelRead(1, 11));
		Thread.sleep(2000);
	}
	
	
	@Given("Click the search button")
	public void click_the_search_button() throws InterruptedException {
		findElement("//input[@id='Submit']");
		clicks();
	    
	}
	
	@Then("Select the hotel using radio button")
	public void select_the_hotel_using_radio_button() throws InterruptedException {
		findElement("//input[@id='radiobutton_0']");
		clicks();
		Thread.sleep(2000);
	}



	@Then("Click the continue button")
	public void click_the_continue_button() {
		findElement("//input[@id='continue']");
		clicks();
	}
	
	
	@Then("Enter the first name")
	public void enter_the_first_name() throws IOException {
		findElement("//input[@id='first_name']");
		sendKeys(excelRead(1, 12));
	}
	
	
	@Then("Enter the last name")
	public void enter_the_last_name() throws IOException {
		findElement("//input[@id='last_name']");
		sendKeys(excelRead(1, 13));
	}
	
	
	@Then("Enter the billing address")
	public void enter_the_billing_address() throws IOException {
		findElement("//textarea[@id='address']");
		sendKeys(excelRead(1, 14));
		
	}
	@Then("Enter the Credit card number")
	public void enter_the_credit_card_number() throws  IOException {
		findElement("//input[@id='cc_num']");
		sendKeys(excelRead(1, 15));
		
	}
	
	@Then("Selecet the Credit card type")
	public void selecet_the_credit_card_type() throws IOException {
		findElement("//select[@id='cc_type']");
		selectByvalue(excelRead(1, 16));
	}


	@Then("Select the card expiry month")
	public void select_the_card_expiry_month() throws IOException {
		findElement("//select[@id='cc_exp_month']");
		selectByVisibilText(excelRead(1, 17));
	}
	
	@Then("Select the card expiry year")
	public void select_the_card_expiry_year() throws IOException {
		findElement("//select[@id='cc_exp_year']");
		selectByVisibilText(excelRead(1, 18));
	}
	
	
	@Then("Enter the CVV number")
	public void enter_the_cvv_number() throws IOException, InterruptedException {
		findElement("//input[@id='cc_cvv']");
		sendKeys(excelRead(1, 19));
		Thread.sleep(2000);
		
	}
	
	
	@Then("Click the Book Now button")
	public void click_the_book_now_button() throws InterruptedException, IOException {
		findElement("//input[@id='book_now']");
		clicks();
		Thread.sleep(6000);
		
	}

	@Then("Take the Screen shot")
	public void take_the_screen_shot() throws IOException, InterruptedException {
		findElement("//input[@id='order_no']");
		getAttributes();
		writeExcel(1, 21);
		takesScreenShot();
		Thread.sleep(2000);
	    
	}


	@Then("Click the logout button")
	public void click_the_logout_button() {
		findElement("//input[@id='logout']");
		clicks();
		quit();
	}
}
	
	