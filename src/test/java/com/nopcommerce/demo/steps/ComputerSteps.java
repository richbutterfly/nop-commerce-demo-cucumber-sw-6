package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerSteps {
    @When("I click on Computer tab")
    public void iClickOnComputerTab() {
        new HomePage().clickOnComputers();

    }

    @Then("I should navigate on computer page successfully")
    public void iShouldNavigateOnComputerPageSuccessfully() {
        new ComputerPage().verifyComputerText();
    }

    @And("I click on Desktops link")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOnDesktops();
    }

    @Then("I should navigate to desktops page successfully")
    public void iShouldNavigateToDesktopsPageSuccessfully() {
        Assert.assertEquals(new DesktopPage().verifyTextDesktops(), "Desktops", "Desktops page is not displayed");
    }

    @And("I click on the product name {string}")
    public void iClickOnTheProductName(String arg0) {
        new DesktopPage().clickOnBuildYourOwnComputer();
    }

    @And("I select processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("I select RAM {string}")
    public void iSelectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRAM(ram);
    }

    @And("I select HDD {string}")
    public void iSelectHDD(String hdd) {
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("I select OS {string}")
    public void iSelectOS(String os) {
        new BuildYourOwnComputerPage().selectOS(os);
    }

    @And("I select software {string}")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCart();
    }

    @Then("I should see product has been added to your shopping cart and get confirmation message")
    public void iShouldSeeProductHasBeenAddedToYourShoppingCartAndGetConfirmationMessage() {
        String expectedMessage = "The product has been added to your shopping cart";
        Assert.assertEquals(new BuildYourOwnComputerPage().verifyTextProductAdded(), expectedMessage, "Product does not added to cart");
    }
}
