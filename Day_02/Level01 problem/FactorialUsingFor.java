/*
Rewrite program 14 using for loop
Hint => 
Take the integer input, check for natural number and determine the factorial using for loop and finally print the result. 
*/

import java.util.Scanner;

class FactorialUsingFor{
	public static void main(String [] args){
		// Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scan.nextInt();

            //variables for factorial computation
            int factorial = 1; // Factorial starts with 1 as a neutral multiplier
            int i = 1;         // Iterator starting at 1

            // Calculate factorial using a while loop
            for (i = 1; i <= number; i++) {
                factorial *= i; // Multiply factorial by the current value of i
            }

            // Print the computed factorial
            System.out.println("The factorial of " + number + " is: " + factorial);
	}
}