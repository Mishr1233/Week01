import java.util.Scanner;

class OddEvenNums {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Get user input for the number
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Check if the number is a natural number
        if (n <= 0) {
            System.out.println("The entered number is not a natural number.");
        } else {
            // Print odd and even numbers from 1 to n
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        }

        // Close the Scanner
        input.close();
    }
}