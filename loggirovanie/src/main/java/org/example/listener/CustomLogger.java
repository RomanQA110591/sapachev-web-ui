package org.example.listener;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.example.helpers.ScreenshotMaker;

import java.util.List;

public class CustomLogger implements WebDriverEventListener {

    private static Logger logger = LoggerFactory.getLogger(WebDriver.class);


    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        String log = String.format("Before click on element with tagname = %s, enabled = %s, is_displayed = %s ",
                element.getTagName(), element.isEnabled(), element.isDisplayed());
        logger.info(log);
    }

    @Override
    public void onException(Throwable throwable, WebDriver driver) {
        String fileName = "failure-screenshot-" + System.currentTimeMillis() + ".png";
        ScreenshotMaker.makeScreenshot(driver, fileName);
        LogEntries browserLogs = driver.manage().logs().get(LogType.BROWSER);
        List<LogEntry> allLogRows = browserLogs.getAll();
        allLogRows.stream()
                .map(LogEntry::toString)
                .forEach(System.out::println);
        logger.error("onException: Screenshot saved in target/" + fileName);
    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {

    }

    @Override
    public void beforeAlertAccept(WebDriver driver) {
    }

    @Override
    public void afterAlertAccept(WebDriver driver) {

    }

    @Override
    public void afterAlertDismiss(WebDriver driver) {

    }

    @Override
    public void beforeAlertDismiss(WebDriver driver) {

    }

    @Override
    public void beforeNavigateTo(String url, WebDriver driver) {

    }

    @Override
    public void afterNavigateTo(String url, WebDriver driver) {

    }

    @Override
    public void beforeNavigateBack(WebDriver driver) {

    }

    @Override
    public void afterNavigateBack(WebDriver driver) {

    }

    @Override
    public void beforeNavigateForward(WebDriver driver) {

    }

    @Override
    public void afterNavigateForward(WebDriver driver) {

    }

    @Override
    public void beforeNavigateRefresh(WebDriver driver) {

    }

    @Override
    public void afterNavigateRefresh(WebDriver driver) {

    }

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {

    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {

    }

    @Override
    public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

    }

    @Override
    public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

    }

    @Override
    public void beforeScript(String script, WebDriver driver) {

    }

    @Override
    public void afterScript(String script, WebDriver driver) {

    }

    @Override
    public void beforeSwitchToWindow(String windowName, WebDriver driver) {

    }

    @Override
    public void afterSwitchToWindow(String windowName, WebDriver driver) {

    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> target) {

    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {

    }

    @Override
    public void beforeGetText(WebElement element, WebDriver driver) {

    }

    @Override
    public void afterGetText(WebElement element, WebDriver driver, String text) {

    }
}
