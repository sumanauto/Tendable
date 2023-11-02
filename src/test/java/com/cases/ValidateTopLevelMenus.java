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


public class ValidateTopLevelMenus extends Base {
	
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
	public void checkTendableHome() throws IOException {

		HomePage hp = new HomePage(driver);
		TendablePage tp = new TendablePage(driver);
		Assert.assertTrue(hp.getTendableHome().isDisplayed());
		log.info("Tendable Home is displayed on top menu bar");
		hp.getTendableHome().click();
		Assert.assertTrue(tp.getTendable().isDisplayed());
		log.info("Tendable Home is Accessible");

	}
	@Test
	public void checkOurStory() throws IOException {

		HomePage hp = new HomePage(driver);
		OurStoryPage sp = new OurStoryPage(driver);
		Assert.assertTrue(hp.getOurstory().isDisplayed());
		log.info("Our Story is displayed on top menu of Home Page");
		hp.getOurstory().click();
		Assert.assertTrue(sp.getourstoryimg().isDisplayed());
		log.info("Our Story Page is Accessible");

	}
	@Test
	public void checkOurSolution() throws IOException {

		HomePage hp = new HomePage(driver);
		OurSolutionPage op = new OurSolutionPage(driver);
		Assert.assertTrue(hp.getOursolution().isDisplayed());
		log.info("Our Solution is displayed on top menu of Home Page");
		hp.getOursolution().click();
		Assert.assertTrue(op.getOursolution().isDisplayed());
		log.info("OurSolution Page is Accessible");

	}

	@Test
	public void checkWhyTendable() throws IOException {

		HomePage hp = new HomePage(driver);
		WhyTendalblePage wt = new WhyTendalblePage(driver);
		Assert.assertTrue(hp.getWhytendable().isDisplayed());
		log.info("Why Tendable is displayed on top menu of Home Page");
		hp.getOursolution().click();
		Assert.assertTrue(wt.getWhy().isDisplayed());
		log.info("Why Tendable Page is Accessible");

	}
	@AfterTest
	public void teardown() {
		driver.close();
		log.info("Driver is closed");
	}
}
