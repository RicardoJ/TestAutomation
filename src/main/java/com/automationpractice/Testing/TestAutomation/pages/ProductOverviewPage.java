package com.automationpractice.Testing.TestAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductOverviewPage extends BasePage {

	public ProductOverviewPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);

	}

	@FindBy(name="Submit")
    public WebElement buttonAddToCart;
	@FindBy(xpath="//a[@class='btn btn-default button button-medium']//span")
    public WebElement buttonProceedToCheckout;

	public void addToShoppingCart() {
	waitVisibility(buttonAddToCart);
	click(buttonAddToCart);
	waitVisibility(buttonProceedToCheckout);
	click(buttonProceedToCheckout);
}

}
