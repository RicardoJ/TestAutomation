package com.automationpractice.Testing.TestAutomation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resource/features",
        glue= {"com.automationpractice.Testing.TestAutomation.stepDefinitions"}
)
public class ProductToTheShoppingCartRunner {

}
