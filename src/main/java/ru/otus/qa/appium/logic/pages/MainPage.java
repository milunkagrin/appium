package ru.otus.qa.appium.logic.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage{

    private AppiumDriver driver;

    public MainPage(AppiumDriver driver) {
        super(driver);

    }



    @AndroidFindBy(xpath= "(//android.widget.CheckBox[@content-desc=\"users\"])[1]")
    private AndroidElement user1;
    @AndroidFindBy(xpath= "(//android.widget.CheckBox[@content-desc=\"users\"])[2]")
    private AndroidElement user2;
    @AndroidFindBy(xpath= "(//android.widget.CheckBox[@content-desc=\"users\"])[3]")
    private AndroidElement user3;

    @AndroidFindBy(xpath= "(//android.view.View[@content-desc=\"user-id\"])[1]")
    private AndroidElement userID1;
    @AndroidFindBy(xpath= "(//android.view.View[@content-desc=\"user-id\"])[2]")
    private AndroidElement userID2;
    @AndroidFindBy(xpath= "(//android.view.View[@content-desc=\"user-id\"])[3]")
    private AndroidElement userID3;

    @AndroidFindBy(xpath= "(//android.view.View[@content-desc=\"user-grade\"])[1]")
    private AndroidElement userGrade1;
    @AndroidFindBy(xpath= "(//android.view.View[@content-desc=\"user-grade\"])[2]")
    private AndroidElement userGrade2;
    @AndroidFindBy(xpath= "(//android.view.View[@content-desc=\"user-grade\"])[3]")
    private AndroidElement userGrade3;

    public void clickUser1(){
        user1.click();
    }
    public boolean isDisplayed() {
        return user1.isDisplayed();
    }

}
