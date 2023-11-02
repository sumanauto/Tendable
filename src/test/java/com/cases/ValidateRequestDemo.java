package com.cases;

import com.pageObjects.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.actions.Actions;
import com.base.Base;

public class ValidateRequestDemo  extends Base{
    public WebDriver driver;
    public Actions actions;

    private Logger log = LogManager.getLogger(ValidateTopLevelMenus.class.getName());
    @BeforeTest
    public void initialize() throws IOException {
        driver = initializeDriver();
        log.info("Driver is initialized.");
        actions = new Actions(driver);
        actions.navigateTo(prop.getProperty("url"));
    }
    @Test
    public void checkRequestDemo() throws IOException {

        HomePage hp = new HomePage(driver);
        RequestDemoPage rp=new RequestDemoPage(driver);
        Assert.assertTrue(hp.getRequestButton().isDisplayed());
        log.info("RequestDemo is displayed on top menu of Home Page");
        hp.getRequestButton().isEnabled();
        hp.getRequestButton().click();
        Assert.assertTrue(rp.getRequestTitle().isDisplayed());
        log.info("Request form is Accessible ");



    }
    @AfterTest
    public void teardown() {
        driver.close();
        log.info("Driver is closed");
    }
}
