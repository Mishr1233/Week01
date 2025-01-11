/*Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 

Hint => 
Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks
*/

import java.util.*;

public class StudentGrade {

    public static void main(String args[]) {

        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting user to enter marks for Physics
        System.out.println("Enter physics number :");
        int physics = sc.nextInt(); // Reading the marks for Physics

        // Prompting user to enter marks for Chemistry
        System.out.println("Enter chemistry number :");
        int chemistry = sc.nextInt(); // Reading the marks for Chemistry

        // Prompting user to enter marks for Maths
        System.out.println("Enter maths number :");
        int maths = sc.nextInt(); // Reading the marks for Maths

        // Calculating the percentage by averaging the marks of all three subjects
        double percentage = (double) (maths + physics + chemistry) / 3.0;

        // Calculating the average marks (casting the percentage to an integer, which
        // truncates decimals)
        double averageMarks = (int) percentage;

        // Printing the average marks (note that averageMarks will be an integer value)
        System.out.println("Average Mark " + averageMarks);

        // Using if-else statements to determine the grade and level based on percentage
        if (percentage >= 80) {
            System.out.println("Level 4, above agency-normalized standards"); // Excellent performance
        } else if (percentage >= 70 && percentage <= 79) {
            System.out.println("Level 3, at agency-normalized standards"); // Very good performance
        } else if (percentage >= 60 && percentage <= 69) {
            System.out.println("Level 2, below, but approaching agency-normalized standards"); // Good performance
        } else if (percentage >= 50 && percentage <= 59) {
            System.out.println("Level 1, well below agency-normalized standards"); // Satisfactory performance
        } else if (percentage >= 40 && percentage <= 49) {
            System.out.println("Level 1, too below agency-normalized standards"); // Below average performance
        } else {
            System.out.println("Remedial standards"); // Needs improvement
        }

        // Close the scanner
        sc.close();
    }
}
