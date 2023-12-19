package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopsText;

    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortBy;

    @CacheLookup
    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement display;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='List']")
    WebElement productList;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputer;

    public String verifyTextDesktops() {
        log.info("Getting text from : " + desktopsText.toString());
        return getTextFromElement(desktopsText);
    }

    public void selectOptionsFromSortBy(String sortby) {
        log.info("Select options from dropdown : " + sortBy.toString());
        selectByVisibleTextFromDropDown(sortBy, sortby);
    }

    public void selectOptionsFromDisplayBy(String displayBy) {
        log.info("Select options from dropdown : " + display.toString());
        selectByVisibleTextFromDropDown(display, displayBy);
    }

    public void clickOnProductListView() {
        log.info("Clicking on Product List view : " + productList.toString());
        clickOnElement(productList);
    }
    public void clickOnBuildYourOwnComputer() {
        log.info("Clicking on Build Your Own Computer : " +buildYourOwnComputer.toString());
        clickOnElement(buildYourOwnComputer);
    }
}
