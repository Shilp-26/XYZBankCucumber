package com.bank.pages;

import com.aventstack.extentreports.Status;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());

    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement userName;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginBtn;

    @FindBy(xpath = "//label[normalize-space()='Your Name :']")
    WebElement yourNameTxt;




    public void selectUser(String name){
        selectByVisibleTextFromDropDown(userName,name);
        log.info("Selecting user  " + userName.toString());
    }
    public void clickOnLoginBtn(){
        clickOnElement(loginBtn);
        log.info("Clicking on Login Button  " + loginBtn.toString());
    }
    public void verifyYourNameText(String text){
        verifyThatTextIsDisplayed(yourNameTxt,text);

    }
}
