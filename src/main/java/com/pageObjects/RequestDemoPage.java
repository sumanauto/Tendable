package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RequestDemoPage {
    public WebDriver driver;

    public RequestDemoPage(WebDriver driver) {
        this.driver = driver;
    }

    // All objects should be defined here
    private By requestTitle = By.xpath("(//h1[text()='Request a Demo'])");


    // All methods should be defined here
    public WebElement getRequestTitle() {
        return driver.findElement(requestTitle);
    }
}
