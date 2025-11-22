package navigate;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class Chapter11_OIE_Navigations extends BaseTests {
 @Test
    public void testNavigations(){
     var dynamicPage2 = homePage.clickDynamicLoadingLink2();
     dynamicPage2.switchWindow("The Internet");
     var newWindow = dynamicPage2.clickDynamicLoadingExample2Page();
    boolean actualResult= newWindow.isButtonExist();
     assertEquals(actualResult, true, "Arcade you messed up something");

 }
}
