package com.argeist.e2e_tests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class ShipmentsProgressPage extends PageObject {

    @FindBy(xpath = "//div[@id='table-shipments']")
    private WebElementFacade tableShipments;

    @FindBy(xpath = "//input[@id='shipments-search-input']")
    private WebElementFacade inputSearch;

    @FindBy(xpath = "//input[@id='TODO']")
    private WebElementFacade buttonFilter;



    public Boolean verify() {
        return tableShipments.waitUntilVisible().isDisplayed() &&
                inputSearch.isDisplayed();
    }

}
