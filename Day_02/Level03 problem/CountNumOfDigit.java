
import java.util.*;

class CountNumOfDigit {
    public static int countOfDigit(int number) {
        int count = 0;
        // Extracting and counting each digit count.
        while (number > 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // Creating the Scanner object to take input.
        Scanner input = new Scanner(System.in);
        // Taking input number on which the operation will be performed.
        System.out.println("Enter the Number : ");
        int number = input.nextInt();
        // Calling this method to get the sum of each digit of the given number.
        int countOfDigit = countOfDigit(number);
        // printing the digit count to the console.
        System.out.println("Digit count for the givent input is : " + countOfDigit);
        // closeing the scanner object.
        input.close();
    }
}