package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());

    public OpenAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "userSelect")
    WebElement selectCustomer;

    @FindBy(id = "currency")
    WebElement currency;

    @FindBy(xpath = "//button[normalize-space()='Home']")
    WebElement navigateHomePage;

    @FindBy(xpath = "//button[normalize-space()='Process']")
    WebElement processBtn;

public void clickOnHomeBtn(){
    clickOnElement(navigateHomePage);
}
    public void selectCustomerDropdown(String name) {
        selectByVisibleTextFromDropDown(selectCustomer, name);
        log.info("Selecting Customer Name " + selectCustomer.toString());
    }

    public void selectCurrency(String selectCurrency) {
        selectByVisibleTextFromDropDown(currency, selectCurrency);
        log.info("Selecting Currency " + currency.toString());
    }

    public void clickOnProcessBtn() {
        clickOnElement(processBtn);
        log.info("Clicking on Process Button " + processBtn.toString());
    }

    public void alertAccountTextVerify(String expMsg) throws InterruptedException {
        Thread.sleep(2000);
        String message = getTextFromAlert();
        verifyText("Error, Message not displayed as expected", message, expMsg);

    }

}
