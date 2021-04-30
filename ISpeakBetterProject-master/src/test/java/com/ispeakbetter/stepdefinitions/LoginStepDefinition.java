package com.ispeakbetter.stepdefinitions;

import com.ispeakbetter.base.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.ispeakbetter.pages.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinition {

    @Given("user will be on login page")
    public void userWillBeOnLoginPage() {
     String expectedTitle="Learn English with Online Teachers - Get your Free Live English Class Now.";
       // Assert.assertEquals(expectedTitle,LoginPage.verifyTitle());
        System.out.println(LoginPage.verifyTitle());

    }

    @When("user click login button")
    public void userClickLoginButton() {
        LoginPage.clickLoginBtn();
    }

    @When("user enter correct email")
    public void userEnterCorrectEmail() {
LoginPage.enterEmail("tester@siliconelabs.com");
    }
    @And("user enter correct password")
    public void userEnterCorrectPassword() {
        LoginPage.enterPassword("tester");

    }
    @And("user click sig in button")
    public void userClickSigInButton() {
        LoginPage.clickSignIn();
    }

    @Then("User verify login page")
    public void userVerifyLoginPage() {
String expectedUrl="https://onlinestudent.ispeakbetter.com/onlinestudent.php";
//Assert.assertEquals(expectedUrl,LoginPage.VerifyUrl());
        System.out.println(LoginPage.VerifyUrl());

    }


    @Given("user will be on online Student page")
    public void userWillBeOnOnlineStudentPage() {
        System.out.println(LoginPage.verifyTitle());
    }

    @When("user click dictionary button")
    public void userClickDictionaryButton() {
        LoginPage.clickDictionaryBtn();
    }

    @When("user select language")
    public void userSelectLanguage() {
        LoginPage.selectedDropdown();
    }

    @And("user enter word")
    public void userEnterWord() {
LoginPage.enterWord("Hello");
    }

    @And("user click search")
    public void userClickSearch() {
        LoginPage.clickSearchBtn();
    }

    @Then("user verify search page")
    public void userVerifySearchPage() {
        System.out.println(LoginPage.VerifyUrl());
    }

    @When("user click messages button")
    public void userClickMessagesButton() {
        LoginPage.clickMessagesBTN();
    }

    @And("user click compose  button")
    public void userClickComposeButton() {
        LoginPage.clickComposeBTN();
    }

    @When("user chooses whom to message")
    public void userChoosesWhomToMessage() {

        LoginPage.setSelectAdmin();
    }

    @And("user enter title")
    public void userEnterTitle() {
        LoginPage.setEnterTitle("TEST-Title");
    }
    @And("user enter message")
    public void userEnterMessage() {
     LoginPage.enterMessegeText("Testing Message Send");

    }

    @And("user click Send button")
    public void userClickSendButton() {
        LoginPage.clickSendBTN();
    }


    @Then("user see The message has been sent successfuly   message")
    public void userSeeTheMessageHasBeenSentSuccessfulyMessage() {
       System.out.println(LoginPage.getText());
    }

    @When("user click Show Vocabulary Basket button")
    public void userClickShowVocabularyBasketButton() {
        LoginPage.clickShowVocBTN();
    }

    @And("user enter word  in input text")
    public void userEnterWordInInputText() {
        LoginPage.setEnterWord("Hello");
    }

    @And("user click search  button")
    public void userClickSearchButton() {
        LoginPage.clickSearchWordBTN();
    }

    @Then("User sees search results")
    public void userSeesSearchResults() {
       System.out.println(LoginPage.getResults()) ;
    }

    @When("user click redeem demo class button")
    public void userClickRedeemDemoClassButton() {
        LoginPage.clickRedeemClassBTN();
    }

    @And("user select timezone")
    public void userSelectTimezone() {
        LoginPage.selectedTimezone();
    }

    @And("user enter Referral Code")
    public void userEnterReferralCode() {
        LoginPage.enterRefferralCode("12345");
    }

    @And("user click Next button")
    public void userClickNextButton() {
        LoginPage.clickNextBTN();
    }

    @Then("User click close Button")
    public void userClickCloseButton() {
        LoginPage.clickCloseTN();
    }
}
