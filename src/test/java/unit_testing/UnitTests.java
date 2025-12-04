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
        int actualResultOverloading = unitTestingCalculator.addition(100,500,300);
        System.out.println(actualResult +" "+ actualResultOverloading); // 22
        assertEquals(actualResult, 22, "Something went Wrong");
        assertEquals(actualResultOverloading,900,"Something went wrong");
    }
}
