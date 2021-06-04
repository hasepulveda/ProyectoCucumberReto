package com.demoguru99.automation.pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("http://demo.guru99.com/test/newtours/index.php")
public class HomePage extends PageObject {

    By registerOption = By.xpath("//a[text()= \"REGISTER\"]");

    public void clickRegisterOption(){
        getDriver().findElement(registerOption).click();
    }

}
