package alert;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.JavaScriptAlertsPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AlertTests extends BaseTests {
    @Test
    public void testAcceptAlert(){

        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertsPage.triggerAlert();
        javaScriptAlertsPage.getAlert();
        String actualResults = javaScriptAlertsPage.getStatusResult();
        assertEquals(actualResults,"You successfully clicked an alert" ,"Something went wrong");
    }
    @Test
    public void testDismissAlert(){
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlerts();
         javaScriptAlertsPage.triggerAlertButtonDismiss();
         String text = javaScriptAlertsPage.getAlertTestDismuss();
         javaScriptAlertsPage.getAlertDismiss();
         assertEquals(text,"I am a JS Confirm", "Something went wrong");
    }
    @Test
    public void testPromptAlert(){
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertsPage.clickTriggerAlertButtonPrompt();
        String txt = "Alicade made this test";
        javaScriptAlertsPage.setValue(txt);
        javaScriptAlertsPage.getAlertPrompt();
        String actualResults = javaScriptAlertsPage.getStatusResult();
        assertEquals(actualResults,"You entered: "+txt ,"Something went wrong");
    }
}
