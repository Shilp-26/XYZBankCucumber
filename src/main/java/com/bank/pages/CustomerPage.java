package com.bank.pages;

import com.aventstack.extentreports.Status;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage extends Utility {

    private static final Logger log = LogManager.getLogger(CustomerPage.class.getName());

    public CustomerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[normalize-space()='Logout']")
    WebElement logoutTab;


    public void verifyLogOutTab(String msg) {
        verifyThatTextIsDisplayed(logoutTab, msg);
        log.info("Verifying log out tab is displayed   " + logoutTab.toString());
    }
    public void clickOnLogout(){
        clickOnElement(logoutTab);
        log.info("Clicking on log out   " + logoutTab.toString());
    }
}
