/*Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
Define an array of 10 integer elements and take user input for the student's age. 
Loop through the array using the length property and for the element of the array check If the age is a negative number print an invalid age
 and if 18 or above, print The student with the age ___ can vote. Otherwise, print The student with the age ___ cannot vote. 
*/

import java.util.*;

public class StudentAgeCheck {

    public static void main(String args[]) {

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Create an array to store the ages of 10 students
        int student[] = new int[10];

        // Loop to input the ages of 10 students
        for (int i = 0; i < student.length; i++) {
            // Prompt the user to enter their age
            System.out.println("Enter your age :");
            // Read the age entered by the user and store it in the array
            student[i] = sc.nextInt();
        }

        // Loop through the array to check if students can vote based on their age
        for (int i = 0; i < student.length; i++) {
            // Store the age of the student for easy reference
            int age = student[i];

            // Check if the age is invalid (i.e., less than or equal to 0)
            if (age <= 0) {
                System.out.println("An invalid age!");
            } else if (age >= 18) {
                // If the age is 18 or above, the student can vote
                System.out.println("The student with the age " + age + " can vote");
            } else {
                // If the age is below 18, the student cannot vote
                System.out.println("The student with the age " + age + " cannot vote");
            }
        }

        // Close the scanner object 
        sc.close();
    }
}
