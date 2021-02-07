package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

    // define username, password, and login WebElements using @FindBy
    @FindBy(how = How.ID, using = "username")
    private WebElement username;

    @FindBy(how = How.ID, using = "password")
    private WebElement password;

    @FindBy(how = How.CLASS_NAME, using = "radius")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage setUsername(String text) {
        // set username
        username.sendKeys(text);
        return this;
    }

    public LoginPage setPassword(String text) {
        // set password
        password.sendKeys(text);
        return this;
    }

    public MainPage clickLogin() {
        // click Login and return instance of Main Page
        this.loginButton.click();
        return new MainPage(driver);
    }
}
