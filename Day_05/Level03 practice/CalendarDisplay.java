/*Create a program to display a calendar for a given month and year. The program should take the month and year as input from the user and display the calendar for that month. E.g. for 07 2005 user input, the program should display the calendar as shown below

Hint => 
Write a Method to get the name of the month. For this define a month Array to store the names of the months
Write a Method to get the number of days in the month. For this define a days Array to store the number of days in each month. For Feb month, checkingfor Leap Year to get the number of days. Also, define a Leap Year Method. 
Write a method to get the first day of the month using the Gregorian calendar algorithm
y0 = y − (14 − m) / 12
x = y0 + y0/4 − y0/100 + y0/400
m0 = m + 12 × ((14 − m) / 12) − 2
d0 = (d + x + 31m0 / 12) mod 7
Displaying the Calendar requires 2 for loops. 
The first for loop up to the first day to get the proper indentation. As in the example above 3 spaces from Sun to Thu as to be set as July 1st starts on Fri
The Second for loop Displays the days of the month starting from 1 to the number of days. Add proper indentation for single-digit days using %3d to display the integer right-justified in a field of width 3. Please note to move to the next line after Sat
*/





import java.util.Scanner;

public class CalendarDisplay {

    // Method to geting the name of the month
    public static String getMonthName(int month) {
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        return monthNames[month - 1];
    }

    // Method to checkingif the year is a leap year
    public static boolean isLeapYear(int year) {
       
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    // Method to get the number of days in a month
    public static int getNumberOfDays(int month, int year) {
        // Number of days in each month
        int[] daysInMonth = { 31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        return daysInMonth[month - 1];
    }

    // Method to calculating the first day of the month using the Gregorian calendar formula
    public static int getFirstDayOfMonth(int month, int year) {
        // Gregorian calendar algorithm
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7; // First day is always the 1st of the month (d = 1)

        return d0; 
    }

    // Method to displaying the calendar
    public static void displayCalendar(int month, int year) {
      
        int numberOfDays = getNumberOfDays(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        // Get the name of the month
        String monthName = getMonthName(month);

        // Print the calendar header
        System.out.println("\n" + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Indentation for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); // 4 spaces
        }

        // Print the days of the month
        int day = 1;
        for (int i = firstDay; day <= numberOfDays; i++) {
            // Print day number with proper spacing (using %3d to right-align)
            System.out.printf("%3d ", day);

            // Move to the next line after Saturday (i.e., after 6th day)
            if ((i + 1) % 7 == 0) {
                System.out.println();
            }

            day++;
        }

        // Print a newline if the last line didn't end with a newline
        if ((firstDay + numberOfDays - 1) % 7 != 6) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for month and year
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        // Display the calendar for the given month and year
        displayCalendar(month, year);

        sc.close();
    }
}
