package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OurSolutionPage {
    public WebDriver driver;

    public OurSolutionPage(WebDriver driver) {
        this.driver = driver;
    }

    // All objects should be defined here
    private By oursolution = By.xpath("//h1[text()='Quality inputs deliver']");


    // All methods should be defined here
    public WebElement getOursolution() {
        return driver.findElement(oursolution);
    }
}
