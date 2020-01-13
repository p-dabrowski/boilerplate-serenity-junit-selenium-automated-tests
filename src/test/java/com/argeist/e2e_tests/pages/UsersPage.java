package com.argeist.e2e_tests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;


public class UsersPage extends PageObject {

    @FindBy(xpath = "//main/div/div/div")
    private WebElementFacade usersPageElement;

    @FindBy(xpath = "//input[@id='search']")
    private WebElementFacade inputSearch;

    @FindBy(xpath = "//a[@href='/pdp/users/create']")
    private WebElementFacade buttonAdd;

    public Boolean verify() {
        return usersPageElement.isDisplayed() && inputSearch.waitUntilVisible().isDisplayed() && buttonAdd.isDisplayed();
    }

    public void filterUsersList(String key) {
        inputSearch.sendKeys(key);
        inputSearch.sendKeys(Keys.ENTER);
    }

    public void openAdduserForm() {
        buttonAdd.click();
    }
}
