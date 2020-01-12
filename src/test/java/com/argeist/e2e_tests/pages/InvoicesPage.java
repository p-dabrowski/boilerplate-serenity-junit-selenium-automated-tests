package com.argeist.e2e_tests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class InvoicesPage extends PageObject {

    @FindBy(xpath = "//main/div/div")
    private WebElementFacade invoicesElement;

    public Boolean verify() {
        return invoicesElement.waitUntilVisible().isDisplayed();
    }

}
