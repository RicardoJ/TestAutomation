package utils;

import org.openqa.selenium.WebElement;

public class TheResultInShoppingCart {
	WebElement element;

public TheResultInShoppingCart(WebElement element) {

		this.element = element;
	}

public String exis(WebElement element) {
	if(!element.getText().isEmpty()) {
		return "null";
	}else
	{
		return element.getText();
	}
}
}
