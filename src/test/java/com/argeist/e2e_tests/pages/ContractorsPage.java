package com.argeist.e2e_tests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class ContractorsPage extends PageObject {

    @FindBy(xpath = "//a[contains(@href,'/dropshipping/contractors/create')]")
    private WebElementFacade addContractorButton;

    public Boolean verify() {
        return addContractorButton.waitUntilVisible().isDisplayed();
    }

}
