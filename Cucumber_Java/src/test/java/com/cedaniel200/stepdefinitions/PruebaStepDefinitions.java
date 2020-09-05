package com.cedaniel200.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PruebaStepDefinitions {

    @Given("Cesar quiere hacer un hola mundo con BDD")
    public void cesarQuiereHacerUnHolaMundoConBDD() {
        System.out.println("Contexto");
    }

    @When("Cesar imprime hola mundo")
    public void cesarImprimeHolaMundo() {
        System.out.println("Accion ---> HOLA MUNDO");
    }

    @Then("Cesar deberia ver en consola un hola mundo")
    public void cesarDeberiaVerEnConsolaUnHolaMundo() {
        System.out.println("Resultado esperado");
    }
}
