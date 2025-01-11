
import java.util.*;

class CheckAbundantNum {
    public static int divisorSum(int number) {
        // taking sum as 0.
        int sum = 0;
        // Extracting each digit and adding it to sum.
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // Creating the Scanner object with Scanner class.
        Scanner input = new Scanner(System.in);
        // Taking the input of number on which checking will be performed.
        System.out.println("Enter Number : ");
        int number = input.nextInt();
        // Calling the function which will give the sum of the each digit of the number.
        int divisorSum = divisorSum(number);

        // Checking wheather it is abundant or not.
        if (divisorSum > number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not a Abundant Number");
        }
        // closing the object.
        input.close();
    }
}