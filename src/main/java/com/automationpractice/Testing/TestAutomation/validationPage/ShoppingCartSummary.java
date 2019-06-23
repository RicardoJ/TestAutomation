package com.automationpractice.Testing.TestAutomation.validationPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automationpractice.Testing.TestAutomation.pages.BasePage;

import utils.TheResultInShoppingCart;

public class ShoppingCartSummary extends BasePage{

	@FindBy(xpath="//td[@class='cart_description']//p[@class='product-name']//a")
    private WebElement productInShoppingCart;

	public ShoppingCartSummary(WebDriver driver) {
		super(driver);

	}

	public void validateTheShoppingCart(WebElement element){
		TheResultInShoppingCart result = new TheResultInShoppingCart(element);
		result.exis(productInShoppingCart);

	}

}
