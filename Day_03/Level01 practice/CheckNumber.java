/*Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. 
Show all the numbers as well as the sum of all numbers 
Hint => 
Create a variable to store an array of 10 elements of type double as well as a variable to store the total of type double initializes
 to 0.0. Also, the index variable is initialized to 0 for the array
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop 
Also, break from the loop if the index has a value of 10 as the array size is limited to 10.
If the user entered a number other than 0 or a negative number inside the while loop then assign the number to the array
 element and increment the index value
Take another for loop to get the values of each element and add it to the total 
Finally display the total value
*/



import java.util.*;

public class CheckNumber {

    public static void main(String args[]) {

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Create an array to store up to 10 numbers
        int number[] = new int[10];
        
        // Initialize the index variable and sum variable
        int i = 0, sum = 0;
        
        // Infinite loop to repeatedly ask for input
        while(true){
            // Prompt the user to enter a number
            System.out.println("Enter number :");
            
            // Read the number entered by the user
            int value = sc.nextInt();
            
            // Check if the entered number is positive and there is space in the array
            if(value > 0 && i < 10){
                // Store the number in the array and update the index
                number[i++] = value;
                
                // Add the value to the sum
                sum += value;
            } else {
                // Break the loop if the number is non-positive or the array is full
                break;
            }
        }
        
        // Print the total sum of the entered numbers
        System.out.println("The total value is " + sum);
        
        // Close the scanner object to avoid resource leak
        sc.close();
    }
}
