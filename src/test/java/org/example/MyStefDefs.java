package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MyStefDefs {

    HomePage homePage= new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();

    @Given("The user is on registration page")
    public void the_user_is_on_registration_page() {
        // Write code here that turns the phrase above into concrete actions
        homePage.verificationUserIsOnHomepage();
        homePage.clickOnRegisterLink();

    }

    @When("The user enters all the fields or details")
    public void the_user_enters_all_the_fields_or_details() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.firstName();
        registerPage.lastName();
        registerPage.emailAddress();
        registerPage.password();
        registerPage.confirmPassword();
    }

    @When("Click on register submit button")
    public void click_on_register_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.registerButton();
    }

    @Then("The user should be able to register successfully")
    public void the_user_should_be_able_to_register_successfully() {
        // Write code here that turns the phrase above into concrete actions
        registerResultPage.verificationOfRegistrationCompleted();
        registerResultPage.continueButton();
    }




}
