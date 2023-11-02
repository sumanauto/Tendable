package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage { public WebDriver driver;

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    // All objects should be defined here
    private By contactbutton = By.xpath("(//button[text()='Contact'])[1]");
    private By fullname = By.id("form-input-fullName");
    private By phone = By.id("form-input-cellPhone");
    private By email = By.id("form-input-email");
    private By orgname = By.id("form-input-organisationName");

    private By agree = By.id("form-input-consentAgreed-0");
    private By submit = By.xpath("//button[text()='Submit']");
    private By errormsg = By.xpath("//p[text()='Sorry, there was an error submitting the form. Please try again.']");




    // All methods should be defined here
    public WebElement getContactbutton() {
        return driver.findElement(contactbutton);
    }
    public WebElement getFullname() {
        return driver.findElement(fullname);
    }
    public WebElement getOrgName() {
        return driver.findElement(orgname);
    }
    public WebElement getPhone() {
        return driver.findElement(phone);
    }
    public WebElement getEmail() {
        return driver.findElement(email);
    }
    public WebElement getAgree() {return driver.findElement(agree);
    }
    public WebElement getSubmit() {
        return driver.findElement(submit);
    }
    public WebElement geterrormsg() {
        return driver.findElement(errormsg);
    }
}

