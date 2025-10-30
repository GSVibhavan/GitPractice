Feature: Guru login

This feature deals with the login


Background:

Given I navigate to login page for new tours


@TC1

Scenario: Login with correct username and correct password


#Given I navigate to login page

And I entered username and password for new tours

And I clicked signin button for new tours

Then Itas navigated to the HomePage for new tours


@TC2

Scenario: Login with correct username and invlid password


#Given I navigate to login page

And I entered username and password for new tours

But Invalid pwd for new tours

And I clicked signin button for new tours

Then Itas navigated to the HomePage for new tours