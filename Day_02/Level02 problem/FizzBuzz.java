/*Write a program FizzBuzz, take a number as user input, and if it is a positive integer loop from 0 to the number and print the number, but for multiples of 3 print "Fizz" instead of the number, for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz".
Hint => 
Write the program and use for loop
*/

import java.util.*;

public class FizzBuzz {

    public static void main(String args[]) {

        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number :");

        // Read the number input by the user
        int number = sc.nextInt();

        // Check if the number entered is positive
        if (number > 0) {

            // Loop from 0 to the entered number
            for (int i = 0; i <= number; i++) {

                // Check if the number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print(" FizzBuzz "); // Print "FizzBuzz" if divisible by both 3 and 5

                    // Check if the number is divisible by 3
                } else if (i % 3 == 0) {
                    System.out.print(" Fizz "); // Print "Fizz" if divisible by 3

                    // Check if the number is divisible by 5
                } else if (i % 5 == 0) {
                    System.out.print(" Buzz "); // Print "Buzz" if divisible by 5

                    // If the number is not divisible by 3 or 5, print the number itself
                } else {
                    System.out.print(i + " ");
                }

            }

        } else {
            // In case the number entered is not positive
            System.out.println("Please enter a positive number.");
        }

        // Close the scanner
        sc.close();

    }

}
