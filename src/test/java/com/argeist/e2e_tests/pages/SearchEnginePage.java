package com.argeist.e2e_tests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class SearchEnginePage extends PageObject {

    @FindBy(xpath = "//div[@id='table-production-orders']")
    private WebElementFacade tableProductionOrder;

    @FindBy(xpath = "//input[@id='search']")
    private WebElementFacade inputSearch;

    @FindBy(xpath = "//button[@id='production-orders-advanced-filter-button']")
    private WebElementFacade buttonFilter;

    @FindBy(xpath = "//button[@id='production-orders-presets-button']")
    private WebElementFacade buttonPresets;

    public Boolean verify() {
        return tableProductionOrder.waitUntilVisible().isDisplayed()
        && inputSearch.isDisplayed() && buttonFilter.isDisplayed() && buttonPresets.isDisplayed();
    }

}
