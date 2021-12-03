package com.organization.e2e_tests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;

@DefaultUrl("http://www.artgeist.com/")
public class LoginPage extends PageObject {

    @FindBy(id = "username-input")
    private WebElementFacade inputLogin;

    @FindBy(id = "password-input")
    private WebElementFacade inputPassword;

    @FindBy(xpath = "//button")
    private WebElementFacade buttonSubmit;

    @FindBy(xpath = "//div")
    private WebElementFacade errorMessage;


    public void openLoginPage() {
        this.open();
    }

    public void login(String username, String password) {
        inputLogin.type(username);
        inputPassword.type(password + Keys.ENTER);
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public Boolean verify() {
        return inputLogin.isDisplayed() && inputPassword.isDisplayed() && buttonSubmit.isDisplayed();
    }
}
