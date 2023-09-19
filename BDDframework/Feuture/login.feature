Feature: verify Login

Scenario: verify login with valid inputs

Given user Browse the URL "http://flights.qedgetech.com"
And User enter the email id "ramesh1232@gmail.com" and password "demo123"
And User click on Login
Then User should see "Flight registration page"
When User clicks on logout
Then User should see "Loginpage"
