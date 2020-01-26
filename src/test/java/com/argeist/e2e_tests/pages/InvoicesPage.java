package com.argeist.e2e_tests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class InvoicesPage extends PageObject {

    @FindBy(xpath = "//div[@id='table-invoices']")
    private WebElementFacade tableInvoices;

    @FindBy(xpath = "//input[@id='invoices-search-input']")
    private WebElementFacade inputSearch;

    @FindBy(xpath = "//input[@id='TODO']")
    private WebElementFacade buttonFilter;

    public Boolean verify() {
        return tableInvoices.waitUntilVisible().isDisplayed() &&
                inputSearch.isDisplayed();
    }

}
