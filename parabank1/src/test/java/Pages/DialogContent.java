package Pages;


import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends ParentPage {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Register']")
    public WebElement register;
    @FindBy(id = "customer.firstName")
    public WebElement firstName;

    @FindBy(id = "customer.lastName")
    public WebElement lastName;

    @FindBy(id = "customer.address.street")
    public WebElement adress;

    @FindBy(id = "customer.address.city")
    public WebElement city;

    @FindBy(id = "customer.address.state")
    public WebElement state;

    @FindBy(id = "customer.address.zipCode")
    public WebElement zipCode;

    @FindBy(id = "customer.phoneNumber")
    public WebElement phoneNumber;

    @FindBy(id = "customer.ssn")
    public WebElement ssn;

    @FindBy(id = "customer.username")
    public WebElement userName;

    @FindBy(id = "customer.password")
    public WebElement password;

    @FindBy(id = "repeatedPassword")
    public WebElement repeatedPassword;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement registerButton;

    @FindBy(xpath = "(//input[@type='submit'])[1]")
    public WebElement loginButton;
    @FindBy(xpath = "//a[text()='Log Out']")
    public WebElement logOut;
    @FindBy(xpath = "//b[text()='Welcome']")
    public WebElement welcomeText;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement loginUserName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement loginPassword;

    @FindBy(xpath = "//h1[text()='Error!']")
    public WebElement errorText;
    @FindBy(xpath = "//a[text()='Bill Pay']")
    public WebElement payBill;

    @FindBy(xpath = "//input[@name='payee.name']")
    public WebElement payeeName;
    @FindBy(xpath = "//input[@name='payee.address.street']")
    public WebElement payeeAddress;
    @FindBy(xpath = "//input[@name='payee.address.city']")
    public WebElement payeeCity;
    @FindBy(xpath = "//input[@name='payee.address.state']")
    public WebElement payeeState;
    @FindBy(xpath = "//input[@name='payee.address.zipCode']")
    public WebElement payeeZipCode;
    @FindBy(xpath = "//input[@name='payee.phoneNumber']")
    public WebElement payeePhoneNumber;
    @FindBy(xpath = "//input[@name='payee.accountNumber']")
    public WebElement payeeAccount;
    @FindBy(xpath = "//input[@name='verifyAccount']")
    public WebElement payeeVerifyAccount;
    @FindBy(xpath = "//input[@name='amount']")
    public WebElement payeeAmount;
    @FindBy(xpath = "//input[@value='Send Payment']")
    public WebElement sendPayment;
    @FindBy(xpath = "//h1[text()='Bill Payment Complete']")
    public WebElement paymentCompleteText;
    @FindBy(xpath = "//a[text()='Accounts Overview']")
    public WebElement accountsOverview;
    @FindBy(xpath = "//a[@class='ng-binding']")
    public WebElement paymentAccount;
    @FindBy(xpath = "//a[contains(text(),'Bill Payment to')]")
    public WebElement billPaymentText;
    @FindBy(xpath = "//td[@id='accountId']")
    public WebElement accountNumber;
    @FindBy(xpath = "(//option[contains(text(),'')])[1]")
    public WebElement fromAccount;
    @FindBy(xpath = "//span[@id='fromAccountId']")
    public WebElement successAcount;
    @FindBy(xpath = "//span[@id='amount']")
    public WebElement successAmount;
    @FindBy(xpath = "(//td[@class='ng-binding ng-scope'])[2]")
    public WebElement debitAmount;
    @FindBy(xpath = "//a[text()='Open New Account']")
    public WebElement openNewAccount;
    @FindBy(xpath = "//select[@id='type']")
    public WebElement selectType;
    @FindBy(xpath = "//select[@id='fromAccountId']")
    public WebElement minimumAccount;
    @FindBy(xpath = "//b[text()='A minimum of $100,00 must be deposited into this account at time of opening. Please choose an existing account to transfer funds into the new account.']")
    public WebElement minBalance;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement openNewAccountButton;
    @FindBy(xpath = "//h1[text()='Account Opened!']")
    public WebElement AccountOpenedText;
    @FindBy(xpath = "//a[@id='newAccountId']")
    public WebElement newAccountId;
    @FindBy(xpath = "(//*[@class='button'])[2]")
    public WebElement savingsOpenNewAccountButton;
    @FindBy(xpath = "//a[text()='Update Contact Info']")
    public WebElement updateContactInfo;
    @FindBy(id = "customer.firstName")
    public WebElement updateFirstName;
    @FindBy(id = "customer.lastName")
    public WebElement updateLastName;
    @FindBy(id = "customer.address.street")
    public WebElement updateAddress;
    @FindBy(id = "customer.address.city")
    public WebElement updateCity;
    @FindBy(id = "customer.address.state")
    public WebElement updateState;
    @FindBy(id = "customer.address.zipCode")
    public WebElement updateZipCode;
    @FindBy(id = "customer.phoneNumber")
    public WebElement updatePhoneNumber;
    @FindBy(xpath = "//input[@value='Update Profile']")
    public WebElement updateProfileButton;
    @FindBy(xpath = "//h1[text()='Profile Updated']")
    public WebElement profileUpdated;
    @FindBy(xpath = "//p[@class='smallText']")
    public WebElement smallText;
    @FindBy(xpath = "//span[text()='First name is required.']")
    public WebElement firstNameIsRequiredText;
    @FindBy(xpath = "//span[text()='Last name is required.']")
    public WebElement lastNameIsRequiredText;
    @FindBy(xpath = "//span[text()='Address is required.']")
    public WebElement addressIsRequiredText;
    @FindBy(xpath = "//a[text()='Transfer Funds']")
    public WebElement transferFunds;
    @FindBy(xpath = "//input[@id='amount']")
    public WebElement amount;
    @FindBy(xpath = "//input[@value='Transfer']")
    public WebElement transferButton;
    @FindBy(xpath = "//span[@id='fromAccountId']")
    public WebElement fromAccountIdText;
    @FindBy(xpath = "//span[@id='toAccountId']")
    public WebElement toAccountIdText;
    @FindBy(xpath = "//span[@id='amount']")
    public WebElement amountText;
    @FindBy(xpath = "//h1[text()='Transfer Complete!']")
    public WebElement transferCompleteText;
    @FindBy(xpath = "//a[contains(@href,'activity.htm?id=')]")
    public WebElement accountInAccounts;
    @FindBy(xpath = "//select[@id='fromAccountId']")
    public WebElement selectFromAccountId;
    @FindBy(xpath = "//select[@id='toAccountId']")
    public WebElement selectToAccountId;
    @FindBy(xpath = "//td[text()='$500.00']")
    public WebElement fundTransferReceivedText;
    @FindBy(xpath = "(//a[text()='Funds Transfer Received'])[1]")
    public WebElement fundsTransferReceived;
    @FindBy(xpath = "(//td[contains(text(),'')])[2]")
    public WebElement TransactionIDText;
    @FindBy(xpath = "//a[text()='Find Transactions']")
    public WebElement findTransactions;
    @FindBy(xpath = "//input[@id='criteria.transactionId']")
    public WebElement transactionIdInput;
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement findTransactionsButton;
    @FindBy(xpath = "//span[text()='$500.00']")
    public WebElement transactionResultsText;
    @FindBy(xpath = "//a[text()='Request Loan']")
    public WebElement requestLoan;
    @FindBy(xpath = "//input[@id='amount']")
    public WebElement inputLoanAmount;
    @FindBy(xpath = "//input[@id='downPayment']")
    public WebElement inputDownPayment;
    @FindBy(xpath = "//select[@id='fromAccountId']")
    public WebElement selectLoanFromAccountId;
    @FindBy(xpath = "//input[@value='Apply Now']")
    public WebElement applyNowButton;
    @FindBy(xpath = "//td[@id='loanStatus']")
    public WebElement loanStatus;
    @FindBy(xpath = "//p[text()='Congratulations, your loan has been approved.']")
    public WebElement congratulationsText;
    @FindBy(xpath = "//a[@id='newAccountId']")
    public WebElement newAccountIdTextButton;
    @FindBy(xpath = "//td[@id='accountType']")
    public WebElement accountType;
    @FindBy(xpath = "//td[@id='accountId']")
    public WebElement accountId;
    @FindBy(xpath = "//td[@id='balance']")
    public WebElement balance;
    @FindBy(xpath = "//td[@id='availableBalance']")
    public WebElement availableBalance;
    @FindBy(xpath = "//b[text()='No transactions found.']")
    public WebElement noTransactionsFoundText;
    @FindBy(xpath = "//h1[text()='Loan Request Processed']")
    public WebElement loanRequestProcessedText;
    @FindBy(xpath = "//p[@class='error ng-scope']")
    public WebElement downPaymentText;



    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "payBill":
                return this.payBill;
            case "payeeName":
                return this.payeeName;
            case "payeeAddress":
                return this.payeeAddress;
            case "payeeCity":
                return this.payeeCity;
            case "payeeState":
                return this.payeeState;
            case "payeeZipCode":
                return this.payeeZipCode;
            case "payeePhoneNumber":
                return this.payeePhoneNumber;
            case "payeeAccount":
                return this.payeeAccount;
            case "payeeVerifyAccount":
                return this.payeeVerifyAccount;
            case "payeeAmount":
                return this.payeeAmount;
            case "sendPayment":
                return this.sendPayment;
            case "accountsOverview":
                return this.accountsOverview;
            case "paymentAccount":
                return this.paymentAccount;
            case "openNewAccountButton":
                return this.openNewAccountButton;
            case "openNewAccount":
                return this.openNewAccount;
            case "savingsOpenNewAccountButton":
                return this.savingsOpenNewAccountButton;
            case "updateContactInfo":
                return this.updateContactInfo;
            case "updateFirstName":
                return this.updateFirstName;
            case "updateLastName":
                return this.updateLastName;
            case "updateAddress":
                return this.updateAddress;
            case "updateCity":
                return this.updateCity;
            case "updateState":
                return this.updateState;
            case "updateZipCode":
                return this.updateZipCode;
            case "updatePhoneNumber":
                return this.updatePhoneNumber;
            case "updateProfileButton":
                return this.updateProfileButton;
            case "transferFunds":
                return this.transferFunds;
            case "transferButton":
                return this.transferButton;
            case "accountInAccounts":
                return this.accountInAccounts;
            case "requestLoan":
                return this.requestLoan;
            case "applyNowButton":
                return this.applyNowButton;
            case "newAccountIdTextButton":
                return this.newAccountIdTextButton;


        }

        return null;
    }


}
