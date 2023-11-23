#Author: your.email@your.domain.com
#Keywords Summary : Adaction Hotel End to End testing


Feature: Addaction login, search hotel, select hotel, book hotel and booking confirmed
    
    @login @Smoke
  Scenario Outline: Login
    Given Launch the URL "<url>"
    And Enter the valid username "<user>", password "<pass>" and click the login button
		Examples:
		|url                         | user       | pass        |
		|https://adactinhotelapp.com | Susant1997 | December@06 |
#		|https://adactinhotelapp.com | Susant 		| December06 |
#		|https://adactinhotelapp.com | Susan 			| December@ |


		 @Regression @searchhotel @Smoke
		Scenario Outline: Search Hotel
    Given Launch the URL "<url>"
    And Enter the valid username "<user>", password "<pass>" and click the login button
		And Select the location "<location>", hotel name "<hotel>", room type "<room_type>", no. of rooms "<rooms_nos>", enter the check in date "<check_in_date>", enter the check out date "<check_out_date>", adults per room "<adult_room>", childern per room "<child_room>" and Click the search button  
		Examples:
		|url                         | user       | pass        | location | hotel | room_type | rooms_nos | check_in_date | check_out_date | adult_room | child_room |
		|https://adactinhotelapp.com | Susant1997 | December@06 | Sydney | Hotel Sunshine | Deluxe | 2 - Two | 28/09/2023 | 30/09/2023 | 2 - Two |  2 - Two |

		
		
		
		@Regression @selecthotel
		Scenario Outline: Select Hotel
    Given Launch the URL "<url>"
    And Enter the valid username "<user>", password "<pass>" and click the login button
		And Select the location "<location>", hotel name "<hotel>", room type "<room_type>", no. of rooms "<rooms_nos>", enter the check in date "<check_in_date>", enter the check out date "<check_out_date>", adults per room "<adult_room>", childern per room "<child_room>" and Click the search button  
		And Select the hotel using radio button and Click the continue button
		Examples:
		|url                         | user       | pass        | location | hotel | room_type | rooms_nos | check_in_date | check_out_date | adult_room | child_room |
		|https://adactinhotelapp.com | Susant1997 | December@06 | Sydney | Hotel Sunshine | Deluxe | 2 - Two | 28/09/2023 | 30/09/2023 | 2 - Two |  2 - Two |
    
		
		@Regression @booknow
		Scenario: Book Now
    Given Launch the URL "<url>"
    And Enter the valid username "<user>", password "<pass>" and click the login button
		And Select the location "<location>", hotel name "<hotel>", room type "<room_type>", no. of rooms "<rooms_nos>", enter the check in date "<check_in_date>", enter the check out date "<check_out_date>", adults per room "<adult_room>", childern per room "<child_room>" and Click the search button  
		And Select the hotel using radio button and Click the continue button
		And Enter the first name "<first_name>", last name "<last_name>", billing address "<address>", CC number "<CC_no>", select the CC type "<CC_type>", card expiry month "<card_expiry_month>" and card expiry year "<card_expiry_year>", enter the CCV number "<CCV_no>", click on the book now button and Take the Screen shot
		Examples:
		|url                         | user       | pass        | location | hotel | room_type | rooms_nos | check_in_date | check_out_date | adult_room | child_room | first_name | last_name | address | CC_no | CC_type | card_expiry_month | card_expiry_year | CCV_no |
		|https://adactinhotelapp.com | Susant1997 | December@06 | Sydney | Hotel Sunshine | Deluxe | 2 - Two | 28/09/2023 | 30/09/2023 | 2 - Two |  2 - Two |  Susant | Bhandari | Bethlehem | 4242424242424242 | VISA | December | 2030 | 789 |
    
		
		@Regression @logout
  	Scenario: Logout
    Given Launch the URL "<url>"
    And Enter the valid username "<user>", password "<pass>" and click the login button
		And Select the location "<location>", hotel name "<hotel>", room type "<room_type>", no. of rooms "<rooms_nos>", enter the check in date "<check_in_date>", enter the check out date "<check_out_date>", adults per room "<adult_room>", childern per room "<child_room>" and Click the search button  
		And Select the hotel using radio button and Click the continue button
		And Enter the first name "<first_name>", last name "<last_name>", billing address "<address>", CC number "<CC_no>", select the CC type "<CC_type>", card expiry month "<card_expiry_month>" and card expiry year "<card_expiry_year>", enter the CCV number "<CCV_no>", click on the book now button and Take the Screen shot
		And Click the logout button
		Examples:
		|url                         | user       | pass        | location | hotel | room_type | rooms_nos | check_in_date | check_out_date | adult_room | child_room | first_name | last_name | address | CC_no | CC_type | card_expiry_month | card_expiry_year | CCV_no |
		|https://adactinhotelapp.com | Susant1997 | December@06 | Sydney | Hotel Sunshine | Deluxe | 2 - Two | 28/09/2023 | 30/09/2023 | 2 - Two |  2 - Two |  Susant | Bhandari | Bethlehem | 4242424242424242 | VISA | December | 2030 | 789 |
    
		