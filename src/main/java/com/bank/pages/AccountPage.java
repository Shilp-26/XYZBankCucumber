package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    public AccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[normalize-space()='Deposit']")
    WebElement deposit;

    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amount;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement depositBtn;

    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement verifyMsg;

    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
    WebElement withdrawltab;

    @FindBy(xpath = "//button[normalize-space()='Withdraw']")
    WebElement withdrawlBtn;

    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement transactionMsg;


    public void clickOnWithdrawlTab() {
        clickOnElement(withdrawltab);

    }

    public void clickOnWithdrawlBtn() {
        clickOnElement(withdrawlBtn);
        log.info("Clicking on withdrawl tab " + withdrawlBtn.toString());
    }

    public void verifyTransactionSuccessfullMsg(String text) {
        verifyThatTextIsDisplayed(transactionMsg, text);

    }


    public void clickOnDepositTab() {
        clickOnElement(deposit);
        log.info("clicking on Deposit tab " + deposit.toString());
    }

    public void enterDepositAmount(String depAmount) {
        sendTextToElement(amount, depAmount);
        log.info("Entering Deposit amount " + amount.toString());
    }

    public void enterWithdrawlAmount(String witAmount) {
        sendTextToElement(amount, witAmount);
    }

    public void clickOnDepositBtn() {
        clickOnElement(depositBtn);
        log.info("clicking on Deposit button " + depositBtn.toString());
    }

    public void verifyDepositMsg(String msg) {
        verifyThatTextIsDisplayed(verifyMsg, msg);
        log.info("Verifying deposit successful message " + verifyMsg.toString());
    }
}
