package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.LoginService;
import com.crowdar.examples.services.SettingService;
import cucumber.api.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class SettingSteps extends PageSteps {

    @And("hace click en ajustes")
    public void clickAjustes() {
        SettingService.clickSettings();
    }

    @When("habilita el modo oscuro")
    public void habilitaElModoOscuro() {
        SettingService.changeModeDark();
    }

    @Then("se visualiza el tema aplicado")
    public void seVisualizaElTemaAplicado() {
        SettingService.verifyThemeDark();
    }
}
