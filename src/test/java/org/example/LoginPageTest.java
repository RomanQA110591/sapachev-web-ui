package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.example.common.Configuration.STUDENT_LOGIN;
import static org.example.common.Configuration.STUDENT_PASSWORD;


public class LoginPageTest extends BaseTest {

    @Test
    public void LoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(STUDENT_LOGIN, STUDENT_PASSWORD);

    }

}

