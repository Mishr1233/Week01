import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take the input number 
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // create an array 
        int[] frequency = new int[10];

     
        while (number != 0) {
            int digit = number % 10; 
            frequency[digit]++;       
            number = number / 10;     // remove the last digit
        }

        // display the frequency of each digit
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " time");
            }
        }

      
        sc.close();
    }
}
