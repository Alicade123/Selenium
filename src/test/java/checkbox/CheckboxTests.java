package checkbox;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CheckboxTests extends BaseTests {
    @Test
    public  void testCheckbox(){
        assertEquals(homePage.clickCheckboxes().checkboxMethod(), true,"something went wrong");
    }
    @Test
    public void check_Uncheck(){
        homePage.clickCheckboxes().playWithCheckbox();
    }
}
