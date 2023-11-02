package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	// All objects should be defined here
	private By tendableHome = By.xpath("//a[@class='logo']/img");
	private By ourstory = By.xpath("//a[text()='Our Story']");
	private By oursolution = By.xpath("//a[text()='Our Solution']");
	private By whytendable = By.xpath("//a[text()='Why Tendable?']");

	private By requestDemoButton = By.xpath("(//a[text()='Request a Demo'])[2]");
	private By contactUsButton = By.xpath("//a[text()='Contact Us']");
	
	
	// All methods should be defined here
	public  WebElement getTendableHome() {
		return driver.findElement(tendableHome);
	}
	
	public WebElement getOurstory() {
		return driver.findElement(ourstory);
	}
	
	public WebElement getOursolution() {
		return driver.findElement(oursolution);
	}
	
	public WebElement getWhytendable() {
		return driver.findElement(whytendable);
	}
	public WebElement getRequestButton() {
		return driver.findElement(requestDemoButton);
	}
	public WebElement getContactUs() {
		return driver.findElement(contactUsButton);
	}

}
