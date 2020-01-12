package com.argeist.e2e_tests.tests;

import com.argeist.e2e_tests.pages.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SmokeTests {
    @Managed
    private WebDriver driver;

    @Managed
    private LoginPage loginPage;

    @Managed
    private ArtePage artePage;

    @Managed
    private ContractorsPage contractorsPage;

    @Managed
    ProductsCatalogsPage productsCatalogsPage;

    @Managed
    private InvoicesPage invoicesPage;

    @Managed
    private UsersPage usersPage;

    @Managed
    private ShipmentsProgressPage shipmentsProgressPage;

    @Managed
    private SearchEnginePage searchEnginePage;

    @Test
    public void loginTest() {
        loginPage.openLoginPage();
        loginPage.login();

        Assert.assertTrue("Element not visible", artePage.verify());
    }

    @Test
    public void checkProductsCatalogsModule() {
        loginPage.openLoginPage();
        loginPage.login();

        artePage.showMenu();
        artePage.goToProductsCatalogsPage();

        Assert.assertTrue("Products catalogs not visible", productsCatalogsPage.verify());
    }



    @Test
    public void checkContractorsModule() {
        loginPage.openLoginPage();
        loginPage.login();

        artePage.showMenu();
        artePage.goToContractorsPage();

        Assert.assertTrue("Add contractor button not visible", contractorsPage.verify());
    }

    @Test
    public void checkInvoicesPage() {
        loginPage.openLoginPage();
        loginPage.login();

        artePage.showMenu();
        artePage.goToInvoicesPage();

        Assert.assertTrue("Invoices page not visible", invoicesPage.verify());
    }

    @Test
    public void checkUsersPage() {
        loginPage.openLoginPage();
        loginPage.login();

        artePage.showMenu();
        artePage.goToUsersPage();

        Assert.assertTrue("Users page not visible", usersPage.verify());
    }

    @Test
    public void checkSearchEnginePage() {
        loginPage.openLoginPage();
        loginPage.login();

        artePage.showMenu();
        artePage.goToSearchEnginePage();

        Assert.assertTrue("Search engine page not visible", searchEnginePage.verify());
    }

    @Test
    public void checkShipmentsProgressPage() {
        loginPage.openLoginPage();
        loginPage.login();

        artePage.showMenu();
        artePage.goToShipmentsProgressPage();

        Assert.assertTrue("Shipments progress not visible", shipmentsProgressPage.verify());
    }
}
