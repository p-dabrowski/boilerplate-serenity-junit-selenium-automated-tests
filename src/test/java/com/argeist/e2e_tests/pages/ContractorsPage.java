package com.argeist.e2e_tests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class ContractorsPage extends PageObject {

    @FindBy(xpath = "//a[@id='contractors-create-button']")
    private WebElementFacade addContractorButton;

    @FindBy(xpath = "//div[@id='table-contractors']")
    private WebElementFacade tableContractors;


    public Boolean verify() {
        return
                addContractorButton.waitUntilVisible().isDisplayed() &&
                tableContractors.isDisplayed();
    }

    public void openAddContractorForm() {
        addContractorButton.click();
    }

}
