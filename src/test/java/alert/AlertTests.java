package alert;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.JavaScriptAlertsPage;

public class AlertTests extends BaseTests {
    @Test
    public void testAcceptAlert(){

        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertsPage.triggerAlert();
        javaScriptAlertsPage.getAlert();

    }
}
