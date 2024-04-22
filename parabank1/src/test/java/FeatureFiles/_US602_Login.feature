Feature: Login Functionality
  @Accounts,@Smoke,@Regression
  Scenario: The User login with valid credentials
    Given Navigate to Para Bank
    When The user enters valid username, password and click login button
    Then The user should login successfully
  @Accounts,@Smoke,@Regression
    Scenario: The user login invalid username and password
      Given Navigate to Para Bank
      When The user enters invalid username, password and click login button
      Then The user should not login successfully
