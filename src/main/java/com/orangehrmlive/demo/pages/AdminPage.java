package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends Utility {
    private static final Logger log = LogManager.getLogger(AdminPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//a[@id='menu_admin_UserManagement']")
    WebElement clickOnUserManagement;

    @CacheLookup
    @FindBy(xpath = "//a[@id='menu_admin_Job']")
    WebElement clickOnJob;

    @CacheLookup
    @FindBy(xpath = "//a[@id='menu_admin_Organization']")
    WebElement clickOnOrganizationLink;

    public void clickOnUserManagement() {
        clickOnElement(clickOnUserManagement);
        log.info("Click on user management : " + clickOnUserManagement.toString());

    }
    public void clickOnJob() {
        clickOnElement(clickOnJob);
        log.info("Click on job : " + clickOnJob.toString());
    }
    public void clickOnOrganizationLink() {
        clickOnElement(clickOnOrganizationLink);
        log.info("Click on organization link : " + clickOnOrganizationLink.toString());

    }
}