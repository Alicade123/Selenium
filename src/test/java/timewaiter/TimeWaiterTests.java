package timewaiter;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;
import pages.DynamicLoadingExample1Page;

import static org.testng.Assert.assertEquals;

public class TimeWaiterTests extends BaseTests{

    @Test
    public void testClickStartLoadingButton(){
        DynamicLoadingPage  dynamicLoadingPage = homePage.clickDynamicLoadingLink();
        DynamicLoadingExample1Page dynamicLoadingExample1Page = dynamicLoadingPage.clickDynamicLoadingExample1Page();
        String text = dynamicLoadingExample1Page.clickStartButton();
        assertEquals(text, "Hello World!", "Alicade messed up things");
    }


}
