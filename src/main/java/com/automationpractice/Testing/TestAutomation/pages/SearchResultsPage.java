package com.automationpractice.Testing.TestAutomation.pages;

import java.util.List;

import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage extends BasePage {

	@FindBy(className = "product-name")
	private List<WebElement> products;

	@FindBy(className = "navigation_page")
	private WebElement productList;

	public SearchResultsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void chooseRandomProduct() {
		waitVisibility(productList);
		final int numberRandom = RandomUtils.nextInt(0, products.size());
		click(products.get(numberRandom));
	}
}
