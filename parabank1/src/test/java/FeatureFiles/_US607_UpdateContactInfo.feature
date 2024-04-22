Feature: Update Contact Information Functionality

  Background: The User login with valid credentials
    Given Navigate to Para Bank
    When The user enters valid username, password and click login button
    Then The user should login successfully

  @Contact, @Accounts
  Scenario Outline: User updates contact information
    When Click on the Element in Dialog
      | updateContactInfo |
    And the user enters the necessary updates contact details
      | updateFirstName   | <updateFirstName>   |
      | updateLastName    | <updateLastName>    |
      | updateAddress     | <updateAddress>     |
      | updateCity        | <updateCity>        |
      | updateState       | <updateState>       |
      | updateZipCode     | <updateZipCode>     |
      | updatePhoneNumber | <updatePhoneNumber> |
    When Click on the Element in Dialog
      | updateProfileButton |
    Then the user should see a confirmation message indicating the successful update
    And the user clicks on the actions logout button

    When The user enters valid username, password and click login button
    Then the user should verify that the updated contact information is displayed correctly



    Examples:
      | updateFirstName | updateLastName | updateAddress | updateCity | updateState | updateZipCode | updatePhoneNumber |
      | Linda           | Sidar          | Dalaman       | Denizli    | Turkey      | 20600         | 0505 045 54 44    |
      |                 |                |               | Denizli    | Turkey      | 20600         | 0505 045 54 44    |

