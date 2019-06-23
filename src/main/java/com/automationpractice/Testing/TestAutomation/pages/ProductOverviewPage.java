package com.automationpractice.Testing.TestAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductOverviewPage extends BasePage {

	public ProductOverviewPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(name="Submit")
    public WebElement buttonAddToCart;
	@FindBy(className="btn btn-default button button-medium")
    public WebElement buttonProceedToCheckout;

	public void addToShoppingCart() {
	click(buttonAddToCart);
	click(buttonProceedToCheckout);
}

}
