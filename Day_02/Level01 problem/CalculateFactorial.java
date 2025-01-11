/*
Write a Program to find the factorial of an integer entered by the user.
Hint => 
For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
Using a while loop, compute the factorial.
Print the factorial at the end.
*/

import java.util.Scanner;

public class CalculateFactorial {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        
        // Check if the user entered a negative num
        if (num < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // initialize the factorial variable
            long factorial = 1;
            int i = 1;
            
            // Compute factorial using while loop
            while (i <= num) {
                factorial *= i;
                i++;
            }
            
            // Print the result
            System.out.println("The factorial of " + num + " is " + factorial + ".");
        }
        
        // Close the scanner
        sc.close();
    }
}
