package org.test.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.List;

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

public class StepDefinition {
	
	
	WebDriver driver;
	@Given("Launch the URL")
	public void launch_the_url() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		driver.get("http://adactinhotelapp.com/");
		driver.navigate().to("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    
	}


	@Given("Enter the valid username")
	public void enter_the_valid_username() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Susant1997");
	}
	
	
	@Given("Enter the password")
	public void enter_the_password() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("December@06");
	    
	}
	
	
	@Given("Click the login button")
	public void click_the_login_button() {
		driver.findElement(By.xpath("//input[@id='login']")).click();
	    
	}
	
	@Given("Select the location")
	public void select_the_location() {
		WebElement element = driver.findElement(By.xpath("//select[@id='location']"));
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement x : options) {
			String text = x.getText();
			System.out.println(text);
			}
		s.selectByValue("Sydney");
	}
	

	@Given("Select the hotel Name")
	public void select_the_hotel_name() {
		WebElement element2 = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s2 = new Select(element2);
		List<WebElement> options2 = s2.getOptions();
		for (int i = 1; i < options2.size(); i++) {
			WebElement element3 = options2.get(i);
			String text = element3.getText();
			System.out.println(text);	
		}
		s2.selectByVisibleText("Hotel Creek");
	}
	
	
	@Given("Select the room type")
	public void select_the_room_type() {
		WebElement element3 = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s3 = new Select(element3);
		s3.selectByIndex(1);
	}
	
	
	@Given("Select the number of rooms")
	public void select_the_number_of_rooms() {
		WebElement element4 = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s4 = new Select(element4);
//		s4.selectByIndex(9);
		s4.selectByVisibleText("2 - Two");
		
	}
	
	@Given("Enter the check in date")
	public void enter_the_check_in_date() {
	    WebElement element = driver.findElement(By.xpath("//input[@id='datepick_in']"));
	    		element.clear();
	    		element.sendKeys("20/09/2023");
	}


	@Given("Enter the check out date")
	public void enter_the_check_out_date() {
		WebElement element = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		element.clear();
		element.sendKeys("22/09/2023");
	}
	
	@Given("Select the adults per room")
	public void select_the_adults_per_room() {
	    
		WebElement element5 = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select s5 = new Select(element5);
		s5.selectByValue("2");
	}

	
	@Given("Select the childern per room")
	public void select_the_childern_per_room() throws InterruptedException {
		WebElement element6 = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select s6 = new Select(element6);
		s6.selectByIndex(0);
		
		Thread.sleep(2000);
	}
	
	
	@Given("Click the search button")
	public void click_the_search_button() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		
		Thread.sleep(2000);
	    
	}
	
	@Then("Select the hotel using radio button")
	public void select_the_hotel_using_radio_button() {
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
	}



	@Then("Click the continue button")
	public void click_the_continue_button() {
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}
	
	
	@Then("Enter the first name")
	public void enter_the_first_name() {
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Susant");
	}
	
	
	@Then("Enter the last name")
	public void enter_the_last_name() {
		 driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Bhandari");
	}
	
	
	@Then("Enter the billing address")
	public void enter_the_billing_address() {
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("3 Harlech Glen, Bethlehem, Tauranga, New Zealand, 3110");
		
		
	}
	@Then("Enter the Credit card number")
	public void enter_the_credit_card_number() throws InterruptedException {
		 driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("4242424242424242");
		    
		    Thread.sleep(2000);
		
	}
	
	@Then("Selecet the Credit card type")
	public void selecet_the_credit_card_type() {
		WebElement element7 = driver.findElement(By.xpath("//select[@id='cc_type']"));
	    Select s7 = new Select(element7);
	    s7.selectByIndex(3);
	}


	@Then("Select the card expiry month")
	public void select_the_card_expiry_month() {
		WebElement element8 = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select s8 = new Select(element8);
		s8.selectByValue("12");
	}
	
	@Then("Select the card expiry year")
	public void select_the_card_expiry_year() {
		WebElement element9 = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select s9 = new Select(element9);
		s9.selectByVisibleText("2030");
	}
	
	
	@Then("Enter the CVV number")
	public void enter_the_cvv_number() {
		driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("567");
		
	}
	
	
	@Then("Click the Book Now button")
	public void click_the_book_now_button() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='book_now']")).click();
		Thread.sleep(8000);
	}

	@Then("Take the Screen shot")
	public void take_the_screen_shot() throws IOException, InterruptedException {
		TakesScreenshot scr = (TakesScreenshot)driver;
		File f = scr.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\susan\\OneDrive\\Pictures\\Saved Pictures\\book6.jpg");
		FileUtils.copyFile(f, d);
		
		Thread.sleep(2000);
	    
	}


	@Then("Click the logout button")
	public void click_the_logout_button() {
		driver.findElement(By.xpath("//input[@id='logout']")).click();
	}
}
	
	