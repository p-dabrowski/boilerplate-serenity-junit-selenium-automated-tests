package com.argeist.e2e_tests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DefaultUrl("http://www.artgeist.com/")
public class ArtePage extends PageObject {

    private Logger logger = LoggerFactory.getLogger(ArtePage.class);

    @FindBy(className = "jss1")
    private WebElementFacade arteCheckElement;

    @FindBy(xpath = "//a[contains(.,'Products Catalogs')]")
    private WebElementFacade linkProductsCatalogs;

    @FindBy(xpath = "//a[contains(.,'Shipments in progress')]")
    private WebElementFacade linkShipmentsProgress;

    @FindBy(xpath = "//a[contains(.,'Contractors')]")
    private WebElementFacade linkContractors;

    @FindBy(xpath = "//a[contains(.,'Invoices')]")
    private WebElementFacade linkInvoices;

    @FindBy(xpath = "//a[contains(.,'Users')]")
    private WebElementFacade linkUsers;

    @FindBy(xpath = "//a[contains(.,'Search Engine')]")
    private WebElementFacade linkSearchEngine;


    public boolean isElementVisible() {
        return arteCheckElement.isPresent();
    }

    public void changeLanguageToEnglish() {

    }

    public void goToProductsCatalogsPage() {
        linkProductsCatalogs.click();
    }

    public void goToShipmentsProgressPage() {
        linkShipmentsProgress.click();
    }

    public void goToContractorsPage() {
        linkContractors.click();
    }

    public void goToInvoicesPage() {
        linkInvoices.click();
    }

    public void goToUsersPage() {
        linkUsers.click();
    }

    public void goToSearchEnginePage() {
        linkSearchEngine.click();
    }

    public void verify() {

    }

}
