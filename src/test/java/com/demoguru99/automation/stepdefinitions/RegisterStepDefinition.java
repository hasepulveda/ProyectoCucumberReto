package com.demoguru99.automation.stepdefinitions;

import com.demoguru99.automation.models.Data;
import com.demoguru99.automation.steps.HomeStep;
import com.demoguru99.automation.steps.LoginStep;
import com.demoguru99.automation.steps.RegisterStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class RegisterStepDefinition {
    @Steps
    HomeStep homeStep;
    @Steps
    RegisterStep registerStep;
    @Steps
    LoginStep loginStep;

    @Given("^On the main page enter the registration option$")
    public void onTheMainPageEnterTheRegistrationOption() throws InterruptedException {
        homeStep.openBrowaer();
        Thread.sleep(3000);
        homeStep.enterRegisterOption();
    }

    @When("^he mandatory registration data is entered$")
    public void heMandatoryRegistrationDataIsEntered(List<Data> dataList) {
        registerStep.createUserRegister(dataList.get(0));
    }

    @Then("^should see a message with your name$")
    public void shouldSeeAMessageWithYourName(List<Data> dataList) {
        loginStep.shouldMessageLogin(dataList.get(0));
    }
}
