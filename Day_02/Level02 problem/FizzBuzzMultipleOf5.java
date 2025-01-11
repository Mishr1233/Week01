/*Rewrite the program 5 FizzBuzz using while loop */



import java.util.Scanner;

public class FizzBuzzMultipleOf5 {
    public static void main(String args[]) {
        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");

        // Read the number input by the user
        int number = sc.nextInt();

        // Check if the number entered is positive
        if (number > 0) {
            // Initialize a counter for the loop
            int i = 0;

            // Loop from 0 to the entered number using a while loop
            while (i <= number) {
                // Check if the current number is divisible by 5
                if (i % 5 == 0) {
                    System.out.print("FizzBuzz "); // Print "FizzBuzz" if divisible by 5
                } else {
                    System.out.print(i + " "); // Print the number itself if not divisible by 5
                }

                // Increment the counter
                i++;
            }
        } else {
            // In case the number entered is not positive
            System.out.println("Please enter a positive number.");
        }

        // Close the scanner
        sc.close();
    }
}
