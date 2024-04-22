package stepDefinitions;

import Pages.DialogContent;
import Utilities.Tools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class _US606_MoneyTransferSteps {
    DialogContent dc=new DialogContent();

    @When("Money transfer between my accounts")
    public void moneyTransferBetweenMyAccounts() {
        Tools.Wait(1);
        //String randomMoney= RandomStringUtils.randomNumeric(3);
        dc.mySendKeys(dc.amount,"500");
        dc.wait.until(ExpectedConditions.visibilityOf(dc.selectFromAccountId));
        Select fromAcconunt=new Select(dc.selectFromAccountId);
        fromAcconunt.selectByIndex(0);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.selectToAccountId));
        Select toAccount=new Select(dc.selectToAccountId);
        toAccount.selectByIndex(0);
        System.out.println(dc.amount.getText());


    }

    @And("The user verify money transfer details")
    public void theUserVerifyMoneyTransferDetails() {
        dc.verifyContainsText(dc.transferCompleteText,"Transfer Complete!");
        dc.verifyContainsText(dc.amountText,"500");
        dc.verifyContainsText(dc.fromAccountIdText,dc.toAccountIdText.getText());
    }

    @Then("The user verify fund transfer received details")
    public void theUserVerifyFundTransferReceivedDetails() {

        dc.verifyContainsText(dc.fundTransferReceivedText,"$500.00");
    }

    @When("the user saves the transaction ID in the payment details section")
    public void theUserSavesTheTransactionIDInThePaymentDetailsSection() {
        dc.myClick(dc.fundsTransferReceived);
        String transactionID=dc.TransactionIDText.getText();
        dc.myClick(dc.findTransactions);
        dc.mySendKeys(dc.transactionIdInput,transactionID);
        Tools.Wait(2);
        dc.myClick(dc.findTransactionsButton);


    }

    @Then("The user verify after transaction ID fund transfer received details")
    public void theUserVerifyAfterTransactionIDFundTransferReceivedDetails() {
        dc.verifyContainsText(dc.transactionResultsText,"$500.00");


    }
}
