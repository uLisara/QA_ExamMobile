package com.nttdata.steps;

import com.nttdata.screens.AddCarritoScreen;

public class AddCarritoSteps {

    AddCarritoScreen addCarritoScreen;

public void selectProduct(String producto){

        addCarritoScreen.seleccionarProducto(producto);
}

public void aniadirCarrito(int cant){
        addCarritoScreen.addProducto(cant);

      }

      public void verCarrito(){

          addCarritoScreen.clickCarrito();
      }
}




