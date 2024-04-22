package stepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class _US601_RegisterSteps {
    DialogContent dc=new DialogContent();
    @Given("Navigate to Para Bank")
    public void navigateToParaBank() {
        GWD.getDriver().get("https://parabank.parasoft.com/");

    }

    @When("Enter the personal information and click Register button")
    public void enterThePersonalInformationAndClickRegisterButton() {
        dc.myClick(dc.register);
        dc.mySendKeys(dc.firstName,"Gökhan");
        dc.mySendKeys(dc.lastName, "Kaya");
        dc.mySendKeys(dc.adress,"Ortaca");
        dc.mySendKeys(dc.city,"Muğla");
        dc.mySendKeys(dc.state,"Türkiye");
        dc.mySendKeys(dc.zipCode,"48600");
        dc.mySendKeys(dc.phoneNumber,"90505555555");
        dc.mySendKeys(dc.ssn,"555544");
        dc.mySendKeys(dc.userName,"gokhan1");
        dc.mySendKeys(dc.password,"456987");
        dc.mySendKeys(dc.repeatedPassword,"456987");
        dc.myClick(dc.registerButton);




    }

    @Then("User should register successfully")
    public void userShouldLoginSuccessfully() {
        dc.verifyContainsText(dc.welcomeText,"Welcome");

    }
}
