package com.argeist.e2e_tests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class UsersPage extends PageObject {

    @FindBy(xpath = "//main/div/div/div")
    private WebElementFacade usersPageElement;

    public Boolean verify() {
        return usersPageElement.waitUntilVisible().isDisplayed();
    }

}
