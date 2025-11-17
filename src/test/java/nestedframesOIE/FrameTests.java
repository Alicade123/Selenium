package nestedframesOIE;
import base.BaseTests;
import org.testng.annotations.Test;
import pages.NestedFramesPage;

import static org.testng.Assert.assertEquals;


public class FrameTests extends BaseTests{
    @Test
    public void frameTest(){
        var framePages = homePage.clickFramesLink();
        NestedFramesPage nestedFramesPage = framePages.clickFrames();
        assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT", "Left frame text incorrect");
        assertEquals(nestedFramesPage.getBottomFrameText(), "BOTTOM", "Bottom frame text incorrect");


    }
}
