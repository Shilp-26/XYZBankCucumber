package com.bank.cucumber.steps;

import com.bank.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BankSteps {
    @When("^User clicks on bank manager login tab$")
    public void userClicksOnBankManagerLoginTab() {
        new HomePage().clickOnBankManagerLoginTab();
    }

    @Given("^User is on Homepage$")
    public void userIsOnHomepage() {
    }

    @And("^User clicks on add customer tab$")
    public void userClicksOnAddCustomerTab() {
        new BankManagerLoginPage().clickOnaddCustomerTab();
    }

    @And("^User enters first name \"([^\"]*)\"$")
    public void userEntersFirstName(String firstName) {
        new AddCutomerPage().enterFirstName(firstName);

    }

    @And("^User enters last name \"([^\"]*)\"$")
    public void userEntersLastName(String lastName) {
        new AddCutomerPage().enterLastName(lastName);
    }

    @And("^User enters postcode \"([^\"]*)\"$")
    public void userEntersPostcode(String postCode) {
        new AddCutomerPage().enterPostCode(postCode);
    }

    @And("^User clicks on add customer button$")
    public void userClicksOnAddCustomerButton() {
        new AddCutomerPage().clickOnAddCutomerBtn();
    }


    @And("^User clicks on ok button$")
    public void userClicksOnOkButton() {
        new AddCutomerPage().acceptAlert();
    }


    @When("^User clicks on open account tab$")
    public void userClicksOnOpenAccountTab() {
        new BankManagerLoginPage().clickOnOpenAccount();
    }

    @And("^User searches for the customer account \"([^\"]*)\"$")
    public void userSearchesForTheCustomerAccount(String fullName) {
new OpenAccountPage().selectCustomerDropdown(fullName);
    }

    @And("^User selects currency \"([^\"]*)\"$")
    public void userSelectsCurrency(String currency) {
        new OpenAccountPage().selectCurrency(currency);
    }

    @And("^User clicks on process button$")
    public void userClicksOnProcessButton() {
        new OpenAccountPage().clickOnProcessBtn();
    }



    @Then("^User can see \"([^\"]*)\" message popup$")
    public void userCanSeeMessagePopup(String expMsg) {
        try {
            new AddCutomerPage().alertTextVerify(expMsg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Given("^User has already got an account$")
    public void userHasAlreadyGotAnAccount() {
        new HomePage().clickOnBankManagerLoginTab();
        new BankManagerLoginPage().clickOnaddCustomerTab();
        new AddCutomerPage().enterFirstName("Sam");
        new AddCutomerPage().enterLastName("Patel");
        new AddCutomerPage().enterPostCode("HA0 2PT");
        new AddCutomerPage().clickOnAddCutomerBtn();
        new AddCutomerPage().acceptAlert();
    }

    @Given("^Customer has an account$")
    public void customerHasAnAccount() {
        new HomePage().clickOnBankManagerLoginTab();
        new BankManagerLoginPage().clickOnaddCustomerTab();
        new AddCutomerPage().enterFirstName("Sam");
        new AddCutomerPage().enterLastName("Patel");
        new AddCutomerPage().enterPostCode("HA0 2PT");
        new AddCutomerPage().clickOnAddCutomerBtn();
        new AddCutomerPage().acceptAlert();
        new OpenAccountPage().clickOnHomeBtn();
    }

    @When("^User clicks on customer login tab$")
    public void userClicksOnCustomerLoginTab() {
        new HomePage().clickOnCustomerLogin();
    }

    @And("^User clicks on login button$")
    public void userClicksOnLoginButton() {
        new CustomerLoginPage().clickOnLoginBtn();
    }

    @And("^User can see the logout tab is displayed$")
    public void userCanSeeTheLogoutTabIsDisplayed() {
        new CustomerPage().verifyLogOutTab("Logout");
    }

    @And("^User clicks on logout$")
    public void userClicksOnLogout() {
        new CustomerPage().clickOnLogout();
    }

    @Then("^User can login and logout successfully$")
    public void userCanLoginAndLogoutSuccessfully() {
    }

    @And("^User searches for the customer \"([^\"]*)\"$")
    public void userSearchesForTheCustomer(String fullName)  {
      new CustomerLoginPage().selectUser(fullName);
    }

    @Given("^Customer has an account already$")
    public void customerHasAnAccountAlready() {
        new HomePage().clickOnBankManagerLoginTab();
        new BankManagerLoginPage().clickOnaddCustomerTab();
        new AddCutomerPage().enterFirstName("John");
        new AddCutomerPage().enterLastName("Patel");
        new AddCutomerPage().enterPostCode("HA0 2PT");
        new AddCutomerPage().clickOnAddCutomerBtn();
        new AddCutomerPage().acceptAlert();
        new OpenAccountPage().clickOnHomeBtn();
    }

    @And("^User clicks on deposit tab$")
    public void userClicksOnDepositTab() {
        new AccountPage().clickOnDepositTab();
    }

    @And("^User enters amount \"([^\"]*)\"$")
    public void userEntersAmount(String amount)  {
       new AccountPage().enterDepositAmount(amount);
    }

    @And("^User clicks on deposit button$")
    public void userClicksOnDepositButton() {
        new AccountPage().clickOnDepositBtn();
    }

    @Then("^User can see the message \"([^\"]*)\"$")
    public void userCanSeeTheMessage(String expMsg)  {
        new AccountPage().verifyDepositMsg(expMsg);
    }

    @Given("^Customer has deposited money into their account$")
    public void customerHasDepositedMoneyIntoTheirAccount() {
        new HomePage().clickOnCustomerLogin();
        new CustomerLoginPage().selectUser("Harry Potter");
        new CustomerLoginPage().clickOnLoginBtn();
        new AccountPage().clickOnDepositTab();
        new AccountPage().enterDepositAmount("100");
        new AccountPage().clickOnDepositBtn();
        new AccountPage().verifyDepositMsg("Deposit Successful");
        new OpenAccountPage().clickOnHomeBtn();

    }

    @When("^User click on customer login tab$")
    public void userClickOnCustomerLoginTab() {
        new HomePage().clickOnCustomerLogin();

    }

    @And("^User clicks on withdrawl tab$")
    public void userClicksOnWithdrawlTab() {
        new AccountPage().clickOnWithdrawlTab();
    }



    @And("^User clicks on withdrawl button$")
    public void userClicksOnWithdrawlButton() {
        new AccountPage().clickOnWithdrawlBtn();
    }
}
