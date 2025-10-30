Feature: logintable
 
This feature deals with the login
 
 
Background:
 
Given table login page
 
 
@TC1
 
Scenario: Logintable using correct username and correct password
 
#Given I navigate to login page
 
When table enter "<username>" and "<password>"
And table click sigin
Then table check correct navigation "<expected result>"
 
Examples:
|username|password|expected result|
|mercury|mercury|Login successfully|
|mercury|1234|Login successfully|
|mercury|aaa|Enter your userName and password correct|
|bbb|mercury|Enter your userName and password correct|
 
 
 
 
 
 
 