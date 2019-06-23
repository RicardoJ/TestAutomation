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
		wait = new WebDriverWait(driver, 10);
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

	 public String exist(WebElement element) {

			if(!element.getText().isEmpty()) {
				return "null";
			}else
			{
				return element.getText();
			}
		}


}
