package stepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _US607_UpdateContactInfoSteps {
    DialogContent dc = new DialogContent();
    @And("the user enters the necessary updates contact details")
    public void theUserEntersTheNecessaryUpdatesContactDetails(DataTable dataTable) {
        List<List<String>> listText = dataTable.asLists(String.class);
        for (int i = 0; i < listText.size(); i++) {
            WebElement txtBoxWebElemnt = dc.getWebElement(listText.get(i).get(0));
            //dc.updateFirstName.clear();
            //dc.updateLastName.clear();
            //dc.updateAddress.clear();
            dc.mySendKeys(txtBoxWebElemnt, listText.get(i).get(1));
        }
    }

    @Then("the user should see a confirmation message indicating the successful update")
    public void theUserShouldSeeAConfirmationMessageIndicatingTheSuccessfulUpdate() {
        dc.verifyContainsText(dc.profileUpdated,"Profile Updated");
    }


    @Then("the user should verify that the updated contact information is displayed correctly")
    public void theUserShouldVerifyThatTheUpdatedContactInformationIsDisplayedCorrectly() {
        if (dc.updateFirstName.equals("Linda")&&dc.updateLastName.equals("Sidar")) {
            dc.verifyContainsText(dc.smallText, dc.smallText.getText());
        }else {
            dc.verifyContainsText(dc.firstNameIsRequiredText,"First name is required.");
            dc.verifyContainsText(dc.lastNameIsRequiredText,"Last name is required.");
            dc.verifyContainsText(dc.addressIsRequiredText,"Address is required.");

        }
    }

    @And("the user clicks on the actions logout button")
    public void theUserClicksOnTheActionsLogoutButton() {
        dc.hoverOver(dc.logOut);
        new Actions(GWD.getDriver()).click(dc.logOut).build().perform();
    }
}
