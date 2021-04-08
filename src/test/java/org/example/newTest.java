package org.example;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.runners.model.RunnerBuilder;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(TimingExtension.class)

public class newTest extends BasePage {

    private static final String LOGIN_PAGE_URL = "https://crm.geekbrains.space/user/login";
    private static final String STUDENT_LOGIN = "Applanatest";
    private static final String STUDENT_PASSWORD = "Student2020!";
    private static final WebDriver driver;


    static {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--disable-notifications"});
        options.addArguments(new String[]{"--disable-popup-blocking"});
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
    }


    @Test
    private static void logTest () {
        driver.get("https://crm.geekbrains.space/user/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(STUDENT_LOGIN, STUDENT_PASSWORD);
    }



    @FindBy(xpath = ".//ul[@class='nav nav-multilevel main-menu']/li[@class='dropdown']/a[@class='unclickable']/span[text()='Проекты']")
    private WebElement clickproekt1;

    @FindBy(xpath = ".//span[@class='title' and text()='Мои проекты']")
    private WebElement clickproekt2;

    @FindBy(css = "div[class='pull-left btn-group icons-holder']")
    private WebElement clickproekt3;

    @FindBy(xpath = ".//div/div/div[2]/input")
    private WebElement sendKeysproekt;

    @FindBy(xpath = ".//div[5]/div[2]/div/select")
    private WebElement expenditureDropDown;

    @FindBy(xpath = ".//div[6]/div[2]/div/select")
    private WebElement expenditureDropDown1;

    @FindBy(xpath = ".//div[7]/div[2]/div/select")
    private WebElement expenditureDropDown2;

    @FindBy(xpath = ".//div[9]/div[2]/div/select")
    private WebElement expenditureDropDown3;

    @FindBy(css = "button[class='btn btn-success action-button']")
    private WebElement ButtonClick;

    public newTest(WebDriver driver) {
        super(driver);
    }


    public newTest clickproekt1_1(WebElement clickproekt1) {
        clickproekt1.click();
        return this;
    }


    public newTest clickproekt1_2(WebElement clickproekt2) {
        clickproekt2.click();
        return this;
    }

    public newTest clickproekt1_3(WebElement clickproekt3) {
        clickproekt3.click();
        return this;
    }

    public newTest sendKeysproekt1(WebElement sendKeysproekt) {
        sendKeysproekt.sendKeys("Test Geek 123");
        return this;
    }

    public newTest expenditureDropDown1_1(WebElement expenditureDropDownSelect) {
        Select expenditureDropDown = new Select(expenditureDropDownSelect);
        expenditureDropDown.selectByVisibleText("Research & Development");
        return this;
    }

    public newTest expenditureDropDown2_1(WebElement expenditureDropDownSelect) {
        Select expenditureDropDown1 = new Select(expenditureDropDownSelect);
        expenditureDropDown1.selectByVisibleText("Гикбрейнс Студент");
        return this;
    }

    public newTest expenditureDropDown3_1(WebElement expenditureDropDownSelect) {
        Select expenditureDropDown2 = new Select(expenditureDropDownSelect);
        expenditureDropDown2.selectByVisibleText("Applanatest Applanatest Applanatest");
        return this;
    }

    public newTest expenditureDropDown4_1(WebElement expenditureDropDownSelect) {
        Select expenditureDropDown3 = new Select(expenditureDropDownSelect);
        expenditureDropDown3.selectByVisibleText("Applanatest Applanatest Applanatest");
        return this;
    }

    public newTest  clickSubmit(WebElement ButtonClick) {
        ButtonClick.click();
        return new newTest (driver);
    }



    public void init(final WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
