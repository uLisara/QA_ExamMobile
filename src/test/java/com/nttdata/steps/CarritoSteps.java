package com.nttdata.steps;

import com.nttdata.screens.CarritoScreen;
import org.junit.Assert;


public class CarritoSteps {
    CarritoScreen carritoScreen;

    public void showCarrito() {
        Assert.assertTrue("Products", carritoScreen.isProductsDisplayed());

    }
}
