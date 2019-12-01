package com.argeist.e2e_tests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;


public class MyAccountPage extends PageObject {

    @FindBy(id = "reg_email")
    private WebElementFacade regEmailInput;

    @FindBy(id = "reg_password")
    private WebElementFacade regPasswordInput;

    @FindBy(name = "register")
    private WebElementFacade registerButton;

    @FindBy(xpath = "//ul[@class='woocommerce-error']//li")
    private WebElementFacade errorMessage;

    public void registerUser(String email, String password) {
        regEmailInput.type(email);
        regPasswordInput.type(password);

        registerButton.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

}
