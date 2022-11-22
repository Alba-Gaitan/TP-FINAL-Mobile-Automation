package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import org.testng.Assert;
import static com.crowdar.examples.constants.SettingConstants.*;


public class SettingService {

    public static void clickSettings() {
        MobileActionManager.click(SETTING);
    }

    public static void changeModeDark() {
        MobileActionManager.click(DARK_MODE);
    }

    public static void verifyThemeDark() {
        Assert.assertTrue(Boolean.parseBoolean(MobileActionManager.getAttribute(DARK_MODE, "checked")),"true");
    }
}
