package com.argeist.e2e_tests.tests;

import com.argeist.e2e_tests.pages.ArtePage;
import com.argeist.e2e_tests.pages.LoginPage;
import cucumber.api.java.it.Ma;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginpageTest {
    @Managed
    private WebDriver driver;

    @Managed
    private LoginPage loginPage;

    @Managed
    private ArtePage artePage;

    @Test
    public void loginTest() {
        loginPage.openLoginPage();
        loginPage.login();

        Assert.assertTrue("Element not visible", artePage.isElementVisible());

    }
}
