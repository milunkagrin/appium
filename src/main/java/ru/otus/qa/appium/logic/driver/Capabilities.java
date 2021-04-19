package ru.otus.qa.appium.logic.driver;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Capabilities {

    public static DesiredCapabilities InitCapabilities() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setPlatform(Platform.ANDROID);
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("automationName", "Appium");
        desiredCapabilities.setCapability("app", Capabilities.class.getClassLoader().getResource("skoda.apk").getPath());
        return desiredCapabilities;
    }
}
