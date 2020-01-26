package com.argeist.e2e_tests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;

import java.util.List;


public class UsersPage extends PageObject {

    @FindBy(xpath = "//div[@id='table-users']")
    private WebElementFacade tableUsers;

    @FindBy(xpath = "//input[@id='users-search-input']")
    private WebElementFacade inputSearch;

    @FindBy(xpath = "//div[@id='table-users-body-row']")
    private List<WebElementFacade> tableRow;

    @FindBy(xpath = "//a[@id='users-create-button'")
    private WebElementFacade buttonAdd;

    public Boolean verify() {
        return tableUsers.isDisplayed() && inputSearch.waitUntilVisible().isDisplayed() && buttonAdd.isDisplayed();
    }

    public void filterUsersList(String key) {
        inputSearch.sendKeys(key);
        inputSearch.sendKeys(Keys.ENTER);

        tableRow.get(0).waitUntilVisible();
    }

    public void openAdduserForm() {
        buttonAdd.click();
    }

    public String getUsersTableText() {
        return tableUsers.getText();
    }

    public int tableUsersRowsCount() {
        return tableRow.size();
    }
}
