package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhyTendalblePage {
    public WebDriver driver;

    public WhyTendalblePage(WebDriver driver) {
        this.driver = driver;
    }

    // All objects should be defined here
    private By why = By.xpath("//h2");


    // All methods should be defined here
    public WebElement getWhy() {
        return driver.findElement(why);
    }
}
