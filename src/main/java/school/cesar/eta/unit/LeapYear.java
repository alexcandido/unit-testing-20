package school.cesar.eta.unit;

public class LeapYear {

    public static Boolean check(int year) {
        boolean isLeapYear = false;

        if (year % 400 == 0) {
            isLeapYear = true;
        }

        if ((year % 4 == 0) && (year % 100 != 0)) {
            isLeapYear = true;
        }

        return isLeapYear;
    }
}
