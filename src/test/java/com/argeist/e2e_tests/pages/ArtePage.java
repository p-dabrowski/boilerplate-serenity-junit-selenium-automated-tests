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


    @FindBy(xpath = "//button[@id='app-bar-account-button']")
    private WebElementFacade userMenuButton;

    @FindBy(xpath = "//button[@id='app-bar-menu-logout-button']")
    private WebElementFacade logoutButton;

    @FindBy(xpath = "//button[@id='app-bar-settings-button']")
    private WebElementFacade settingsButton;

    @FindBy(xpath = "//li[contains(.,'Polish')]")
    private WebElementFacade settingsPolish;

    @FindBy(xpath = "//li[contains(.,'English')]")
    private WebElementFacade settingsEnglish;

    @FindBy(xpath = "//button[@id='app-bar-hamburger-button']")
    private WebElementFacade showMenuButton;

    @FindBy(xpath = "//a[@id='navlink-stablo-productCatalogs']")
    private WebElementFacade linkProductsCatalogs;

    @FindBy(xpath = "//a[@id='navlink-prodis-shipments']")
    private WebElementFacade linkShipmentsProgress;

    @FindBy(xpath = "//a[@id='navlink-dropshipping-contractors']")
    private WebElementFacade linkContractors;

    @FindBy(xpath = "//a[@id='navlink-dropshipping-invoices']")
    private WebElementFacade linkInvoices;

    @FindBy(xpath = "//a[@id='navlink-pdp-users']")
    private WebElementFacade linkUsers;

    @FindBy(xpath = "//a[@id='navlink-production-searchEngine']")
    private WebElementFacade linkSearchEngine;


    public void changeLanguageToEnglish() {
        userMenuButton.click();
        settingsPolish.click();
    }

    public void showMenu() {
        showMenuButton.click();
    }

    public void logout() {
        userMenuButton.click();
        logoutButton.click();
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

    public Boolean verify() {
        return userMenuButton.isDisplayed();
    }

}
