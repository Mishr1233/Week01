/*Create a program to swap two numbers 
Hint => 
Create a variable number1 and take user input.
Create a variable number2 and take user input.
Swap number1 and number2  and print the swapped output
I/P => number1, number2
O/P => The swapped numbers are  ___ and ___
*/


import java.util.*;  


public class SwapTwoNumber {
    
    // Main method where the execution of the program starts
    public static void main(String args[]) {
        
        // Creating a Scanner object 'sc' to read user input
        Scanner sc = new Scanner(System.in);

        // Prompting the user to input the first number
        System.out.println("Enter number1 :");
        
        // Reading the first number from the user
        int number1 = sc.nextInt();
        
        // Prompting the user to input the second number
        System.out.println("Enter number2 :");
        
        // Reading the second number from the user
        int number2 = sc.nextInt();
        
        // Swapping the values of number1 and number2 using a temporary variable 'temp'
        int temp = number1; // Storing the value of number1 in temp
        number1 = number2;  // Assigning the value of number2 to number1
        number2 = temp;     // Assigning the value of temp (original number1) to number2
        
        // Displaying the swapped numbers
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
    }
}
