Feature: Money Transfer Functionality

  Background: The User login with valid credentials
    Given Navigate to Para Bank
    When The user enters valid username, password and click login button
    Then The user should login successfully

  @Payment,@Regression
  Scenario: Money transfer between my accounts
    Given Click on the Element in Dialog
      | transferFunds |
    When Money transfer between my accounts
    Then Click on the Element in Dialog
      | transferButton |
    And The user verify money transfer details
    And Click on the Element in Dialog
      | accountsOverview  |
      | accountInAccounts |
    Then The user verify fund transfer received details

  @Payment,@Regression
  Scenario: Money transfer between my accounts
    Given Click on the Element in Dialog
      | transferFunds |
    When Money transfer between my accounts
    Then Click on the Element in Dialog
      | transferButton |
    And The user verify money transfer details
    And Click on the Element in Dialog
      | accountsOverview  |
      | accountInAccounts |
    Then The user verify fund transfer received details
    When the user saves the transaction ID in the payment details section
    Then The user verify after transaction ID fund transfer received details








