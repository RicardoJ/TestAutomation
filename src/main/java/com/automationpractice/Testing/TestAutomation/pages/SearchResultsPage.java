package com.automationpractice.Testing.TestAutomation.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage {
	int numeroRandom = (int) (Math.random() * 10)+1;
	public SearchResultsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="product_list grid row")
    public List< WebElement> products;

	public void chooseProduct() {
		click(products.get(numeroRandom));
	}
}
