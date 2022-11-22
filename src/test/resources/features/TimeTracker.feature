@TimeTracker  @Smoke
Feature: 1- cargar horas 2- cargar dia, mes y año 3- generar entrada datos y cancelarla

  Scenario Outline: Cargar horas exitosamente y asociar un proyecto
    Given Estar en la pagina de login
    And el usuario se loguea con <email> y <password>
    And hace click en el signo mas
    And hace click en start time
    When ingresa hora de entrada <horaEntrada>
    And hace click en end time
    And ingresa hora de salida <horaSalida>
    And hace click en guardar
    And selecciona un proyecto
    And hace click en guardar
    Then se verifica que las horas se cargaron exitosamente

    Examples:
      | email                    | password | horaEntrada | horaSalida |
      | albagaitan.fsk@gmail.com | alba1234 | 9           | 12         |


  Scenario Outline: Cancelar el ingreso de datos exitosamente
    Given Estar en la pagina de login
    And el usuario se loguea con <email> y <password>
    And hace click en el signo mas
    And ingresa una descripcion <descripcion> de su trabajo
    And hace click en el icono de la flecha
    Then se verifica que los datos no fueron agregados

    Examples:
      | email                    | password | descripcion |
      | albagaitan.fsk@gmail.com | alba1234 | prueba1     |


  Scenario Outline: Cargar horas y fechas en la aplicacion exitosamente
    Given Estar en la pagina de login
    And el usuario se loguea con <email> y <password>
    And hace click en el signo mas
    And hace click en start time
    When ingresa hora de entrada <horaEntrada>
    And hace click en end time
    And ingresa hora de salida <horaSalida>
    And ingresa fecha <fechaEntrada>
    And hace click en guardar
    And selecciona un proyecto
    And hace click en guardar
    Then se verifica que las horas se cargaron exitosamente

    Examples:
      | email                    | password | horaEntrada | horaSalida | fechaEntrada      |
      | albagaitan.fsk@gmail.com | alba1234 | 9           | 12         | 15 noviembre 2022 |





