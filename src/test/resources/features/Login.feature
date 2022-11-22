Feature: Como usuario del sistema quiero interactuar con la aplicacion para registrar las horas de trabajo

  Background:
    Given Estar en la pagina de login

  @Login
  Scenario Outline: Login exitoso
    When el usuario se loguea con <email> y <password>
    Then se visualiza la pagina principal

    Examples:
      | email                    | password |
      | albagaitan.fsk@gmail.com | alba1234 |

  @Logout
  Scenario Outline: Cerrar sesion exitosamente
    When el usuario se loguea con <email> y <password>
    And hace click en el menu lateral
    And hace click en cerrar sesion
    And hace click en confirmar
    Then se verifica que cierra sesion exitosamente

    Examples:
      | email                    | password |
      | albagaitan.fsk@gmail.com | alba1234 |







