package com.argeist.e2e_tests.test;

import com.argeist.e2e_tests.pages.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.util.EnvironmentVariables;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SmokeTest {
    private EnvironmentVariables environmentVariables;

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

        String username = environmentVariables.getProperty("username");
        String password = environmentVariables.getProperty("password");

        loginPage.openLoginPage();
        loginPage.login(username, password);

        artePage.showMenu();
    }

    @Test
    public void loginTest() {
        Assert.assertTrue("Arte page check error", artePage.verify());
    }

    @Test
    public void logoutTest() {
        artePage.logout();

        Assert.assertTrue("Login page not displayed", loginPage.verify());
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

        usersPage.openAddUserForm();
        Assert.assertTrue("'Create user' form invalid", usersPage.checkAddUserForm());
    }

    @Test
    public void checkUsersFilter() {
        artePage.goToUsersPage();

        String key = "pdabrowski1";

        usersPage.filterUsersList(key);
        Assert.assertTrue("Users list incorrect rows number", usersPage.tableUsersRowsCount() == 1);
        Assert.assertTrue("Users list doesn't contain: " +key, usersPage.getUsersTableText().contains(key));
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
