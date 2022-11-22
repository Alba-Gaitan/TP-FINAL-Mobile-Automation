package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;

import static com.crowdar.examples.constants.LoginConstants.*;


public class LoginService {

    public static void doLogin(String email, String password){
        MobileActionManager.setInput(EMAIL_INPUT, email);
        MobileActionManager.setInput(PASSWORD, password);
        MobileActionManager.click(LoginConstants.SIGN_IN_BUTTON);
    }

    public static void isViewLoaded(){
        MobileActionManager.waitVisibility(LoginConstants.SIGN_IN_BUTTON);
        Assert.assertTrue(MobileActionManager.isVisible(EMAIL_INPUT));
    }

    public static void clickBtnMenu() {
        MobileActionManager.click(BTN_MENU);
    }

    public static void clickCerrarSesion() {
        MobileActionManager.click(LOGOUT);
    }

    public static void verificarLogout() {
        MobileActionManager.waitVisibility(TITLE_LOGIN);
        Assert.assertTrue(MobileActionManager.getText(TITLE_LOGIN).contains("Log in"));
    }

    public static void confirmaLogout() {
        MobileActionManager.waitVisibility(LOGOUT_CONFIRM);
        MobileActionManager.click(LOGOUT_CONFIRM);
    }
}
