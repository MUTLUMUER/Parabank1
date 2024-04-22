Feature: New Account Functionality

  Background: The User login with valid credentials
    Given Navigate to Para Bank
    When The user enters valid username, password and click login button
    Then The user should login successfully

  @Accounts, @Smoke, @Regression
  Scenario: User creates a checking account
    When Click on the Element in Dialog
      | openNewAccount |
    And the user selects the account type as Checking
    And the user selects the initial balance for the checking account
    And the user clicks on the Open New Account button
    Then the user should receive a confirmation message with the new account number

  @Accounts, @Smoke, @Regression
  Scenario: User creates a checking account
    When Click on the Element in Dialog
      | openNewAccount |
    And the user selects the account type as Savings
    And the user selects the initial balance for the Savings account
    And the user clicks on the actions Open New Account button
    Then the user should receive a confirmation message with the new account number