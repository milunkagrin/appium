package ru.otus.qa.appium.test;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.otus.qa.appium.logic.pages.MainPage;
import ru.otus.qa.appium.logic.pages.UserScreenPage;

import static ru.otus.qa.appium.logic.driver.Driver.initDriver;

public class BaseTest {
    AppiumDriver driver;
    MainPage mainPage;
    UserScreenPage userScreenPage;

    @BeforeMethod
    void setUp() {
        driver = initDriver();
    }

    @AfterMethod
    void tearDown() {
        driver.quit();
    }
}
