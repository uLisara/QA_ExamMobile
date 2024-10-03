Feature: Carrito
  @Swag
  Scenario Outline: Carrito con productos
    Given estoy en la aplicacion Sauce Labs
    And valido que carguen correctamente los productos en la galeria
    When agrego unidades<unidades> del siguiente producto<producto>
    Then valido el carrito de compra actualice correctamente
    Examples:
      |producto                   |unidades |
      |Sauce Labs Backpack        |1        |
      |Sauce Labs Bolt - T Shirt1 |1        |
      |Sauce Labs Bike Ligth      |1        |
