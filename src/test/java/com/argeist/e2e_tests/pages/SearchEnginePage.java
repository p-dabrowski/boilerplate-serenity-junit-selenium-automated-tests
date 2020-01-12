package com.argeist.e2e_tests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class SearchEnginePage extends PageObject {

    @FindBy(xpath = "//main")
    private WebElementFacade checkElement;

    public Boolean verify() {
        return checkElement.waitUntilVisible().isDisplayed();
    }

}