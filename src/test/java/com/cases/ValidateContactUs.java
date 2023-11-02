package com.cases;

import com.actions.Actions;
import com.base.Base;
import com.pageObjects.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static java.lang.Thread.sleep;

public class ValidateContactUs extends Base {
	
	public WebDriver driver;
	public Actions actions;
	
	private Logger log = LogManager.getLogger(ValidateContactUs.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized.");
		actions = new Actions(driver);
		actions.navigateTo(prop.getProperty("url"));
	}
	
	@Test
	public void checkTendableHome() throws IOException, InterruptedException {

		HomePage hp = new HomePage(driver);
		ContactUsPage cp = new ContactUsPage(driver);
		hp.getContactUs().click();
		cp.getContactbutton().click();
		Thread.sleep(2000);
		cp.getFullname().sendKeys(prop.getProperty("full_name"));
		cp.getOrgName().sendKeys(prop.getProperty("organisation_name"));
		cp.getPhone().sendKeys(prop.getProperty("phone"));
		cp.getEmail().sendKeys(prop.getProperty("email"));
		cp.getAgree().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		int y=driver.findElement(By.id("form-input-consentAgreed-0")).getLocation().getY();
		js.executeScript("window.scrollTo(0,"+y+")");
		Thread.sleep(2000);
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", cp.getSubmit());
		Thread.sleep(2000);
		Assert.assertTrue(cp.geterrormsg().isDisplayed());
		log.info("Error Message is Displayed");
		String expected=cp.geterrormsg().getText();
		String actual="Sorry, there was an error submitting the form. Please try again.";
		Assert.assertEquals(expected,actual);
		log.info("Expected Error message Matches to Actual ");


	}




	
	@AfterTest
	public void teardown() {
		driver.close();
		log.info("Driver is closed");
	}
}
