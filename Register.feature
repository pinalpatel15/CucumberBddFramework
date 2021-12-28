Feature: Nopcommerce Register
  Background:
Given User open browser And Enter urls
  Scenario: Nopcommerce Register Test
    Then User click on Register Options
    Then User is on Register Page and verify the Login page titles
    Then User select female radio button from Gender
    Then user enter First name and Last name
    Then user select day, month and year from drop down option
    Then user enter valid email
    Then user enter Company name
    Then user tick checkbox for Newsletter
    Then user enter password
    And user enter Confirm Password
    Then user click on Register button
    And user can Register successfully
