package com.nttdata.stepsdefinitions;

import com.nttdata.steps.AddCarritoSteps;
import com.nttdata.steps.CarritoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class CarritoSD {
    @Steps
    CarritoSteps carritoSteps;
    AddCarritoSteps addCarritoSteps;

    @Given("estoy en la aplicacion Sauce Labs")
    public void estoyEnLaAplicacionSauceLabs() {
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        carritoSteps.showCarrito();
    }

    @When("agrego unidades{int} del siguiente producto{string}")
    public void agregoUnidadesUnidadesDelSiguienteProductoProducto(int unidades, String producto) {
        addCarritoSteps.selectProduct(producto);
        addCarritoSteps.aniadirCarrito(unidades);
    }

    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
        addCarritoSteps.verCarrito();
    }



}
