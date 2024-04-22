Feature: Paying Bill Functionality

  Background: The User login with valid credentials
    Given Navigate to Para Bank
    When The user enters valid username, password and click login button
    Then The user should login successfully

  @Payment,@Smoke,@Regression
  Scenario Outline: User pays electricity bill, water bill and gas bill
    When Click on the Element in Dialog
      | payBill |
    And the user enters the necessary payment details
      | payeeName          | <name>          |
      | payeeAddress       | <address>       |
      | payeeCity          | <city>          |
      | payeeState         | <state>         |
      | payeeZipCode       | <zipCode>       |
      | payeePhoneNumber   | <phoneNumber>   |
      | payeeAccount       | <account>       |
      | payeeVerifyAccount | <verifyAccount> |
      | payeeAmount        | <amount>        |
    And Click on the Element in Dialog
      | sendPayment |
    Then the user should receive a confirmation message for the successful payment
    When Click on the Element in Dialog
      | accountsOverview |
      | paymentAccount   |
    And the user should verify that the electricity bill is added to the list of paid bills
    Examples:
      | name                      | address | city  | state   | zipCode | phoneNumber | account | verifyAccount | amount |
      | Enerjisa Electricity Bill | Ortaca  | Muğla | Türkiye | 48600   | 90505555555 | 34323   | 34323         | 85     |
      | Iski Water Bill           | Ortaca  | Muğla | Türkiye | 48600   | 90505555555 | 34323   | 34323         | 45     |
      | Igdas Gas Bill            | Ortaca  | Muğla | Türkiye | 48600   | 90505555555 | 34323   | 34323         | 140    |

