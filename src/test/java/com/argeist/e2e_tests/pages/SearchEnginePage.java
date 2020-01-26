package com.argeist.e2e_tests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class SearchEnginePage extends PageObject {

    @FindBy(xpath = "//div[@id='table-production-orders']")
    private WebElementFacade tableProductionOrder;

    @FindBy(xpath = "//input[@id='search']")
    private WebElementFacade inputSearch;

    public Boolean verify() {
        return tableProductionOrder.waitUntilVisible().isDisplayed()
        && inputSearch.isDisplayed();
    }

}
