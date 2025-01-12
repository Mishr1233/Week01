/*Create a program to display a calendar for a given month and year. The program should take the month and year as sc from the user and display the calendar for that month. E.g. for 07 2005 user sc, the program should display the calendar as shown below

Hint => 
Write a Method to get the name of the month. For this define a month Array to store the names of the months
Write a Method to get the number of days in the month. For this define a days Array to store the number of days in each month. For Feb month, check for Leap Year to get the number of days. Also, define a Leap Year Method. 
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


class CalendarCalculate {
     
	 //getMonthName creating function
    public static String getMonthName(int month) {
        String[] months = { "January", "February", "March", "April", "May", "June", 
                            "July", "August", "September", "October", "November", "December" };
        return months[month - 1];
    }


//getNumberOfDays creating function
    public static int getNumberOfDays(int month, int year) {
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }
 // isLeapYear creating function
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }


//getFirstDayOfMonth creating function

    public static int getFirstDayOfMonth(int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + 31 * m / 12) % 7;
    }


//displayCalendar creating function
    public static void displayCalendar(int month, int year) {
        int firstDay = getFirstDayOfMonth(month, year);
        int numDays = getNumberOfDays(month, year);

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int day = 1;

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        while (day <= numDays) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
            day++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		  
		  System.out.println("Enter month :");
        int month = sc.nextInt();
		System.out.println("Enter year :");
        int year = sc.nextInt();
        
        System.out.println(getMonthName(month) + " " + year);
        displayCalendar(month, year);
		
		
    sc.close();
	}
}
