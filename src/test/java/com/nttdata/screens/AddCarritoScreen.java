package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddCarritoScreen extends PageObject {
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement btnAddCarrito;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]")
    private WebElement btnCarrito;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noTV\"]")
    public WebElement cantidadElement;

    // Botón para aumentar la cantidad
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    public WebElement botonAumentar;

    public void seleccionarProducto(String producto) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement productoElement = findBy("//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\" and @text=" + producto + "']");
        productoElement.click();
    }

    public void addProducto( int cantidadEsperada){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        while (Integer.parseInt(cantidadElement.getText()) < cantidadEsperada) {
            botonAumentar.click();
        }
        if (Integer.parseInt(cantidadElement.getText()) == cantidadEsperada) {
            btnAddCarrito.click();
        } else {
            throw new AssertionError("La cantidad seleccionada no es correcta.");
        }

    }

    public void clickCarrito(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        btnCarrito.click();
    }


}
