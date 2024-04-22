Feature: Loan Application Functionality

  Background: The User login with valid credentials
    Given Navigate to Para Bank
    When The user enters valid username, password and click login button
    Then The user should login successfully
  @Loan, @Accounts, @Regression
  Scenario: Loan Application Process
    When Click on the Element in Dialog
      | requestLoan |
    Then the user fills out the loan application form with the following details:
    And Click on the Element in Dialog
      | applyNowButton |
    Then The user should receive a confirmation message for the successful request loan
    And Click on the Element in Dialog
      | newAccountIdTextButton |
    Then The user should verify request loan complate account id details after click on the account id
  @Loan, @Accounts, @Regression
  Scenario: Loan Application Process (Negative)
    When Click on the Element in Dialog
      | requestLoan |
    Then the user fills out the negative loan application form with the following details:
    And Click on the Element in Dialog
      | applyNowButton |
    Then The user should receive some message for the denied request loan
