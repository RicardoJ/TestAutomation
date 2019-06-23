package com.automationpractice.Testing.TestAutomation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resource/features",
        glue= {"com.automationpractice.Testing.TestAutomation.stepDefinitions"}
)
public class ProductToTheShoppingCartRunner {

}
