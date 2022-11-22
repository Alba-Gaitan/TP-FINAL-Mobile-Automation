Feature:modo dark

  Scenario Outline: Login exitoso
    Given Estar en la pagina de login
    And el usuario se loguea con <email> y <password>
    And hace click en el menu lateral
    And hace click en ajustes
    When habilita el modo oscuro
    Then se visualiza el tema aplicado

    Examples:
      | email                    | password |
      | albagaitan.fsk@gmail.com | alba1234 |






