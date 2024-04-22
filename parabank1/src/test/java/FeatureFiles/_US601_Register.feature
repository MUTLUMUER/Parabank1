Feature: Registration functionality
  @Accounts,@Smoke,@Regression
  Scenario: Register provide some personal information.
    Given Navigate to Para Bank
    When Enter the personal information and click Register button
    Then User should register successfully
