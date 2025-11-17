package frame;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestIframe  extends BaseTests{
    @Test
    public void testIframe(){
        var iFramePage = homePage.clickWYSIWYGEditorLink();

        String txt1 = "Hello ";
        String txt2 = "World";
        iFramePage.ClearEditorArea();
        iFramePage.setTextInTextArea(txt1);
        iFramePage.clickIndentation();
        iFramePage.setTextInTextArea(txt2);
    //assertEquals(iFramePage.getTextInTextArea(), txt1+txt2, "something went wrong");
    assertEquals(iFramePage.getTextInTextArea(), "Your content goes here.");
    }
}
