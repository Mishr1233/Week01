/*Write a Program to check if the given number is a prime number or not
Hint => 
A number that can be divided exactly only by itself and 1 are Prime Numbers,
Prime Numbers checks are done for numbers greater than 1
Loop through all the numbers from 2 to the user input number and check if the reminder is zero. If the reminder is zero break out from the loop as the number is divisible by some other number and is not a prime number. 
Use isPrime boolean variable to store the result
*/


import java.util.*;  

public class PrimeNumber {
    
    
    public static void main(String args[]) {
        
        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter a number
        System.out.println("Enter a Number :");
        
        // Reading the input number from the user
        int number = sc.nextInt();
        
        // A boolean variable to track if the number is prime
        boolean isPrime = true;
        
        // Checking if the number is 2 (since 2 is a prime number)
        if (number == 2) {
            System.out.println("Number 2 is prime number");
        } else {
            // Checking divisibility of the number from 2 to number/2
            // This loop will check if the number is divisible by any number between 2 and number/2
            for (int i = 2; i <= number / 2; i++) {
                
                // If the number is divisible by i, it is not a prime number
                if (number % i == 0) {
                    isPrime = false;  // Set the isPrime flag to false
                    break;  // Exit the loop as we don't need to check further
                }
            }
            
            // If isPrime is still true, the number is prime
            if (isPrime == true) {
                System.out.println("Number " + number + " is prime number");
            } else {
                System.out.println("Number " + number + " is not prime number");
            }
        }
    }
}
