package com.automationpractice.Testing.TestAutomation.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage extends BasePage {
	int numeroRandom = (int) (Math.random() * 7)+1;
	public SearchResultsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(className="product-name")
    public List< WebElement> products;

	public void chooseProduct() {

		click(products.get(numeroRandom));
	}
}
