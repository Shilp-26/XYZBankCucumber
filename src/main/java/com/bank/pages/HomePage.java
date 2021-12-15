package com.bank.pages;

import com.aventstack.extentreports.Status;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLoginTab;


    @FindBy(xpath = "//button[normalize-space()='Customer Login']")
    WebElement customerLoginTab;


    public void clickOnBankManagerLoginTab() {
        clickOnElement(bankManagerLoginTab);
        log.info("Clicking on Bank Manager Login Button " + bankManagerLoginTab.toString());
    }



    public void clickOnCustomerLogin() {
        clickOnElement(customerLoginTab);
        log.info("Clicking on Customer Login button  " + customerLoginTab.toString());
    }
}
