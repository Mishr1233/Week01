/* 13.
Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
Hint => 
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using for loop
Compare the two results and print the result
*/

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a natural number : ");
        int n = scan.nextInt();

        // Check if the input is a natural number
        if (n <= 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
        } else {
            // Compute the sum using the formula
            int formulaSum = n * (n + 1) / 2;

            // Compute the sum using a for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // Compare the results
            System.out.println("Sum computed using formula: " + formulaSum);
            System.out.println("Sum computed using for loop: " + loopSum);

            // Verify if both results match
            if (formulaSum == loopSum) {
                System.out.println("The results match! Both computations are correct.");
            } else {
                System.out.println("The results do not match! There's an error in the computations.");
            }
        }
    }
}