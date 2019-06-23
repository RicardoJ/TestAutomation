package com.automationpractice.Testing.TestAutomation.stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.automationpractice.Testing.TestAutomation.pages.HomeYourLogoPage;
import com.automationpractice.Testing.TestAutomation.pages.ProductOverviewPage;
import com.automationpractice.Testing.TestAutomation.pages.SearchResultsPage;
import com.automationpractice.Testing.TestAutomation.validationPage.ShoppingCartSummary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.PageGenerator;

public class ProductToTheShoppingCartStepDefinitions {

	protected WebDriver driver = Hook.getDriver();

	@Given("^that I opened the browser at Your Logo page$")
	public void thatIOpenedBrowserAtYourLogo() throws Throwable {

		PageGenerator.getInstance(HomeYourLogoPage.class, driver).goToThePage();
	}

	@When("^I look for '(.*)' and select any displayed result to go to the shopping cart$")
	public void iLookForDressAndSelectAny(String product) throws Throwable {

		PageGenerator.getInstance(HomeYourLogoPage.class, driver).findProduct(product);
		PageGenerator.getInstance(SearchResultsPage.class, driver).chooseRandomProduct();
		PageGenerator.getInstance(ProductOverviewPage.class, driver).addToShoppingCart();
	}

	@Then("^should the shopping cart show the product is not '(.*)'$")
	public void inTheShoppingCartShowTheProductIsNotNullWithQuantityNotNull(String result) throws Throwable {
		assertEquals(result, PageGenerator.getInstance(ShoppingCartSummary.class, driver).validateShoppingCart());
	}
}
