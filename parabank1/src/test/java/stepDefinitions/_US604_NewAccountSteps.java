package stepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class _US604_NewAccountSteps {
    DialogContent dc = new DialogContent();


    @And("the user selects the account type as Checking")
    public void theUserSelectsTheAccountTypeAsChecking() {
        Select checking=new Select(dc.selectType);
        checking.selectByIndex(0);
    }

    @And("the user selects the initial balance for the checking account")
    public void theUserSelectsTheInitialBalanceForTheCheckingAccount(){
        Select minimumAccount=new Select(dc.minimumAccount);
        minimumAccount.selectByIndex(0);
        dc.verifyContainsText(dc.minBalance,"A minimum of");
    }
    @And("the user clicks on the Open New Account button")
    public void theUserClicksOnTheOpenNewAccountButton() {
        dc.hoverOver(dc.openNewAccountButton);
        new Actions(GWD.getDriver()).click(dc.openNewAccountButton).build().perform();
    }

    @Then("the user should receive a confirmation message with the new account number")
    public void theUserShouldReceiveAConfirmationMessageWithTheNewAccountNumber() {

        dc.verifyContainsText(dc.AccountOpenedText,"Account Opened!");
        dc.verifyContainsText(dc.newAccountId,dc.newAccountId.getText());
    }


    @And("the user selects the account type as Savings")
    public void theUserSelectsTheAccountTypeAsSavings() {
        Select checking=new Select(dc.selectType);
        checking.selectByIndex(1);
    }

    @And("the user selects the initial balance for the Savings account")
    public void theUserSelectsTheInitialBalanceForTheSavingsAccount() {
        Select minimumAccount=new Select(dc.minimumAccount);
        minimumAccount.selectByIndex(0);
        dc.verifyContainsText(dc.minBalance,"A minimum of");
    }

    @And("the user clicks on the actions Open New Account button")
    public void theUserClicksOnTheActionsOpenNewAccountButton() {
        dc.hoverOver(dc.openNewAccountButton);
        new Actions(GWD.getDriver()).click(dc.savingsOpenNewAccountButton).build().perform();
    }
}
