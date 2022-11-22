package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import org.testng.Assert;

import static com.crowdar.examples.constants.TimeTrackerConstants.*;


public class TimeTrackerService {

    public static void clikStarTime() {
        MobileActionManager.click(TIMEENTRY_START_TIME);
    }
    public static void btnSave() {
        MobileActionManager.click(BTN_SAVE);
    }

    public static void selectProject() {
        MobileActionManager.waitVisibility(SELECT_PROJECT);
        MobileActionManager.click(SELECT_PROJECT);
        MobileActionManager.waitVisibility(NAME_PROJECT);
        MobileActionManager.click(NAME_PROJECT);
    }

    public static void verifySave() {
        MobileActionManager.waitVisibility(VERIFY_TODAY);
        Assert.assertTrue(MobileActionManager.getText(VERIFY_TODAY).equalsIgnoreCase("Today"));
    }

    public static void ingresaHsEntrada(String horaEntrada) {
        int horaE = Integer.parseInt(horaEntrada);
        int entrada;

        for (int i = 0; i < 24; i++) {
            entrada = Integer.parseInt(MobileActionManager.getText(HS_INICIO));
            if (entrada !=horaE){
                MobileActionManager.click(HS_INICIO);
            }else {
                break;
            }
        }

    }

    public static void ingresaHsSalida(String horaSalida) {
        int horaS = Integer.parseInt(horaSalida);
        int salida;

        for (int i = 0; i < 24; i++) {
            salida = Integer.parseInt(MobileActionManager.getText(HS_SALIDA));
            if (salida !=horaS){
                MobileActionManager.click(HS_SALIDA);
            }else{
                break;
            }
        }
    }

    public static void clickEndTime() {
        MobileActionManager.click(TIME_END);
    }

    public static void IngresaFecha(String fecha) {
        MobileActionManager.click(FECHA, fecha);

    }

    public static void ingresarDescripcion(String descripcion) {
        MobileActionManager.setInput(ENTRY_DESCRIPTION_INPUT, descripcion);
    }

    public static void clickBack() {
        MobileActionManager.waitVisibility(DISCARD_FLECHA);
        MobileActionManager.click(DISCARD_FLECHA);
    }
    public static void verifyDiscard() {
           Assert.assertFalse(MobileActionManager.getText(TIME_ENTRY_DESCRIPTION).contains("prueba1"));

    }
}
