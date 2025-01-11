import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        //user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

     
        int tempNumber = number;
        int count = 0;

        // loop to count the number of digits in the input number
        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
            count++;
        }

        // check if the number is 0
        if (count == 0) {
            System.out.println("Reversed number: 0");
          
            return;
        }

        // create an array 
        int[] digits = new int[count];
        tempNumber = number;

        // store the digits of the number in the array
        for (int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10;  
            tempNumber = tempNumber / 10; // remove the last digit
        }

        // display the digits in reverse order 
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }

        
        sc.close();
    }
}
