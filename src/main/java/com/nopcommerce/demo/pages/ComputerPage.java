package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    @CacheLookup
    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Desktops']")
    WebElement desktops;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu mobile']//a[normalize-space()='Notebooks']")
    WebElement notebooks;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu mobile']//a[normalize-space()='Software']")
    WebElement software;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computersText;

    public void clickOnDesktops() {
        log.info("Clicking on Desktops : " + desktops.toString());
        mouseHoverToElementAndClick(desktops);
    }
    public void clickOnNotebooks() {
        log.info("Clicking on Notebooks : " + notebooks.toString());
        clickOnElement(notebooks);
    }
    public void clickOnSoftware() {
        log.info("Clicking on Software : " + software.toString());
        clickOnElement(software);
    }
    public String verifyComputerText (){
        log.info("Getting text from : " + computersText.toString());
        return getTextFromElement(computersText);
    }
}
