package dropdown;

import base.BaseTests;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

public class DropDownTests extends BaseTests {

    @Test
    public  void testSelectOption(){
        var dropDownPage = homePage.ClickDropDown();
        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        var selectedOptions = dropDownPage.getSelectedOptions();
       assertEquals(selectedOptions.size(), 1,"Incorrect number of selected options");
       assertTrue(selectedOptions.contains(option), "Option 1 is not selected");

    }

}
