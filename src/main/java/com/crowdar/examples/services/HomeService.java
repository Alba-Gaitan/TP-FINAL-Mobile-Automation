package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import org.testng.Assert;

import static com.crowdar.examples.constants.HomeConstants.BTN_MAS;
import static com.crowdar.examples.constants.HomeConstants.VIEW_DISPLAYED;


public class HomeService {

    public static void verifyPage() {
        MobileActionManager.waitVisibility(VIEW_DISPLAYED);
        Assert.assertTrue(MobileActionManager.isVisible(VIEW_DISPLAYED), VIEW_DISPLAYED);
    }
    public static void clickSignoMas() {
        MobileActionManager.click(BTN_MAS);
    }
}
