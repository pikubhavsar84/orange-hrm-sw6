package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//input[@name='username']")
    WebElement usernamefield;

    @CacheLookup
    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordfield;

    @CacheLookup
    @FindBy(xpath = ("//button[normalize-space()='Login']"))
    WebElement loginButton;


    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Username : Admin']")
    WebElement verifyUsernameAdminText;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Password : admin123']")
    WebElement verifyPasswordadmin123Text;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement logout;
    @CacheLookup
    @FindBy(xpath = "//div[@id='logInPanelHeading']")
    WebElement verifyLoginPanel;
    @CacheLookup
    @FindBy(xpath = "//a[@id='welcome']")
    WebElement userprofilelogo;

    @CacheLookup
    @FindBy(xpath = ("(//img[@alt='orangehrm-logo'])[2]"))
    WebElement logoElement;
    @CacheLookup
    @FindBy(xpath = ("(//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']"))
    WebElement loginPanel;

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'][normalize-space()='Required'])[2]")
    WebElement requiredErrorMessage;

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    WebElement invalidCredentialsMessage;

    public String getTextForLoginPanel() {
        log.info("Getting text from Login panel : " + loginPanel.toString());
        return getTextFromElement(loginPanel);
    }
    public String getErrorMessage(){
        log.info("Getting text from error message : " + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

    public String getLogoElement() {
        log.info("Getting logo : " + logoElement.toString());
        return getTextFromElement(logoElement);
    }

    public void enterUserName(String username) {
        sendTextToElement(usernamefield, username);
        log.info("Enter username : " + usernamefield.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordfield, password);
        log.info("Enter password : " + passwordfield.toString());
    }

    public void ClickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Click on login button : " + loginButton.toString());
    }


    public void mouseHoverAndClickOnLogout() {
        mouseHoverToElement(logout);
        mouseHoverToElementAndClick(logout);
        log.info("Mouse hover on logout link : " + logout.toString());
        log.info("Mouse hover on logout link and click : " + logout.toString());
    }

    public String verifyUsernameAdminText() {
        log.info("Getting text from verifying username admin : " + verifyUsernameAdminText.toString());
        return getTextFromElement(verifyUsernameAdminText);

    }

    public String verifyPasswordadmin123Text() {
        log.info("Getting text from password admin123: " + verifyPasswordadmin123Text.toString());
        return getTextFromElement(verifyPasswordadmin123Text);

    }

    public String verifyLoginPanel() {
        log.info("Getting text from verify login panel: " + verifyLoginPanel.toString());
        return getTextFromElement(verifyLoginPanel);

    }
    public void ClickOnUserProfileLogo() {
        clickOnElement(userprofilelogo);
        log.info("Getting text from user profile logo: " + userprofilelogo.toString());
    }

    public String requiredErrorMessage() {
        log.info("Getting text from Required error message : " + requiredErrorMessage.toString());
        return getTextFromElement(requiredErrorMessage);
    }
    public String invalidCredentialsMessage() {
        log.info("Getting text from Invalid credentials message: " + invalidCredentialsMessage.toString());
        return getTextFromElement(invalidCredentialsMessage);
    }

}