import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt(); // Get input from the user

        int originalNumber = number; // Store the original number
        int sum = 0; 

        // Use a while loop to calculate the sum of the cubes of digits
        while (originalNumber != 0) {
            // Find the last digit of the number
            int remainder = originalNumber % 10;

            // Find the cube of the digit and add it to the sum
            sum += Math.pow(remainder, 3);

            // Remove the last digit from the number
            originalNumber = originalNumber / 10;
        }

        // Check if the sum is equal to the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is not an Armstrong Number.");
        }
    }
}