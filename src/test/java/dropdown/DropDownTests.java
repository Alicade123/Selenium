package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTests extends BaseTests {

    @Test
    public  void testSelectOption(){
        var dropDownPage = homePage.ClickDropDown();
        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        var selectedOption = dropDownPage.getSelectedOptions();
        Assert.assertEquals(selectedOption.size(), 1);
        Assert.assertTrue(selectedOption.contains(option), "Option 1 is not selected");

    }

}
