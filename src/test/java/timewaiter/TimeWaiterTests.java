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
    @Test
    public void testClickStartLoadingButton2(){
        var dynamicLoadingPage = homePage.clickDynamicLoadingLink();
        var dynamicLoadingPage2 = dynamicLoadingPage.clickDynamicLoadingExample2Page();
        String actualResult = dynamicLoadingPage2.clickStartButton();
        assertEquals(actualResult, "Hello World!", "You don't play with programming even if is fun");

    }


}
