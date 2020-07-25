package school.cesar.eta.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest {

    @Test
    public void check_leapYearDiv400_true(){
        int year = 2000;
        boolean result = LeapYear.check(year);
        Assertions.assertTrue(result);
    }

    @Test
    public void check_leapYearDiv4AndNotDiv100_true(){
        int year = 2020;
        boolean result = LeapYear.check(year);
        Assertions.assertTrue(result);
    }

    @Test
    public void check_nonLeapYear_false(){
        int year = 2014;
        boolean result = LeapYear.check(year);
        Assertions.assertFalse(result);
    }
}
