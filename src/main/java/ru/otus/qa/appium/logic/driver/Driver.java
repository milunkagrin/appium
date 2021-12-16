package ru.otus.qa.appium.logic.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import static ru.otus.qa.appium.logic.driver.Capabilities.InitCapabilities;
import static ru.otus.qa.appium.logic.utils.GetURL.getUrl;

public class Driver {
    public static AppiumDriver initDriver(){
        AppiumDriver driver = new AppiumDriver(getUrl(), InitCapabilities());
        // Some setup driver
        return driver;
    }
}