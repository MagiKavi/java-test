@Smoke
Feature: adactin testcases

Background:
Given user launch the "chrome" browser
And user navigate the url "https://adactinhotelapp.com/"
And user verify the login is opened successfully

@TC100
Scenario: verify with valid details
And user enter valid "vijibharathi" username to login
And user enter valid "Bharathi@@2629" password login
And the user login using the valid inputs to login

@TC101
Scenario Outline: To verify Invalid details
And User enter username <username> and <password> 
And the user login using the valid inputs to login
And User Verfiy login error message

Examples:
|username|password|
|"bhar"|"Bharathi@@2629"|
|"vijibharathi"|"bhar"|
|"vivjiv"|"viji"|