Feature: Categoría TextBox
  Como usuario de ToolsQA quiero usar el elemento TextBox

  Scenario: Ingresar a la sección TextBox desde la home de ToolsQA
    Given   El usuario se encuentra en la página Home de ToolsQa
    When    Hace clic en la seccion TextBox
    And     Ingresa su nombre en el campo Full Name
    And     Ingresa su emails en el campo Email
    And     Ingresa su direccion actual en el campo Current Address
    And     Ingresa su dirección permanente en el campo Current Address
    And     Se presiona el boton 'Submit'
    Then    Se debe mostrar sección con todos los datos ingresados