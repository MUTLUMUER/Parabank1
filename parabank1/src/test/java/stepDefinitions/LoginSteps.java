package stepDefinitions;

import Pages.DialougeContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginSteps {
    DialougeContent dc=new DialougeContent();
    @When("Enter username and password click login button")
    public void enterUsernameAndPasswordClickLoginButton() {
        dc.mySendKeys(dc.loginUsername,"sdetears");
        dc.mySendKeys(dc.loginPass,"11111");
        dc.myClick(dc.loginButton);

    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.verifyContainsText(dc.welcomeText,"Welcome");
    }

    @When("Enter invalid {string} and {string} click login button")
    public void enterInvalidAndClickLoginButton(DataTable textBoxVeYazilar) {
        List< List<String> > listTxtYazi= textBoxVeYazilar.asLists(String.class);

        for (int i = 0; i < listTxtYazi.size(); i++) {
            WebElement txtBoxWebElemnt= dc.getWebElement(listTxtYazi.get(i).get(0));
            dc.mySendKeys(txtBoxWebElemnt, listTxtYazi.get(i).get(1));
        }
    }
    @Then("User shouldNot login successfully")
    public void userShouldNotLoginSuccessfully() {
        dc.verifyContainsText(dc.errorText,"Error");
    }
}
