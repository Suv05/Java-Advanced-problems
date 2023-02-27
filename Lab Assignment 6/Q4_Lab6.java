public class Q4_Lab6 {
    //Write a java program that displays the number of days in year from 2000 to 2020.
    public static void main(String[] args) {
        for (int year = 2000; year <= 2020; year++) {
            int days = getDaysInYear(year);
            System.out.println(year + " has " + days + " days");
        }
    }

    public static int getDaysInYear(int year) {
        if (isLeapYear(year)) {
            return 366;
        } else {
            return 365;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}


