/*Create a program to print a multiplication table of a number.
Hint => 
Get an integer input and store it in the number variable. Also, define a integer array to store the results of multiplication from 1 to 10
Run a loop from 1 to 10 and store the results in the multiplication table array
Finally, display the result from the array in the format number * i = ___
*/


import java.util.*;

public class MultiplicationTable {

    public static void main(String args[]) {
        
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Create an array to store the multiplication results
        int number[] = new int[10];
        
        // Prompt the user to enter a value for multiplication
        System.out.println("Enter a value :");
        
        // Read the value entered by the user
        int value = sc.nextInt();
        
        // Loop from 1 to 10 to calculate and display the multiplication table
        for (int i = 1; i <= 10; i++) {
            
            // Store the result of value multiplied by i in the array
            number[i - 1] = value * i;
            
            // Print the multiplication result
            System.out.println(value + " * " + i + " = " + number[i - 1]);
        }
        
        // Close the scanner object 
        sc.close();
    }
}


