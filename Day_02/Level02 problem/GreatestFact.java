
import java.util.Scanner;

class GreatestFact {
    public static void main(String[] args) {
        // Creating a Scanner object to take input from the user
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        int greatestFactor = 1;

        // Looping from number - 1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            // Check if i is a factor of the number
            if (number % i == 0) {
                greatestFactor = i; 
                break; // loop break
            }
        }
        System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
    }
}