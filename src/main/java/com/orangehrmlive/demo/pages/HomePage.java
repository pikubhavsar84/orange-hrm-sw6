package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(css = "img[alt='OrangeHRM']")
    WebElement orangeHrmLogo;

    @CacheLookup
    @FindBy(xpath ="//span[normalize-space()='Admin']" )
    WebElement clickOnAdminLink;

    @CacheLookup
    @FindBy(xpath ="//span[normalize-space()='PIM']")
    WebElement clickOnPimLink;

    @CacheLookup
    @FindBy(xpath = "//b[contains(text(),'Leave')]")
    WebElement clickOnLeaveLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
    WebElement clickOnDashboardLink;

    @CacheLookup
    @FindBy(xpath = "//a[@id='welcome']")
    WebElement verifyWelcomePaul;

    @CacheLookup
    @FindBy(xpath = ("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"))
    WebElement userProfileLogo;

    public void clickOnUserProfileLogo() {
        mouseHoverToElementAndClick(userProfileLogo);
    }


    public String orangeHrmLogo() {
        log.info("Getting Orange HRM logo : " + orangeHrmLogo.toString());
        return getTextFromElement(orangeHrmLogo);
    }
    public void clickOnAdminLink() {
        clickOnElement(clickOnAdminLink);
        log.info("Click on Admin Link : " + clickOnAdminLink.toString());
    }
    public void clickOnPimLink() {
        clickOnElement(clickOnPimLink);
        log.info("Click on Pim Link : " + clickOnPimLink.toString());
    }

    public void clickOnLeaveLink(){
        clickOnElement(clickOnLeaveLink);
        log.info("Click on Leave Link : " + clickOnLeaveLink.toString());
    }
    public void clickOnDashboardLink(){
        clickOnElement(clickOnDashboardLink);
        log.info("Click on Dashboard Link : " + clickOnDashboardLink.toString());
    }
    public String verifyWelcomePaul() {
        log.info("Verify Welcome Paul text : " + verifyWelcomePaul.toString());
        return getTextFromElement(verifyWelcomePaul);
    }

}