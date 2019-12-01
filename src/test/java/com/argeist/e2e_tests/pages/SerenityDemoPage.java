package com.argeist.e2e_tests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

@DefaultUrl("http://seleniumdemo.com/")
public class SerenityDemoPage extends PageObject {

    private Logger logger = LoggerFactory.getLogger(SerenityDemoPage.class);

    @FindBy(id = "reg_password")
    private WebElementFacade regPasswordInput;

    public void checkElementState() {
        regPasswordInput.withTimeoutOf(3, TimeUnit.SECONDS).waitUntilNotVisible();

        logger.info("test");
    }
}
