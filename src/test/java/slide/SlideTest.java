package slide;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HorizontalSlider;

public class SlideTest  extends BaseTests {
    @Test
    public void testSlideBar(){
        HorizontalSlider horizontalSlider = homePage.clickHorizontalSlider();
        horizontalSlider.SlideRight( 15);

    }
}
