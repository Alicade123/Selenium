package unit_testing;

import org.testng.annotations.Test;
import pages.UnitTestingCalculator;

import static org.testng.Assert.assertEquals;

public class UnitTests {
    private UnitTestingCalculator unitTestingCalculator;
    @Test
    public void testCalcular(){
        unitTestingCalculator = new UnitTestingCalculator();
        int actualResult =unitTestingCalculator.addition(10,12);
        System.out.println(actualResult); // 22
        assertEquals(actualResult, 22, "Something went Wrong");
    }
}
