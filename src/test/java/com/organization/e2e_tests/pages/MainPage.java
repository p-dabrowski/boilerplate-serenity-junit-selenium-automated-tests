package com.organization.e2e_tests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DefaultUrl("http://www.testpage.com/")
public class MainPage extends PageObject {

    private Logger logger = LoggerFactory.getLogger(MainPage.class);


    @FindBy(xpath = "//button[@id='app-bar-menu-logout-button']")
    private WebElementFacade logoutButton;

    @FindBy(xpath = "//button[@id='app-bar-settings-button']")
    private WebElementFacade settingsButton;

    @FindBy(xpath = "//button[@id='app-bar-account-button']")
    private WebElementFacade accountButton;


    @FindBy(xpath = "//button[@id='app-bar-hamburger-button']")
    private WebElementFacade showMenuButton;

    @FindBy(xpath = "//a[@id='navlink-stablo-productCatalogs']")
    private WebElementFacade linkProductsCatalogs;


    public void showMenu() {
        showMenuButton.click();
    }

    public void logout() {
        accountButton.click();
        logoutButton.click();
    }

    public void goToProductsCatalogsPage() {
        linkProductsCatalogs.click();
    }

    public Boolean verify() {
        return settingsButton.isDisplayed() && accountButton.isDisplayed();
    }
}
