package ru.otus.qa.appium.logic.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class UserScreenPage extends BasePage{
    public UserScreenPage(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath= "//android.view.View[@content-desc=\"User screen\"]")
    private AndroidElement pageTitle;

    @AndroidFindBy(xpath= "//android.widget.Button[@content-desc=\"Back\"]")
    private AndroidElement backButton;


    public boolean isDisplayed() {
        return pageTitle.isDisplayed();

    }

    public void clickBack(){
        backButton.click();
    }
}
