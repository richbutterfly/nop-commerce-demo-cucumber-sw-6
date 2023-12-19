package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("I should navigate on register page successfully and I should see the text {string}")
    public void iShouldNavigateOnRegisterPageSuccessfullyAndIShouldSeeTheText(String registrationPageOpen) {
        Assert.assertEquals(new RegisterPage().verifyRegisterText(), registrationPageOpen, "Registration page is not displayed");
    }

    @And("I click on register button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("I should verify the error message {string}")
    public void iShouldVerifyTheErrorMessage(String arg0) {
    }

    @And("I click on radio button {string}")
    public void iClickOnRadioButton(String gender) {
        new RegisterPage().selectGender(gender);
    }

    @And("I enter {string} in first name field")
    public void iEnterInFirstNameField(String firstName) {
        new RegisterPage().enterFirstName(firstName);
    }

    @And("I enter {string} in last name field")
    public void iEnterInLastNameField(String lastName) {
        new RegisterPage().enterLastName(lastName);
    }

    @And("I select {string} from day dropdown")
    public void iSelectFromDayDropdown(String day) {
        new RegisterPage().selectDayOfBirth(day);
    }

    @And("I select {string} from month dropdown")
    public void iSelectFromMonthDropdown(String month) {
        new RegisterPage().selectDateOfBirthMonth(month);
    }

    @And("I select {string} from year dropdown")
    public void iSelectFromYearDropdown(String year) {
        new RegisterPage().selectDateOfBirthYear(year);
    }

    @And("I enter {string} in Email id field")
    public void iEnterInEmailIdField(String email) {
        new RegisterPage().enterEmailId(email);
    }

    @And("I enter {string} in password field")
    public void iEnterInPasswordField(String passWord) {
        new RegisterPage().enterPassword(passWord);
    }

    @And("I User enter {string} in confirm password field")
    public void iUserEnterInConfirmPasswordField(String confirmPassword) {
        new RegisterPage().enterConfirmPassword(confirmPassword);
    }

    @And("I click on register button again")
    public void iClickOnRegisterButtonAgain() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("I should navigate to the Home page successfully and get message {string}")
    public void iShouldNavigateToTheHomePageSuccessfullyAndGetMessage(String arg0) {
        Assert.assertEquals(new RegisterPage().verifyTextRegistrationComplete(), "Your registration completed");
    }


}
