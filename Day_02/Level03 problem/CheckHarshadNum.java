
import java.util.*;

class CheckHarshadNum {
    public static int digitSum(int number) {
        int sum = 0;
        // extracting and adding each digit to the sum.
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Creating the Scanner object.
        Scanner input = new Scanner(System.in);
        // Taking input of number on which checking will be performed.
        System.out.println("Enter Number : ");
        int number = input.nextInt();
        // calling digitsum method that will give the digit sum of the number.
        int digitSum = digitSum(number);

        // Checking the condition of Harshad number.
        if (number % digitSum == 0) {
            System.out.println("Harshad number");
        } else {
            System.out.println("Not a Harshad number");
        }

        // closing the object of scanner class.
        input.close();
    }
}