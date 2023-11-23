#Author: your.email@your.domain.com
#Keywords Summary : Adaction Hotel End to End testing
#Feature: Adact login, search hotel, select hotel, book hotel and booking confirmed
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Addaction login, search hotel, select hotel, book hotel and booking confirmed
    
  @Regression @login
  Scenario: Login
    Given Launch the URL
    And Enter the valid username
    And Enter the password
    And Click the login button

		
		@Regression @searchhotel
		 Scenario: Search Hotel
    Given Launch the URL
    And Enter the valid username
    And Enter the password
    And Click the login button
    And Select the location
		And Select the hotel Name
		And Select the room type
		And Select the number of rooms
		And Enter the check in date
		And Enter the check out date
		And Select the adults per room
		And Select the childern per room
		And Click the search button
	
		@Regression @selecthotel
		Scenario: Select Hotel
    Given Launch the URL
    And Enter the valid username
    And Enter the password
    And Click the login button
    And Select the location
		And Select the hotel Name
		And Select the room type
		And Select the number of rooms
		And Enter the check in date
		And Enter the check out date
		And Select the adults per room
		And Select the childern per room
		And Click the search button
		Then Select the hotel using radio button
		And Click the continue button
		
		@Regression @booknow
		Scenario: Book Now
    Given Launch the URL
    And Enter the valid username
    And Enter the password
    And Click the login button
    And Select the location
		And Select the hotel Name
		And Select the room type
		And Select the number of rooms
		And Enter the check in date
		And Enter the check out date
		And Select the adults per room
		And Select the childern per room
		And Click the search button
		Then Select the hotel using radio button
		And Click the continue button
		And Enter the first name
		And Enter the last name
		And Enter the billing address
		And Enter the Credit card number
		And Selecet the Credit card type
		And Select the card expiry month
		And Select the card expiry year
		And Enter the CVV number
		And Click the Book Now button
		Then Take the Screen shot
		
		@Regression @logout
  	Scenario: Logout
    Given Launch the URL
    And Enter the valid username
    And Enter the password
    And Click the login button
    And Select the location
		And Select the hotel Name
		And Select the room type
		And Select the number of rooms
		And Enter the check in date
		And Enter the check out date
		And Select the adults per room
		And Select the childern per room
		And Click the search button
		Then Select the hotel using radio button
		And Click the continue button
		And Enter the first name
		And Enter the last name
		And Enter the billing address
		And Enter the Credit card number
		And Selecet the Credit card type
		And Select the card expiry month
		And Select the card expiry year
		And Enter the CVV number
		And Click the Book Now button
		Then Take the Screen shot
		And Click the logout button