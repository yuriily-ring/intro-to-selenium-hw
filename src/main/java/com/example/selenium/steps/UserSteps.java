package com.example.selenium.steps;

import com.example.selenium.pages.LoginPage;
import com.example.selenium.pages.MainPage;
import org.openqa.selenium.WebDriver;
import sun.rmi.runtime.Log;

import static org.testng.Assert.assertTrue;

public class UserSteps {
    private WebDriver driver;
    private LoginPage loginPage;
    private MainPage mainPage;

    public UserSteps(WebDriver driver) {
        this.driver = driver;
    }

    public com.example.selenium.steps.UserSteps login(String username, String password) {
        // initialize LoginPage, call setUsername, setPassword, and click login methods
        loginPage = new LoginPage(driver);
        mainPage = loginPage.setUsername(username).setPassword(password).clickLogin();

        //  assert title
        assertTrue(mainPage.getTitle().contains("Secure Area"), "Login failed");
        return this;
    }

    public UserSteps logout() {
        // call logout method
        mainPage.clickLogout();
        return this;
    }
}
