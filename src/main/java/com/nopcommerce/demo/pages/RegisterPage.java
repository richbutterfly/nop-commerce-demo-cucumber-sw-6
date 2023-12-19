package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerText;
    @CacheLookup
    @FindBy(xpath = "//div[@id='gender']//label")
    List<WebElement> genderRadios;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dayOfBirth;

    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement dateOfBirthMonth;

    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement dateOfBirthYear;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(name = "register-button")
    WebElement registerButton;
    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement textFirstNameIsRequired;
    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement textLastNameIsRequired;
    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement textEmailIsRequired;
    @CacheLookup
    @FindBy(id = "Password-error")
    WebElement textPasswordIsRequired;
    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement textConfirmPasswordIsRequired;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement textYourRegistrationCompleted;

    @CacheLookup
    @FindBy(css = ".button-1.register-continue-button")
    WebElement continueButton;

    public void selectGender(String genderRadio) {
        for (WebElement gender : genderRadios ){
            if (gender.getText().contains(genderRadio)){
                log.info("Select gender :" +gender+ "radio button" + "<br>");
                clickOnElement(gender);
                break;
            }
        }
    }
    public void enterFirstName(String firstname) {
        log.info("Enter Firstname : '" + firstNameField.toString());
        sendTextToElement(firstNameField, firstname);
    }

    public void enterLastName(String lastname) {
        log.info("Enter Firstname : '" + lastNameField.toString());
        sendTextToElement(lastNameField, lastname);
    }

    public void selectDayOfBirth(String date) {
        log.info("Select date from dropDown : " + dayOfBirth.toString());
        selectByVisibleTextFromDropDown(dayOfBirth, date);
    }

    public void selectDateOfBirthMonth(String month) {
        log.info("Select month from dropDown : " + dateOfBirthMonth.toString());
        selectByVisibleTextFromDropDown(dateOfBirthMonth, month);
    }

    public void selectDateOfBirthYear(String year) {
        log.info("Select year from dropDown : " + dateOfBirthYear.toString());
        selectByVisibleTextFromDropDown(dateOfBirthYear, year);
    }

    public void enterEmailId(String email) {
        log.info("Enter email into : " + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        log.info("Enter password into : " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        log.info("Enter Confirm password into : " + confirmPasswordField.toString());
        sendTextToElement(confirmPasswordField, confirmPassword);
    }

    public void clickOnRegisterButton() {
        log.info("Clicking on Register button : " + registerButton.toString());
        clickOnElement(registerButton);
    }

    public String verifyRegisterText() {
        return getTextFromElement(registerText);
    }

    public String verifyTextRegistrationComplete() {
        return getTextFromElement(textYourRegistrationCompleted);
    }

    public void clickOnContinueButton() {
        log.info("Clicking on continue button : " + continueButton.toString());
        clickOnElement(continueButton);

    }

    public String verifyTextFirstNameIsRequired() {
        log.info("Getting text from : " + textFirstNameIsRequired.toString());
        return getTextFromElement(textFirstNameIsRequired);
    }

    public String verifyTextLastNameIsRequired() {
        log.info("Getting text from : " + textLastNameIsRequired.toString());
        return getTextFromElement(textLastNameIsRequired);
    }

    public String verifyTextEmailIsRequired() {
        log.info("Getting text from : " + textEmailIsRequired.toString());
        return getTextFromElement(textEmailIsRequired);
    }

    public String verifyTextPasswordIsRequired() {
        log.info("Getting text from : " + textPasswordIsRequired.toString());
        return getTextFromElement(textPasswordIsRequired);
    }

    public String verifyTextConfirmPasswordIsRequired() {
        log.info("Getting text from : " + textConfirmPasswordIsRequired.toString());
        return getTextFromElement(textConfirmPasswordIsRequired);
    }

}