package com.ispeakbetter.pages;

import com.ispeakbetter.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Set;

import static com.ispeakbetter.base.BasePage.driver;

public class HomePage {

    @FindBy(xpath ="/html/body/div[1]/div[2]/div/nav/div/div[2]/ul/li[5]/a/span")
    public static WebElement contactBtn;

    @FindBy(xpath= "//*[@id=\"cmdSiginLink\"]")
    public static WebElement loginBtn;

    @FindBy(xpath="/html/body/div[2]/div/div/header/a[1]")
    public static WebElement logintext;

    @FindBy(xpath = "/html/body/div[1]/section[1]/div/div/div/div[2]/div[2]/div/div[2]/div/div/a[2]/img")
    public static WebElement AppstoreBtn;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div/form/div[2]/div[2]/span[1]/span[1]/span/span[1]")
    public static WebElement ddElement;

    public HomePage()
    {
        PageFactory.initElements(driver, this);//this=SignUpPage.class
    }

    public static String getHomepageTitle() {
        return HelperMethods.doGetPageTitle();
    }

    public static String getHomepageURL() {
        return HelperMethods.getCurrentURL();
    }

    public static String verifyURL() {
        return HelperMethods.getCurrentURL();
    }

    public static void clickContact() throws InterruptedException {
        // Thread.sleep(2000);
        System.out.println(contactBtn.getText());
        HelperMethods.doClick(contactBtn);
    }

    public static void clickLogin() throws InterruptedException {
        //Thread.sleep(2000);
        System.out.println(loginBtn.getText());
        HelperMethods.doClick(loginBtn);
    }

    public static String getlogintext() throws InterruptedException {
        // Thread.sleep(2000);
        System.out.println(logintext.getText());
        return logintext.getText();
    }

    public static void clickAppStoreBtn() throws InterruptedException {
        //  Thread.sleep(2000);
        System.out.println(AppstoreBtn.getText());
        HelperMethods.doClick(AppstoreBtn);
    }

    public static String getAppstoreURL() throws InterruptedException {
        //  Thread.sleep(2000)
        Set<String> windowsHandles = driver.getWindowHandles();
        ArrayList<String> windowsHandleList = new ArrayList<String>(windowsHandles);
        System.out.println(windowsHandleList);
        driver.switchTo().window(windowsHandleList.get(1));
        return driver.getCurrentUrl();
    }
}