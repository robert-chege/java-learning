import java.util.Scanner;

public class Condition6 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input month number: ");
        int month = input.nextInt();
        System.out.print("Input year: ");
        int year = input.nextInt();

        System.out.println(getMonthName(month, year));

    }

    public static String getMonthName(int month, int year) {
        String getMonthName = "";
        int getDays;
        switch (month) {
            case 1:
                getMonthName = "January";
                getDays = 31;
                break;
            case 2:
                getMonthName = "February";
                if (year % 4 == 0) {
                    getDays = 29;
                } else {
                    getDays = 28;
                }
            case 3:
                getMonthName = "March";
                getDays = 31;
                break;
            default:
                getMonthName = "invalid entry";
        }
        return getMonthName;
    }
}
