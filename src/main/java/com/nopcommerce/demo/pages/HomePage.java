package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Khyati Savla
 */
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement nopCommerceLogo;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOut;

    @CacheLookup
    @FindBy(xpath = "(//a[@class='ico-account'])[1]")
    WebElement accountLink;

    public String getWelcomeText() {
        String message = getTextFromElement(welcomeText);
        log.info("Getting text from : " + welcomeText.toString());
        return message;
    }

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computers;
    public void clickOnLoginLink() {
        log.info("Clicking on login Link : " + loginLink.toString());
        clickOnElement(loginLink);
    }

    public String getTextLogIn() {
        log.info("Getting text from : " + loginLink.toString());
        return getTextFromElement(loginLink);
    }

    public void clickOnLogOutLink() {
        log.info("Clicking on log out Link : " + logOut.toString());
        clickOnElement(logOut);
    }

    public String getTextLogOut() {
        return getTextFromElement(logOut);
    }

    public void clickOnComputers() {
        log.info("Clicking on Computers : " + computers.toString());
        clickOnElement(computers);
    }

    public void clickOnRegisterLink() {
        log.info("Clicking on Register Link : " + registerLink.toString());
        clickOnElement(registerLink);
    }
    public String getMyAccountText() {
        log.info("Getting text from : " + accountLink.toString());
        return getTextFromElement(accountLink);

    }
    public void selectMenu(String menu) {
        List<WebElement> topMenu = driver.findElements(By.xpath("//ul[@class='top-menu notmobile']//li//a"));
        for (WebElement tabs : topMenu) {
            if (menu.equalsIgnoreCase(tabs.getText())) {
                tabs.click();
                break;
            }
        }
    }

}

