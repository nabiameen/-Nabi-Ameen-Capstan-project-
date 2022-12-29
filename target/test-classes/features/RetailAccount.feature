Feature: Retail Account

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'ameen@gmail.com' and password 'Elias@2122'
    And User click on login button
    And User should be logged in into Account
    And User click on Account option

  @Account
  Scenario: Verify User can update Profile Information
    And User update Name 'Nabiameen' and Phone '5308440946'
    And User click on Update button
    Then user profile information should be updated

  Scenario: Verify User can Update password
    And User enter below information
      | Previous Password | New Password | Confirm Password |
      | Elias@2122        | Elias@2123   | Elias@2123       |
    And User click on Change Password button
    Then a message should be displayed

  @paymentMethod
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1122334455667744 | jann       |              12 |           2025 |          100 |
    And User click on Add your card button
    Then message should be displayed

  @EditCard
  Scenario: Verify User can edit Debit or Credit card
    And user click on master card link
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1122334455677886 | Mike       |              10 |           2026 |          123 |
    And user click on Update Your Card button
    Then an message should be displayed

  @RemoveCard
  Scenario: Verify User can remove Debit or Credit card
    And User click on master card link
    And User click on remove option of card section
    Then payment details should be removed

  @AddNewAddress
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country     | fullName | phoneNumber | streetAddress  | apt | city       | state    | zipCode |
      | Afghanistan | Ameen    |  5302213344 | 1051 clark ave |  50 | sacremento | Kirklees |   95991 |
    And User click Add Your Address button
    Then address added message should be displayed

  @EditNewAddress
  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And user fill edit new address form with below information
      | country | fullName | phoneNumber | streetAddress  | apt | city  | state | zipCode |
      | Turkey  | Amza     |  5308883332 | 1414 clark ave |   6 | chico | Adana |   12121 |
    And User click update Your Address button
    Then edit message should be displayed

  @RemoveNewAddres
  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed
