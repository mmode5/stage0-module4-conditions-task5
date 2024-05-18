package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        switch (isLeap ? 1 : 0) {
            case 1:
                System.out.println("leap");
                break;
            case 0:
                System.out.println("not leap");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
