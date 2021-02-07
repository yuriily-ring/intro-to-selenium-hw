package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage extends com.example.selenium.pages.BasePage {

    // define title and logout WebElements using @FindBy
    @FindBy (how = How.CLASS_NAME, using = "example")
    WebElement title;

    @FindBy (how = How.CLASS_NAME, using = "radius")
    WebElement logout;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        // return title text
        return title.getText();
    }

    public MainPage clickLogout() {
        // click logout and return MainPage
        logout.click();
        return this;
    }
}
