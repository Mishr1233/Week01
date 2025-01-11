
import java.util.*;

class CalculateDayOfWeek {
    public static int calculateDayOfWeek(int m, int d, int y) {
        // formula for Gregorian calendar.
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        return d0;
    }

    public static void main(String[] args) {
        // Creating the object of Scanner class for input.
        Scanner input = new Scanner(System.in);
        // Taking input of the month
        System.out.println("Enter the Month : ");
        int month = input.nextInt();
        // Taking the input of Days.
        System.out.println("Enter the Day : ");
        int day = input.nextInt();
        // Taking the input of year.
        System.out.println("Enter the Year : ");
        int year = input.nextInt();
        // Calling the function which will give the Day code from (0 - 6) of the Day at
        // that date.
        int dayOfWeek = calculateDayOfWeek(month, day, year);
        // using switch case to print Day name according to the output from the above
        // formula.
        switch (dayOfWeek) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("something went wrong");
                break;
        }
        // closing the Scanner object.
        input.close();
    }
}