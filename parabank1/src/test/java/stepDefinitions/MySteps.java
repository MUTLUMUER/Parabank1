package stepDefinitions;

import Pages.DialougeContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MySteps {
    DialougeContent dc=new DialougeContent();

    @Given("Navigate to Parabank")
    public void navigateToParabank() {
        GWD.getDriver().get("https://parabank.parasoft.com/");
    }
    @When("Enter credentials in register page")
    public void enterCredentialsInRegisterPage() {
        dc.myClick(dc.register);
        dc.mySendKeys(dc.firstName, "Cemal");
        dc.mySendKeys(dc.lastName, "Süreyya");
        dc.mySendKeys(dc.address, "Bakırköy");
        dc.mySendKeys(dc.city, "İstanbul");
        dc.mySendKeys(dc.state,"Türkiye");
        dc.mySendKeys(dc.zipCode, "12345");
        dc.mySendKeys(dc.phone, "12345678");
        dc.mySendKeys(dc.ssn, "00000");
        dc.mySendKeys(dc.username, "sdetears");
        dc.mySendKeys(dc.pass, "11111");
        dc.mySendKeys(dc.confirmPass, "11111");
        dc.myClick(dc.submit);


    }

    @Then("User should register successfully")
    public void userShouldRegisterSuccessfully() {
        Assert.assertTrue(dc.successmsg.isDisplayed(),"Registration is failed");

    }


}
