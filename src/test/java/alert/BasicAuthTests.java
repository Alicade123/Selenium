package alert;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class BasicAuthTests extends BaseTests {
@Test
    public void testBasicAuthLogin(){
    String actualResult = homePage.clickBasicAuth().getPageStatus();
    assertEquals(actualResult, "Basic Auth", "You meesed up things Arcade!");
}
}
