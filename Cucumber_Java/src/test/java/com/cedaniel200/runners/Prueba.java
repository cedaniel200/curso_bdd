package com.cedaniel200.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/prueba.feature",
        glue = {"com.cedaniel200.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class Prueba {

}