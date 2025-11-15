package keypress;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.testng.Assert.assertEquals;

public class KeyTests extends BaseTests{
    @Test
    public void testBackspace(){
        KeyPressesPage keyPressesPage =homePage.clickKeyPresses();
        keyPressesPage.enterText("A"+ Keys.BACK_SPACE);
        String actualResults = keyPressesPage.getResult();
        assertEquals(actualResults, "You entered: BACK_SPACE","Something went wrong");
    }
    @Test
    public void TestPi(){
        KeyPressesPage keyPressesPage =homePage.clickKeyPresses();
        keyPressesPage.enterPi();

    }

}
