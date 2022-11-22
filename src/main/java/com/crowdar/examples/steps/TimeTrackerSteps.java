package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.LoginService;
import com.crowdar.examples.services.TimeTrackerService;
import cucumber.api.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TimeTrackerSteps extends PageSteps {

    @And("hace click en start time")
    public void haceClickEnStartTime() {
        TimeTrackerService.clikStarTime();
    }

    @And("hace click en guardar")
    public void haceClickEnGuardar() {
        TimeTrackerService.btnSave();
    }

    @And("selecciona un proyecto")
    public void seleccionaUnProyecto() {
        TimeTrackerService.selectProject();
    }

    @Then("se verifica que las horas se cargaron exitosamente")
    public void seVerificaQueLasHorasSeCargaronExitosamente() {
        TimeTrackerService.verifySave();
    }

    @When("ingresa hora de entrada (.*)")
    public void ingresaUnHorarioEntrada(String horaEntrada) {
        TimeTrackerService.ingresaHsEntrada(horaEntrada);
    }

    @And("ingresa hora de salida (.*)")
    public void ingresarUnHorarioDeSalida(String horaSalida ) {
        TimeTrackerService.ingresaHsSalida(horaSalida);
    }

    @And("hace click en end time")
    public void haceClickEnEndTime() {
        TimeTrackerService.clickEndTime();
    }

    @And("ingresa fecha (.*)")
    public void ingresaFecha(String fecha) {
        TimeTrackerService.IngresaFecha(fecha);
    }

    @And("ingresa una descripcion (.*) de su trabajo")
    public void ingresaUnaDescripcionDescripcionDeSuTrabajo(String descripcion) {
        TimeTrackerService.ingresarDescripcion(descripcion);
    }

    @And("hace click en el icono de la flecha")
    public void haceClickEnElIconoDeLaFlecha() {
        TimeTrackerService.clickBack();
    }

    @Then("se verifica que los datos no fueron agregados")
    public void seVerificaQueLosDatosNoFueronAgregados() {
        TimeTrackerService.verifyDiscard();
    }
}
