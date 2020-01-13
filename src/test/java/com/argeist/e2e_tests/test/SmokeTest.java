package com.argeist.e2e_tests.test;

import com.argeist.e2e_tests.pages.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SmokeTest {
    @Managed
    private WebDriver driver;

    @Managed
    private LoginPage loginPage;

    @Managed
    private ArtePage artePage;

    @Managed
    private ContractorsPage contractorsPage;

    @Managed
    private ProductsCatalogsPage productsCatalogsPage;

    @Managed
    private InvoicesPage invoicesPage;

    @Managed
    private UsersPage usersPage;

    @Managed
    private ShipmentsProgressPage shipmentsProgressPage;

    @Managed
    private SearchEnginePage searchEnginePage;

    @Before
    public void before() {
        loginPage.openLoginPage();
        loginPage.login();

        artePage.showMenu();
    }

    @Test
    public void loginTest() {
        loginPage.openLoginPage();
        loginPage.login();

        Assert.assertTrue("Element not visible", artePage.verify());
    }

    @Test
    public void checkProductsCatalogsModule() {
        artePage.goToProductsCatalogsPage();

        Assert.assertTrue("Products catalogs not visible", productsCatalogsPage.verify());
    }

    @Test
    public void checkContractorsModule() {
        artePage.goToContractorsPage();

        Assert.assertTrue("Add contractor button not visible", contractorsPage.verify());
    }

    @Test
    public void checkInvoicesPage() {
        artePage.goToInvoicesPage();

        Assert.assertTrue("Invoices page not visible", invoicesPage.verify());
    }

    @Test
    public void checkUsersPage() {
        artePage.goToUsersPage();

        Assert.assertTrue("Users page not visible", usersPage.verify());
    }

    @Test
    public void checkSearchEnginePage() {
        artePage.goToSearchEnginePage();

        Assert.assertTrue("Search engine page not visible", searchEnginePage.verify());
    }

    @Test
    public void checkShipmentsProgressPage() {
        artePage.goToShipmentsProgressPage();

        Assert.assertTrue("Shipments progress not visible", shipmentsProgressPage.verify());
    }
}
