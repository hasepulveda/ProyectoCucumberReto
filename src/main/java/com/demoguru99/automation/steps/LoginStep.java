package com.demoguru99.automation.steps;

import com.demoguru99.automation.models.Data;
import com.demoguru99.automation.pageobjects.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginStep {

    LoginPage loginPage = new LoginPage();
    @Step
    public void shouldMessageLogin(Data data){
        loginPage.waitForCondition().until(ExpectedConditions.visibilityOfElementLocated(loginPage.visibleImage));
        Assertions.assertEquals("Note: Your user name is "+data.getUserName()+".",loginPage.messageLogin());
    }
}
