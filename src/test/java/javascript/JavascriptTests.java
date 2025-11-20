package javascript;
import base.BaseTests;
import org.testng.annotations.Test;
import pages.LargeDeepDOMPage;

public class JavascriptTests extends BaseTests {
    @Test
    public void javascriptScrollDownTest(){
        LargeDeepDOMPage largeDeepDOMPage = homePage.clickLargeDeepDOMLink();
        largeDeepDOMPage.scrollToTable();
    }


}
