package com.automationpractice.Testing.TestAutomation.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.automationpractice.Testing.TestAutomation.pages.HomeYourLogoPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.PageGenerator;

public class ProductToTheShoppingCartStepdefinitions {

	WebDriver driver =Hook.getDriver();

	@Given("^that I opened  browser at Your Logo page$")
	public void thatIOpenedBrowserAtYourLogo() throws Throwable {

		PageGenerator.getInstance(HomeYourLogoPage.class, driver).goToThePage();
	}

	@When("^I look for '(.*)' and select any for to go to shopping cart$")
	public void iLookForDressAndSelectAny(String product) throws Throwable {
//llamar el page escribe en el input y el que selecciona el producto , vamos hasta el carrito de compra
		System.out.println(product);
		PageGenerator.getInstance(HomeYourLogoPage.class, driver).findProduct(product);
	}

	@Then("^in the shopping cart show the product is not '(.*)'$")
	public void inTheShoppingCartShowTheProductIsNotNullWithQuantityNotNull() throws Throwable {
//luego se verifica que el carrito de compra este lleno
	}
}
