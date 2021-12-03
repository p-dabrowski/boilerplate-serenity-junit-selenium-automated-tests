package com.organization.e2e_tests.test;

import com.argeist.e2e_tests.pages.*;
import com.organization.e2e_tests.pages.LoginPage;
import com.organization.e2e_tests.pages.MainPage;
import com.organization.e2e_tests.pages.ProductsCatalogsPage;
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
    private MainPage mainPage;

    @Managed
    ProductsCatalogsPage productsCatalogsPage;

    @Before
    public void before() {

        String username = environmentVariables.getProperty("username");
        String password = environmentVariables.getProperty("password");

        loginPage.openLoginPage();
        loginPage.login(username, password);

        mainPage.showMenu();
    }

    @Test
    public void loginTest() {
        Assert.assertTrue("page error", mainPage.verify());
    }

    @Test
    public void logoutTest() {
        mainPage.logout();

        Assert.assertTrue("Login page not displayed", loginPage.verify());
    }

    @Test
    public void checkProductsCatalogsModule() {
        mainPage.goToProductsCatalogsPage();

        Assert.assertTrue("Products catalogs not visible", productsCatalogsPage.verify());
    }
}
