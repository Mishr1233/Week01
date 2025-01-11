/*Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. 
Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display 
if they equal, greater or less
Hint => 
Define an integer array of 5 elements and get user input to store in the array.
Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
If the number is negative, print negative. Else if the number is zero, print zero. 
Finally compare the first and last element of the array and display if they equal, greater or less
*/



import java.util.*;

public class NumberCheck {
    
    public static void main(String args[]) {
        
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Create an array to store 5 numbers
        int number[] = new int[5];
        
        // Loop to input 5 numbers from the user
        for (int i = 0; i < number.length; i++) {
            // Prompt the user to enter a number
            System.out.println("Enter number :");
            // Read the number entered by the user and store it in the array
            number[i] = sc.nextInt();
        }
        
        // Loop through the array to check each number and print details
        for (int i = 0; i < number.length; i++) {
            // Store the current number for easy reference
            int tempNum = number[i];
            
            // Check if the number is negative, zero, or positive
            if (tempNum < 0) {
                System.out.println("The number is negative.");
            } else if (tempNum == 0) {
                System.out.println("The number is zero.");
            } else {
                // If the number is positive, check if it is even or odd
                if (tempNum % 2 == 0) {
                    System.out.println("The number is positive and even.");
                } else {
                    System.out.println("The number is positive and odd.");
                }
            }
        }
        
        // Compare the first and last numbers in the array and print the result
        if (number[0] == number[number.length - 1]) {
            System.out.println("The first and last numbers are equal.");
        } else if (number[0] > number[number.length - 1]) {
            System.out.println("The first number is greater than the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }
        
        // Close the scanner object 
        sc.close();
    }
}
