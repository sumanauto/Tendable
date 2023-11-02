package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OurStoryPage {
    public WebDriver driver;

    public OurStoryPage(WebDriver driver) {
        this.driver = driver;
    }

    // All objects should be defined here
    private By ourstoryimg = By.xpath("//img[@alt='Tendable meaning']");


    // All methods should be defined here
    public WebElement getourstoryimg() {
        return driver.findElement(ourstoryimg);
    }
}
