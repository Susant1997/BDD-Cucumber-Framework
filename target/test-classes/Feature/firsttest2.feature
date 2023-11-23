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
	Background:
	Given Launch the URL
	And Enter the valid username and password and click the login button

  @Regression @login
  Scenario: Login
    Given Launch the URL
    And Enter the valid username and password and click the login button
   

		
		@Regression @searchhotel
		Scenario: Search Hotel
		Given Launch the URL
    And Enter the valid username and password and click the login button
    And Select the location, hotel name, room type, no. of rooms, enter the check in date, enter the check out date, adults per room, childern per room and Click the search button  
		
	
		@Regression @selecthotel
		Scenario: Select Hotel
    Given Launch the URL
    And Enter the valid username and password and click the login button
    And Select the location, hotel name, room type, no. of rooms, enter the check in date, enter the check out date, adults per room, childern per room and Click the search button  
		And Select the hotel using radio button and Click the continue button
		
		@Regression @booknow
		Scenario: Book Now
    Given Launch the URL
    And Enter the valid username and password and click the login button
    And Select the location, hotel name, room type, no. of rooms, enter the check in date, enter the check out date, adults per room, childern per room and Click the search button  
		And Select the hotel using radio button and Click the continue button
		And Enter the first name, last name, billing address, CC number, select the CC type, card expiry month and card expiry year, enter the CCV number, click on the book now button and Take the Screen shot
		
		
		@Regression @logout
  	Scenario: Logout
    Given Launch the URL
    And Enter the valid username and password and click the login button
    And Select the location, hotel name, room type, no. of rooms, enter the check in date, enter the check out date, adults per room, childern per room and Click the search button  
		And Select the hotel using radio button and Click the continue button
		And Enter the first name, last name, billing address, CC number, select the CC type, card expiry month and card expiry year, enter the CCV number, click on the book now button and Take the Screen shot
		And Click the logout button