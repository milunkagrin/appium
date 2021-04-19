package ru.otus.qa.appium.test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static ru.otus.qa.appium.logic.driver.Driver.initDriver;

public class test001 {
    AppiumDriver driver;

    @BeforeMethod
    void setUp() {
        driver = initDriver();
    }

    @Test
    void test() {
        driver.findElement(By.id("id"));
    }

    @AfterMethod
    void tearDown() {
        driver.quit();
    }
}
