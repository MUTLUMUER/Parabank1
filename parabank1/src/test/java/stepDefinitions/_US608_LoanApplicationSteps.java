package stepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;

public class _US608_LoanApplicationSteps {
    DialogContent dc=new DialogContent();
    @Then("the user fills out the loan application form with the following details:")
    public void theUserFillsOutTheLoanApplicationFormWithTheFollowingDetails() {
        dc.mySendKeys(dc.inputLoanAmount,"2000");
        dc.mySendKeys(dc.inputDownPayment,"400");
        Select loanSelect=new Select(dc.selectLoanFromAccountId);
        loanSelect.selectByIndex(0);
    }
    @Then("The user should receive a confirmation message for the successful request loan")
    public void theUserShouldReceiveAConfirmationMessageForTheSuccessfulRequestLoan() {
        dc.verifyContainsText(dc.loanStatus,"Approved");
        dc.verifyContainsText(dc.congratulationsText,"Congratulations");
    }
    @Then("The user should verify request loan complate account id details after click on the account id")
    public void theUserShouldVerifyRequestLoanComplateAccountIdDetailsAfterClickOnTheAccountId() {
        dc.verifyContainsText(dc.accountType,"LOAN");
        dc.verifyContainsText(dc.balance,"$2000.00");
        dc.verifyContainsText(dc.availableBalance,"$2000.00");
        dc.verifyContainsText(dc.noTransactionsFoundText,"No transactions found.");
    }
    @Then("the user fills out the negative loan application form with the following details:")
    public void theUserFillsOutTheNegativeLoanApplicationFormWithTheFollowingDetails() {
        dc.mySendKeys(dc.inputLoanAmount,"1000000");
        dc.mySendKeys(dc.inputDownPayment,"10000");
        Select loanSelect=new Select(dc.selectLoanFromAccountId);
        loanSelect.selectByIndex(0);
    }
    @Then("The user should receive some message for the denied request loan")
    public void theUserShouldReceiveSomeMessageForTheDeniedRequestLoan() {
        dc.verifyContainsText(dc.loanRequestProcessedText,"Loan Request Processed");
        dc.verifyContainsText(dc.loanStatus,"Denied");
        dc.verifyContainsText(dc.downPaymentText,"We cannot grant a loan in that amount with your available funds and down payment.");
    }
}
