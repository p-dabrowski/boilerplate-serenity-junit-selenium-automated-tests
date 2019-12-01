package com.argeist.e2e_tests.steps;

import com.argeist.e2e_tests.pages.ShopHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class HomePageSteps extends ScenarioSteps {

    private ShopHomePage homePage;

    @Step(value = "Otwarcie strony Home")
    public void openHomePage() {
        homePage.open();
    }

    @Step(value = "Otwarcie strony my Account")
    public void openMyAccountPage() {
        homePage.openMyAccountPage();
    }
}
