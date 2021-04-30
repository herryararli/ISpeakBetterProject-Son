package com.ispeakbetter.stepdefinitions;

import com.ispeakbetter.base.BasePage;
import com.ispeakbetter.base.ConfigReader;
import com.ispeakbetter.pages.ContactPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ContactPageSD {
    @Given("user is on the ContactPage")
    public void userIsOnTheContactPage() {
        BasePage.initializeDriver();
    }

    @When("user clicks contact")
    public void userClicksContact() {
        ContactPage.goContactPage();
    }

    @And("user send a name")
    public void userSendAName() {
        ContactPage.sendName(ConfigReader.getProperty("username"));
    }

    @And("user send an Email")
    public void userSendAnEmail() {
        ContactPage.sendEmail(ConfigReader.getProperty("emailAddress"));
    }

    @And("user select refund")
    public void userSelectRefund() {
        ContactPage.selectRequest();
    }

    @And("user send a message")
    public void userSendAMessage() {
        ContactPage.sendMessage(ConfigReader.getProperty("message"));
    }
    @And("user click contact button")
    public void userClickContactButton() {
        ContactPage.userClicksContactButton();
    }

    @Then("user get warning message")
    public void userGetWarningMessage() {
        //Assert.assertEquals(ContactPage.getVerifyText(), "Thanks for contacting us!");
    }


}
