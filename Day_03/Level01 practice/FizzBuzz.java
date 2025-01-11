/*Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...
Hint => 
Create a String Array to save the results and 
Finally, loop again to show the results of the array based on the index position
*/



import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // create a scanner to take user input
        Scanner sc = new Scanner(System.in);

        // take input for the number 
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // check if the input is a positive integer
        if (number <= 0) {
            System.out.println(" Enter a positive integer greater than 0");
            return;  // exit the program 
        }

        // Create a String array to store the results 
        String[] results = new String[number + 1];

        
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";  
            } else if (i % 3 == 0) {
                results[i] = "Fizz";  
            } else if (i % 5 == 0) {
                results[i] = "Buzz";  
            } else {
                results[i] = Integer.toString(i);  
            }
        }

        // print the results from the array
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + (i + 1) + " = " + results[i]);
        }

        // close the scanner
        sc.close();
    }
}
