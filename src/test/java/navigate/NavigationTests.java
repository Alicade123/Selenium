package navigate;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {

    @Test
    public void NavigationTests(){
        homePage.clickDynamicLoadingLink().clickDynamicLoadingExample1Page();
        getWebDriver().goBack();
        getWebDriver().goForward();
        getWebDriver().refresh();
        getWebDriver().goTo("https://google.com");

    }
    @Test
    public void newWindowTests(){
        homePage.clickMultipleWindowsLink().clickClickHereLink();
        getWebDriver().switchToTabs("New window");
    }
}
