
Feature: I want to test facebook login feature

  @tag1
  Scenario: facebook login with invalid inputs
    Given user browse the url "https://www.facebook.com/"
    And User enter the email id and password as "dggfufhufddf" , "dfhdu"
    And click on login
    Then user should should see the error " Find your account and log in"
