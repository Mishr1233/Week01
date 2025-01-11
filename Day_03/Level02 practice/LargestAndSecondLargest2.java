/*Rework the program 2, especially the Hint f where if index equals maxDigit, we break from the loop. Here we want to modify to Increase the size of the array i,e maxDigit by 10 if the index is equal to maxDigit. This is done to consider all digits to find the largest and second-largest number 
Hint => 
In Hint f inside the loop if the index is equal to maxDigit, increase maxDigit and make digits array to store more elements. 
To do this, we need to create a new temp array of size maxDigit, copy from the current digits array the digits into the temp array, and assign the current digits array to the temp array
Now the digits array will be able to store all digits of the number in the array and then find the largest and second largest number
*/





import java.util.Scanner;

public class LargestAndSecondLargest2 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        //user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //the initial maximum number of digits the array can hold
        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;

       
        while (number != 0) {
            digits[index] = number % 10; 
            number = number / 10;         // Remove the last digit
            index++;

            // check if index equals maxDigits 
            if (index == maxDigits) {
                maxDigits += 10; // Increase maxDigits by 10
                int[] temp = new int[maxDigits]; // Create a new array 

                // copy elements from digits array to the new temp array
                for(int a=0;a<digits.length;a++){
						temp[a]=digits[a];
					}

                // Assign the new temp array to digits
                digits = temp;
            }
        }

        //store the largest and second largest digits
        int largest = 0;
        int secondLargest = 0;

        // Loop through the array to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] < largest) {
                secondLargest = digits[i];
            }
        }

        // output the largest and second largest digits
        if (secondLargest == 0) {
            System.out.println("There is no second largest number.");
        } else {
            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);
        }

      
        sc.close();
    }
}
