package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BuildYourOwnComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Build your own computer']")
    WebElement textBuiltYourOwnComputer;

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processorLink;

    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ramLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    List<WebElement> hddRadioButton;

    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    List<WebElement> osRadioButton;

    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    List<WebElement> softwareCheckBoxes;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement textProductAddedToYourCart;

    public String verifyBuildYourOwnComputer() {
        log.info("Get productName text : " + textBuiltYourOwnComputer.getText());
        return getTextFromElement(textBuiltYourOwnComputer);
    }

    public void selectProcessor(String processor) {
        log.info("Select Processor from dropdown : " + processorLink.toString());
        selectByVisibleTextFromDropDown(processorLink, processor);
    }

    public void selectRAM(String ram) {
        log.info("Select RAM from dropdown : " + ramLink.toString());
        selectByVisibleTextFromDropDown(ramLink, ram);
    }

    public void selectHDD(String hDD) {
        for (WebElement hdd : hddRadioButton) {
            if (hdd.getText().equals(hDD)) {
                clickOnElement(hdd);
                log.info("Clicking On HDD radio Button : " + hddRadioButton + "'" + "<br>");
                break;
            }
        }
    }

    public void selectOS(String osBtn) {
        for (WebElement os : osRadioButton) {
            if (os.getText().equals(osBtn)) {
                clickOnElement(os);
                log.info("Clicking On OS radio Button : " + osBtn + "'" + "<br>");
                break;
            }
        }
    }

    public void selectSoftware(String softwareName) {
        for (WebElement software : softwareCheckBoxes) {
            if (software.getText().equals(softwareName)) {
                clickOnElement(software);
                log.info("Clicking on check : " + softwareCheckBoxes + "'" + "<br>");
            }
        }


    }

    public void clickOnAddToCart() {
        log.info("Clicking on Add to Cart : " + addToCart.toString());
        clickOnElement(addToCart);
    }

    public String verifyTextProductAdded() {
        log.info("Get productAdded Message : " + textProductAddedToYourCart.getText());
        return getTextFromElement(textProductAddedToYourCart);

    }
}