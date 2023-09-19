Feature: Login page

Scenario: Login verify with valid inputs

Given User browse the url "https://opensource-demo.orangehrmlive.com"
When user enters the username "Admin" and password "admin123"
And user click on login
Then user should see homepage