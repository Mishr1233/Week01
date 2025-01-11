/*Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
Hint => 
Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult
Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
Finally, display the result from the array in the format number * i = ___
*/




import java.util.*;

public class MultiplicationTableForSixToNine {

    public static void main(String args[]) {
        
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number between 6 and 9
        System.out.println("Enter a number between 6 and 9 to get its multiplication table:");
        int number = sc.nextInt(); // Read the user's input
        
        // Check if the input is valid (between 6 and 9)
        if (number < 6 || number > 9) {
            System.out.println("Please enter a valid number between 6 and 9.");
        } else {
            // create an array to store the multiplication results
            int[] multiplicationResult = new int[10]; // Store results for 1 to 10

            // Loop to generate the multiplication table for the number
            for (int i = 1; i <= 10; i++) {
                multiplicationResult[i - 1] = number * i; // Store the result in the array
            }

            // Display the multiplication table
            System.out.println("Multiplication table for " + number + ":");
            for (int i = 0; i < multiplicationResult.length; i++) {
                System.out.println(number + " * " + (i + 1) + " = " + multiplicationResult[i]);
            }
        }
        
        // Close the scanner 
        sc.close();
    }
}
