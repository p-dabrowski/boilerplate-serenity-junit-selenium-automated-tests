package com.argeist.e2e_tests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;

@DefaultUrl("http://www.artgeist.com/")
public class ArtePage extends PageObject {

    @FindBy(className = "jss1")
    private WebElementFacade element;

    public Boolean isElementVisible() {
        return element.isPresent();
    }

    public void verify() {

    }

}
