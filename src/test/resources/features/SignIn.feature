Feature: Sign In Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  @signin
  Scenario: Verify user can sign in into Retail Application
    Then User should be logged in into Account
    And User enter email 'ameen@gmail.com' and password 'Ameen@123'
    And User click on login button

  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name   | email             | password   | confirmPassword |
      | Parwez | parwezz@gmail.com | Parwez@123 | Parwez@123      |
    And User click on SignUp button
    Then User should be logged into account page
