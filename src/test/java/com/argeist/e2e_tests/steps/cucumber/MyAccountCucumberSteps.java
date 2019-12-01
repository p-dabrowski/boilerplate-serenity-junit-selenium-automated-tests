package com.argeist.e2e_tests.steps.cucumber;

import com.argeist.e2e_tests.steps.HomePageSteps;
import com.argeist.e2e_tests.steps.MyAccountSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class MyAccountCucumberSteps {
    @Steps
    private HomePageSteps homePageSteps;

    @Steps
    private MyAccountSteps myAccountSteps;

    @Given("user is on selenium demo page")
    public void openSeleniumDemoHomePage() {
        homePageSteps.openHomePage();
    }

    @When("^user open account page$")
    public void userOpenAccountPage() {
        homePageSteps.openMyAccountPage();
    }

    @Then("^should see logout link$")
    public void shouldSeeLogoutLink() {
    }


    @And("^register with (.*) and (.*)$")
    public void registerWithEmailAndPassword(String email, String password) {
        myAccountSteps.registerUser(email, password);
    }
}
