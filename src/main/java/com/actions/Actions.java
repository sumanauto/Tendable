package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Actions {
	
	WebDriver driver;
	
	public Actions(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateTo(String url) {
		driver.get(url);
		
	}

}
