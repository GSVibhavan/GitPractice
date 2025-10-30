Feature: Store login
This feature deals with the login functionality.
Scenario: Login with correct username and correct password
 
	Given I navigate to login page
	And I entered username and password
	And I clicked signin button
	Then Its navigated to the HomePage