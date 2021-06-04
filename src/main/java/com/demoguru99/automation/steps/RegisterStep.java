package com.demoguru99.automation.steps;

import com.demoguru99.automation.models.Data;
import com.demoguru99.automation.pageobjects.RegisterPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegisterStep {

    RegisterPage registerPage = new RegisterPage();

    @Step
    public void createUserRegister(Data data){
        registerPage.waitForCondition().until(ExpectedConditions.visibilityOfElementLocated(registerPage.visibleImage));
        registerPage.setFirstName(data.getFirstName());
        registerPage.setLastName(data.getLastName());
        registerPage.setPhone(data.getPhone());
        registerPage.setEmail(data.getEmail());
        registerPage.setAddress(data.getAddress());
        registerPage.setCity(data.getCity());
        registerPage.setState(data.getState());
        registerPage.setPostalCode(data.getPostalCode());
        registerPage.setCountry(data.getCountry());
        registerPage.setName(data.getUserName());
        registerPage.setPassword(data.getPassword());
        registerPage.setConfirmPassword(data.getPassword());
        registerPage.clickSubmitButton();
    }
}
