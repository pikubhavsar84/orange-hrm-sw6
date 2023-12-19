package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ViewSystemUserPage extends Utility {
    private static final Logger log = LogManager.getLogger(ViewSystemUserPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='System Users']")
    WebElement verifySystemUsersText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement enterUsername;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']")
    WebElement clickOnDropdownUserRoleButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-select-text-input'][normalize-space()='Admin']")
    WebElement userRollDropdownButton;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement ananyaDash;

    @CacheLookup
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement userName;

    @CacheLookup
    @FindBy(xpath = "//i[@class= 'oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
    WebElement clickOnStatusDropDownButton;
    @CacheLookup
    @FindBy(xpath = "//select[@id='searchSystemUser_status']")
    WebElement statusUserDropdown;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement clickOnSearchButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    WebElement clickOnResetButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement clickOnAddButton;

    @CacheLookup
    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
    WebElement clickOnDeleteButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Yes, Delete']" )
    WebElement clickOnYesDeleteButton;

    public void addEmployeeName(String name) {
        sendTextToElement(ananyaDash, name);
        log.info("Getting text from employee name : " + ananyaDash.toString());
    }

    public void addUserName(String user) {
        sendTextToElement(userName, user);
        log.info("Add username : " + userName.toString());
    }
    public String verifySystemUsersText() {
        log.info("Getting text from View system users text: " + verifySystemUsersText.toString());
        return getTextFromElement(verifySystemUsersText);
    }

    public void enterUsername(String username) {
        sendTextToElement(enterUsername, username);
        log.info("Enter username : " + enterUsername.toString());
    }
    public void clickOnDropdownUserRoleButton(){
        mouseHoverToElementAndClick(clickOnDropdownUserRoleButton);
        log.info("Click on user role drop down : " + clickOnDropdownUserRoleButton.toString());
    }
    public void selectSearchUserRole() {
        mouseHoverToElementAndClick(userRollDropdownButton);
        log.info("Mouse hover on user role and click : " + userRollDropdownButton.toString());
    }

//    public void enterEmployeeName(String name) {
//        CustomListeners.test.log(Status.PASS, "Entered employee name");
//        selectByValueFromDropDown(enterEmployeeName, name);
//    }

    public void clickOnStatusDropDownButton(){
        mouseHoverToElementAndClick(clickOnStatusDropDownButton);
        log.info("Mouse hover on status drop down adn click : " + clickOnStatusDropDownButton.toString());
    }

    public void statusUserDropdown() {
        mouseHoverToElementAndClick(statusUserDropdown);
        log.info("Mouse hover on user status dropdown and click : " + statusUserDropdown.toString());
    }

    public void clickOnSearchButton() {
        clickOnElement(clickOnSearchButton);
        log.info("Click on search button : " + clickOnSearchButton.toString());
    }

    public void clickOnResetButton() {
        clickOnElement(clickOnResetButton);
        log.info("Click on reset button : " + clickOnResetButton.toString());
    }

    public void clickOnAddButton() {
        clickOnElement(clickOnAddButton);
        log.info("Click on add button : " + clickOnAddButton.toString());
    }
    public void clickOnDeleteButton() {
        clickOnElement(clickOnDeleteButton);
        log.info("Click on delete button : " + clickOnDeleteButton.toString());
    }

    public void clickOnYesDeleteButton(){
        clickOnElement(clickOnYesDeleteButton);
        log.info("Click on yes delete button : " + clickOnYesDeleteButton.toString());
    }

}