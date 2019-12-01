package com.argeist.e2e_tests.steps;

import com.argeist.e2e_tests.pages.MyAccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MyAccountSteps extends ScenarioSteps {

    private MyAccountPage myAccountPage;

    @Step("Register user with email {0} and password {1}")
    public void registerUser(String email, String password) {
        myAccountPage.registerUser(email, password);
    }

    @Step
    public void checkLogoutLink() {

    }

    @Step
    public String getErrorMessage() {
        return myAccountPage.getErrorMessage();
    }
}
