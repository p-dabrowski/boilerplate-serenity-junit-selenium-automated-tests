package com.argeist.e2e_tests.tests;

import com.argeist.e2e_tests.pages.ArtePage;
import com.argeist.e2e_tests.pages.ContractorsPage;
import com.argeist.e2e_tests.pages.LoginPage;
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

    @Test
    public void loginTest() {
        loginPage.openLoginPage();
        loginPage.login();

        Assert.assertTrue("Element not visible", artePage.isElementVisible());
    }

    @Test
    public void checkContractorsModule() {
        loginPage.openLoginPage();
        loginPage.login();

        artePage.goToContractorsPage();

        Assert.assertTrue("Add contractor button not visible", contractorsPage.verify());
    }
}
