package com.organization.e2e_tests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class ProductsCatalogsPage extends PageObject {

    @FindBy(xpath = "//TODO")
    private WebElementFacade productsCatalogsPageElement;

    public Boolean verify() {
        return productsCatalogsPageElement.waitUntilVisible().isDisplayed();
    }

}
