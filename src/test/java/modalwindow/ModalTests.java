package modalwindow;
import base.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ModalTests extends BaseTests {
    @Test
    public void ModalTest(){
        var entryAdPage = homePage.clickEntryAdPage();
       String pageTitle =  entryAdPage.ClickCloseModal();
       System.out.println(pageTitle);
       assertEquals(pageTitle, "The Internet", "Something went wrong!");
    }
}
