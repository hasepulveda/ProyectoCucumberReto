package com.demoguru99.automation.steps;

import com.demoguru99.automation.pageobjects.HomePage;
import net.thucydides.core.annotations.Step;

public class HomeStep {
    HomePage homePage = new HomePage();

    @Step
    public void openBrowaer(){
        homePage.open();
    }

    @Step
    public void enterRegisterOption(){
        homePage.clickRegisterOption();
    }
}
