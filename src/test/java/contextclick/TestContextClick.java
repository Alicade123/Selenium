package contextclick;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestContextClick extends BaseTests {
    @Test
    public void contextClickTests(){
        var contextMenuPage =  homePage.clickContextMenuLink();
        contextMenuPage.RightClickInBox();
        String txt = contextMenuPage.getAlertText();
        contextMenuPage.getAlertAccept();
        assertEquals(txt, "You selected a context menu", "Something went wrong");
    }
    /*

   */
}
