/*Write a program to take 2 numbers and print their quotient and reminder
Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
I/P => number1, number2
O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___
*/


import java.util.*; 

public class DivisionFunction {
    public static void main(String args[]) {
        
        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter the first number
        System.out.println("Enter number1 :");
        
        // Reading the first number from the user and storing it in 'number1'
        int number1 = sc.nextInt();
        
        // Prompting the user to enter the second number
        System.out.println("Enter number2 :");
        
        // Reading the second number from the user and storing it in 'number2'
        int number2 = sc.nextInt();
        
        // Performing division to get the quotient
        int quotient = number1 / number2;
        
        // Finding the remainder using the modulus operator
        int reminder = number1 % number2;
        
        // Displaying the result: the quotient and remainder
        System.out.println("The Quotient is " + quotient + " and Reminder is " + reminder + " of two number " + number1 + " and " + number2);
        
    } 
}
