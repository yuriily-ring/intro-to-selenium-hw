package com.example.selenium;

import com.example.selenium.pages.LoginPage;
import com.example.selenium.steps.UserSteps;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        // use steps for the login and logout
        userSteps.login("tomsmith", "SuperSecretPassword!");
        userSteps.logout();
    }
}
