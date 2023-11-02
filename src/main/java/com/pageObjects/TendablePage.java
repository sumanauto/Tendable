package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TendablePage {

	public WebDriver driver;

	public TendablePage(WebDriver driver) {
		this.driver = driver;
	}
	
	// All objects should be defined here
	private By tendable = By.xpath("//h1[text()='Move beyond simple compliance']");

	
	// All methods should be defined here
	public WebElement getTendable() {
		return driver.findElement(tendable);
	}

}
