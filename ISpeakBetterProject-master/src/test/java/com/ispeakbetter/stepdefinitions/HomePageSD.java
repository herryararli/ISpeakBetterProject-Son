package com.ispeakbetter.stepdefinitions;

import com.ispeakbetter.base.BasePage;
import com.ispeakbetter.base.ConfigReader;
import com.ispeakbetter.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageSD extends BasePage{

    @Given("user is on the HomePage")
    public void userIsOnTheHomePage(){
        BasePage.initializeDriver();
    }

    @When("get homepage url")
    public void getHomepageUrl() {
        System.out.println( HomePage.getHomepageURL());
    }

    @Then("verify if url is expected")
    public void verifyIfUrlIsExpected() {
        String expectedURL = ConfigReader.getProperty("url");
        Assert.assertEquals(expectedURL, HomePage.verifyURL());
    }

    @When("get homepage title")
    public void getHomepageTitle() {
        System.out.println(HomePage.getHomepageTitle());
    }

    @Then("verify if title is expected")
    public void verifyIfTitleIsExpected() {
        String expectedTitle = "Learn English with Online Teachers - Get your Free Live English Class Now.";
        Assert.assertEquals(expectedTitle, HomePage.getHomepageTitle());
    }

    @When("Test Contact button")
    public void testContactButton() throws InterruptedException {
        HomePage.clickContact();
    }

    @Then("See Contact page")
    public void seeContactPage() {
        String expectedURL = "https://ispeakbetter.com/contact";
        Assert.assertEquals(expectedURL, HomePage.verifyURL());
        System.out.println(HomePage.verifyURL());
    }

    @When("Test login button")
    public void testLoginButton() throws InterruptedException {
        HomePage.clickLogin();
    }

    @Then("See login page")
    public void seeLoginPage() throws InterruptedException {
        String expectedText = "Sign in";
        Assert.assertEquals(expectedText, HomePage.getlogintext());
    }

    @When("Test AppStore button")
    public void testAppStoreButton() throws InterruptedException {
        HomePage.clickAppStoreBtn();
    }

    @Then("See AppStore page")
    public void seeAppStorePage() throws InterruptedException {
        String actualStoreURL="https://apps.apple.com/ph/app/i-speak-better-live-english/id1265755865";
        Assert.assertEquals(actualStoreURL, HomePage.getAppstoreURL());
    }
}
