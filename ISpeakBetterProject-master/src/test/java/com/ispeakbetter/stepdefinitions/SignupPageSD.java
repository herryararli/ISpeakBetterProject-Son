package com.ispeakbetter.stepdefinitions;

import com.ispeakbetter.base.BasePage;
import com.ispeakbetter.pages.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SignupPageSD {

@Given("user is on  HomePage")
    public void userIsOnTheHomePage(){
    BasePage.initializeDriver();
}

    @When("user clicks sign up")
    public void userClicksSignUp() {
        SignUpPage.goSignupPage();
    }

    @Then("verify if links opens correct page")
    public void verifyIfLinksOpensCorrectPage() {
        Assert.assertTrue(SignUpPage.verifySignUpPage());
    }

    @And("user clicks sign in")
    public void userClicksSignIn() {
    SignUpPage.clickSignin();

    }

    @Then("user sees sign in section")
    public void userSeesSignInSection() {
    Assert.assertTrue(SignUpPage.verifySignInPage());

    }

    @And("user clicks Facebook link")
    public void userClicksFacebookLink() {
        SignUpPage.clickFacebooklink();

    }

    @Then("user is on the Facebook page")
    public void userIsOnTheFacebookPage() {
    String actualTitle=SignUpPage.getFaceTitle();
    Assert.assertEquals("Log into Facebook | Facebook",actualTitle);
    }

    @And("user clicks Google link")
    public void userClicksGoogleLink() {
        SignUpPage.clickGooglelink();
    }

    @Then("user is on the Google+ page")
    public void userIsOnTheGooglePage() {
        String actualText=SignUpPage.getGoogleText();
        Assert.assertEquals("Anmeldung",actualText);
    }

    @Then("user select Terms and Conditions")
    public void userSelectTermsAndConditions() {
    Assert.assertTrue(SignUpPage.clickTerms());
    }

    @And("user clicks Sign up link")
    public void userClicksSignUpLink() {
    SignUpPage.clickSignUpButton();
    }

    @Then("user see the warning message")
    public void userSeeTheWarningMessage() {
    String actualText=SignUpPage.getWarningMessage();
    Assert.assertEquals("Please complete all required fields.",actualText);
    }
}
