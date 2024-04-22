package stepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _US602_LoginSteps {
    DialogContent dc = new DialogContent();

    @When("The user enters valid username, password and click login button")
    public void theUserEntersValidUsernamePasswordAndClickLoginButton() {
        dc.mySendKeys(dc.loginUserName, "gokhan1");
        dc.mySendKeys(dc.loginPassword, "456987");
        dc.myClick(dc.loginButton);
    }

    @Then("The user should login successfully")
    public void theUserShouldLoginSuccessfully() {
        dc.verifyContainsText(dc.welcomeText, "Welcome");
    }

    @When("The user enters invalid username, password and click login button")
    public void theUserEntersInvalidUsernamePasswordAndClickLoginButton() {
        dc.mySendKeys(dc.loginUserName, "gkktrc");
        dc.mySendKeys(dc.loginPassword, "456944");
        dc.myClick(dc.loginButton);

    }


    @Then("The user should not login successfully")
    public void theUserShouldNotLoginSuccessfully() {
        dc.verifyContainsText(dc.errorText, "Error!");

    }


}


