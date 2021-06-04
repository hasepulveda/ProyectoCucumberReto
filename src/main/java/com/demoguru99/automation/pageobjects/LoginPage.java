package com.demoguru99.automation.pageobjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    public By visibleImage = By.xpath("//img[@src=\"images/mast_register.gif\"]");
    By messageLoginPage = By.xpath("(//b)[4]");

    public String messageLogin(){
        return getDriver().findElement(messageLoginPage).getText();
    }
}
