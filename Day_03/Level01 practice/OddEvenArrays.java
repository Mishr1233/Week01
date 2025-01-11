import java.util.*;

public class OddEvenArrays {

    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        //hint user to enter a number
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        // Check if the entered number is a natural number
        if (number <= 0) {
            System.out.println("Error Please enter a valid natural number greater than 0");
          
            return; // Exit the program if input is invalid
        }

        // Calculate the size of the arrays 
        int evenArraySize = number / 2 + 1;
        int oddArraySize = number / 2 + 1; 

        // Create arrays for odd and even numbers
        int[] evenNumbers = new int[evenArraySize];
        int[] oddNumbers = new int[oddArraySize];

        // Initialize index variables for even and odd numbers
        int evenIndex = 0;
        int oddIndex = 0;

        // Iterate through numbers from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                // If the number is even store it in the evenNumbers array
                evenNumbers[evenIndex++] = i;
            } else {
                // If the number is odd store it in the oddNumbers array
                oddNumbers[oddIndex++] = i;
            }
        }

        // Print the even numbers array
        System.out.println("Even numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println(); 

        // Print the odd numbers array
        System.out.println("Odd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        // Close the scanner after use
        sc.close();
    }
}
