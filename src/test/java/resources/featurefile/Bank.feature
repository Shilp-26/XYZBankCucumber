Feature: Bank Test
  User should be able to use all the functionalities of the XYZ bank successfully

  @Smoke @Regression
  Scenario: Bank manager should add customer successfully
    Given User is on Homepage
    When User clicks on bank manager login tab
    And User clicks on add customer tab
    And User enters first name "Sam"
    And User enters last name "Patel"
    And User enters postcode "HA0 3PT"
    And User clicks on add customer button
    Then User can see "Customer added successfully with customer id :6" message popup
    And User clicks on ok button

  @Sanity @Regression
  Scenario: bank manager should open account successfully
    Given User has already got an account
    When User clicks on open account tab
    And User searches for the customer account "Sam Patel"
    And User selects currency "Pound"
    And User clicks on process button
    Then User can see "Account created successfully with account Number :1016" message popup
    And User clicks on ok button

  @Sanity @Regression
  Scenario: customer should login and logout successfully
    Given Customer has an account
    When User clicks on customer login tab
    And User searches for the customer "Sam Patel"
    And User clicks on login button
    And User can see the logout tab is displayed
    And User clicks on logout
    Then User can login and logout successfully

  @Regression
  Scenario: customer should deposit money successfully
    Given Customer has an account already
    When User clicks on customer login tab
    And User searches for the customer "Harry Potter"
    And User clicks on login button
    And User clicks on deposit tab
    And User enters amount "100"
    And User clicks on deposit button
    Then User can see the message "Deposit Successful"

  @Regression
  Scenario: customer should withdraw money successfully
    Given Customer has deposited money into their account
    When User click on customer login tab
    And User searches for the customer "Harry Potter"
    And User clicks on login button
    And User clicks on withdrawl tab
    And User enters amount "50"
    And User clicks on withdrawl button
    Then User can see the message "Transaction Successful"
