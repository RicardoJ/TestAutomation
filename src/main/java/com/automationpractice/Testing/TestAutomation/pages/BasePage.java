package com.automationpractice.Testing.TestAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;
	WebDriverWait wait;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 15);
	}

	public void click(WebElement element) {
		element.click();
	}

	public void writeText(WebElement element, String word) {
		element.sendKeys(word);
	}

	public void waitVisibility(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public String exists(WebElement element) {
		waitVisibility(element);
		if (element.getText().isEmpty()) {
			return element.getText();
		} else {
			return "null";
		}
	}

}
