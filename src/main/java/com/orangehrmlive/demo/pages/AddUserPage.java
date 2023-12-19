package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddUserPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddUserPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h6[normalize-space()='Add User']")
    WebElement verifyAddUserText;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
    WebElement mouseHoverOnUserRole;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']")
    WebElement userRollDropdown;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement addEmployeeName;
    @CacheLookup
    @FindBy(xpath = "//div[@role='listbox']")
    WebElement employeeName;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement enterUsername;

    @CacheLookup
    @FindBy(xpath = "(//i)[12]")
    WebElement dropDownSelectStatus;


    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Disabled')]")
    WebElement statusDropdownOnAddUserPage;

    @CacheLookup
    @FindBy(xpath = "//select[@id='systemUser_status']")
    WebElement statusDropdown;


    @CacheLookup
    @FindBy(xpath = "(//input[@type='password'])[1]")
    WebElement enterPassword;


    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement clickOnSaveButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement clickOnAddButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    WebElement clickOnCancelButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'oxd-toast-content oxd-toast-content--success']")
    WebElement getTextForSuccessfullyMessageAfterSavedAddedUser;


    public String verifyAddUserText() {
        log.info("verify Add User text : " + verifyAddUserText.toString());
        return getTextFromElement(verifyAddUserText);
    }

    public void mouseHoverOnUserRole() {
        mouseHoverToElementAndClick(mouseHoverOnUserRole);
        log.info("Mouse hover on user role : " + mouseHoverOnUserRole.toString());

    }

    public void selectOnUserRoleDropDown() {
        mouseHoverToElementAndClick(userRollDropdown);
        log.info("Select User role : " + userRollDropdown.toString());
    }
    public void dropDownSelectStatus() {
        mouseHoverToElementAndClick(dropDownSelectStatus);
        log.info("Mouse hover on Status : " + dropDownSelectStatus.toString());
    }

    public void statusDropdownOnAddUserPage(){
        clickOnElement(statusDropdownOnAddUserPage);
        log.info("Select Status : " + statusDropdownOnAddUserPage.toString());
    }


    public void addEmployeeName(String employeeName) {
        sendTextToElement(addEmployeeName, employeeName);
        log.info("Add Employee name : " + addEmployeeName.toString());
    }
    public void employeeName(){
        mouseHoverToElementAndClick(employeeName);
        log.info("Employee name : " + employeeName.toString());
    }
    public void enterUsername(String username) {
        sendTextToElement(enterUsername, username);
        log.info("Enter username : " + enterUsername.toString());

    }

    public void enterPassword(String password) {
        sendTextToElement(enterPassword, password);
        log.info("Enter password : " + enterPassword.toString());
    }

    public void confirmPassword(String confirmPassword) {
        sendTextToElement(confirmPasswordField, confirmPassword);
        log.info("Confirm password : " + confirmPasswordField.toString());
    }

    public void clickOnSaveButton() {
        clickOnElement(clickOnSaveButton);
        log.info("Click on save button : " + clickOnSaveButton.toString());
    }
    public void clickOnAddButton() {
        clickOnElement(clickOnAddButton);
        log.info("Click on Add button : " + clickOnAddButton.toString());
    }
    public void clickOnCancelButton() {
        clickOnElement(clickOnCancelButton);
        log.info("Click on cancel button : " + clickOnCancelButton.toString());
    }

    public String getTextForSuccessfullyMessageAfterSavedAddedUser() {
        log.info("Get Successful Message : " + getTextForSuccessfullyMessageAfterSavedAddedUser.toString());
        return getTextFromElement(getTextForSuccessfullyMessageAfterSavedAddedUser);

    }
}