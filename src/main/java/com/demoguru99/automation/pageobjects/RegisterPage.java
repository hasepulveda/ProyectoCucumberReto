package com.demoguru99.automation.pageobjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {
    By firstName = By.name("firstName");
    By lastName = By.name("lastName");
    By phone = By.name("phone");
    By email = By.name("userName");
    By address = By.name("userName");
    By city = By.name("city");
    By state = By.name("state");
    By postalCode = By.name("postalCode");
    By country;
    By user = By.id("email");
    By Password  = By.name("password");
    By confirmPassword = By.name("confirmPassword");
    By submitButton = By.name("submit");
    public By visibleImage = By.xpath("//img[@src=\"images/mast_register.gif\"]");

    public void setFirstName(String userFirstName){
        getDriver().findElement(firstName).sendKeys(userFirstName);
    }

    public void setLastName(String userLastName){
        getDriver().findElement(lastName).sendKeys(userLastName);
    }

    public void setPhone(String userPhone){
        getDriver().findElement(phone).sendKeys(userPhone);
    }

    public void setEmail(String userEmail){
        getDriver().findElement(email).sendKeys(userEmail);
    }

    public void setAddress(String userAddress){
        getDriver().findElement(address).sendKeys(userAddress);
    }

    public void setCity(String userCity){
        getDriver().findElement(city).sendKeys(userCity);
    }

    public void setState(String userState){
        getDriver().findElement(state).sendKeys(userState);
    }

    public void setPostalCode(String userPostalCode){
        getDriver().findElement(postalCode).sendKeys(userPostalCode);
    }

    public void setCountry(String userCountry){
        String rutaCountry = "//option[ text() =\""+userCountry+"\"]";
        country = By.xpath(rutaCountry);
        getDriver().findElement(country).click();
    }

    public void setName(String userName){
        getDriver().findElement(user).sendKeys(userName);
    }

    public void setPassword (String userPassword){
        getDriver().findElement(Password).sendKeys(userPassword);
    }

    public void setConfirmPassword(String userConfirmPassword){
        getDriver().findElement(confirmPassword).sendKeys(userConfirmPassword);
    }

    public void clickSubmitButton(){
        getDriver().findElement(submitButton).click();
    }


}
