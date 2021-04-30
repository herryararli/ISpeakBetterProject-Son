package com.ispeakbetter.pages;
import static com.ispeakbetter.base.BasePage.driver;

import com.ispeakbetter.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SignUpPage {
    //cmdSignupLink
    @FindBy(id = "cmdSignupLink")
    public static WebElement signupLink;
    @FindBy(linkText = "Facebook")
    public static WebElement FaceLinkText;
    @FindBy(id = "signin")
    public static WebElement signinLink;
    @FindBy(id = "lnkFogotPassword")
    public static WebElement ForgetPassword;
    @FindBy(linkText = "Google+")
    public static WebElement GoogleLinkText;
    @FindBy(xpath = "//span[normalize-space()='Anmeldung']")
    public static WebElement GoogleGetText;
    @FindBy(id = "check_term")
    public static WebElement term;
    @FindBy(id="cmdSignup")
    public static WebElement SignUpButton;
    @FindBy(id="alertmsg")
    public static WebElement warningMessage;

    public SignUpPage() {
        PageFactory.initElements(driver, this);//this=SignUpPage.class
    }

    public static void goSignupPage() {
        HelperMethods.doClick(signupLink);
    }

    public static boolean verifySignUpPage() {
        return HelperMethods.doIsDisplayed(FaceLinkText);
    }

    public static void clickSignin() {
        HelperMethods.doClick(signinLink);
    }

    public static boolean verifySignInPage() {
        return HelperMethods.doIsDisplayed(ForgetPassword);
    }

    public static void clickFacebooklink() {
        HelperMethods.doClick(FaceLinkText);
    }

    public static String getFaceTitle() {
        return HelperMethods.doGetPageTitle();
    }

    public static void clickGooglelink() {
        HelperMethods.doClick(GoogleLinkText);
    }

    public static String getGoogleText() {
        return HelperMethods.doGetText(GoogleGetText);
    }

    public static boolean clickTerms() {
        HelperMethods.doClick(term);
        return term.isSelected();
    }
    public static void clickSignUpButton() {
        HelperMethods.doClick(SignUpButton);
    }
    public static String getWarningMessage(){
        return HelperMethods.doGetText(warningMessage);
    }
}