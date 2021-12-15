package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCutomerPage extends Utility {

    private static final Logger log = LogManager.getLogger(AddCutomerPage.class.getName());

    public AddCutomerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;

    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCode;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement addCutomerBtn;

    public void enterFirstName(String name) {
        sendTextToElement(firstName, name);
        log.info("Entering first name " + firstName.toString());
    }

    public void enterLastName(String surname) {
        sendTextToElement(lastName, surname);
        log.info("Entering last name " + lastName.toString());
    }

    public void enterPostCode(String postcode) {
        sendTextToElement(postCode, postcode);
        log.info("Entering post code " + postCode.toString());
    }

    public void clickOnAddCutomerBtn() {
        clickOnElement(addCutomerBtn);
        log.info("Clicking on add customer button " + addCutomerBtn.toString());
    }

    public void alertTextVerify(String expMsg) throws InterruptedException {
        Thread.sleep(2000);
        String Message = getTextFromAlert();
        verifyText(expMsg, Message, "Error, Message not displayed as expected");

    }

}
