package com.argeist.e2e_tests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


//@DefaultUrl("http://seleniumdemo.com/")
public class ShopHomePage extends PageObject {

    @FindBy(xpath = "//li[@id='menu-item-22']//a")
    private WebElementFacade MyAccountPageLink;


    public void openMyAccountPage() {
        MyAccountPageLink.click();
    }

}
