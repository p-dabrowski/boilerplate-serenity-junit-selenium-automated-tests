package com.argeist.e2e_tests.tests;

import com.argeist.e2e_tests.steps.HomePageSteps;
import com.argeist.e2e_tests.steps.MyAccountSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SimpleSeleniumTest {

    @Managed
    private WebDriver driver;

    @Steps
    private HomePageSteps homePageSteps;

    @Steps
    private MyAccountSteps myAccountSteps;

    //@Test
    public void openSeleniumDemoPage() {
        homePageSteps.openHomePage();


        homePageSteps.openMyAccountPage();

        myAccountSteps.registerUser("random@gmail.com", "1234QWERasdf#$%%");

        Assert.assertEquals(myAccountSteps.getErrorMessage(), "Error: An account is already registered with your email address. Please log in.");
    }

    //@Test
    public void serenityDemoPage() {
        //serenityDemoPage.open();

        //serenityDemoPage.checkElementState();
    }
}
