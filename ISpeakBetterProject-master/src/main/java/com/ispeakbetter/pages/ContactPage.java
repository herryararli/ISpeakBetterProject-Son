package com.ispeakbetter.pages;

import com.ispeakbetter.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.ispeakbetter.base.BasePage.driver;


public class ContactPage {
    @FindBy(xpath = "//span[@data-hover='Contact']")
    public static WebElement contactLink;
    @FindBy(xpath = "//input[@placeholder='Your Name']")
    public static WebElement inputname;
    @FindBy(xpath = "//input[@placeholder='Your Email Address']")
    public static WebElement inputemailAddress;
    @FindBy(xpath = "//textarea[@placeholder='Your Message']")
    public static WebElement inputmessage;
    @FindBy(xpath = "//select[@name='subject']")
    public static WebElement selectsubject;
    @FindBy(xpath = "//input[@value='Contact us']")
    public static WebElement contactusLink;
    @FindBy(xpath = "//div[@class='alert alert-info']")
    public static WebElement warningMessage;

    public ContactPage(){
        PageFactory.initElements(driver, this);
    }

    public static void goContactPage() {
        HelperMethods.doClick(contactLink);
    }
    public static void sendName(String username){
        HelperMethods.sendText(inputname,username);
    }
    public static void sendEmail(String emailAddress){
        HelperMethods.sendText(inputemailAddress,emailAddress);
    }
    public static void sendMessage(String message){
        HelperMethods.sendText(inputmessage,message);
    }
    public static void selectRequest(){
        HelperMethods.dropDownMenu(selectsubject);
    }
    public static void userClicksContactButton(){
        HelperMethods.doClick(contactusLink);
    }
    public static boolean getVerifyText(){
        HelperMethods.doGetText(warningMessage);
        return true;
    }
}
