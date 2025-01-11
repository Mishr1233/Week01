/*Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors
Hint => 
Take the input for a number
Find the factors of the number and save them in an array. For this create integer variable maxFactor and initialize to 10, factors array of size maxFactor and index variable to reflect the index of the array. 
To find factors loop through the numbers from 1 to the number, find the factors, and add them to the array element by incrementing the index. If the index is equal to maxIndex, then need factors array to store more elements
To store more elements, reset the maxIndex to twice its size, use the temp array to store the elements from the factors array, and eventually assign the factors array to the temp array
Finally, Display the factors of the number
*/


import java.util.*;

public class FactorFind {

    public static void main(String[] args) {

        // Create a scanner to take user input
        Scanner sc = new Scanner(System.in);

        // hint user to input a number
        System.out.println("Enter a number to find its factors:");
        int number = sc.nextInt();

        // create an initial array to store factors with an initial size of 10
        int maxFactor = 10;
        int[] factors = new int[maxFactor]; 
        int index = 0; // variable to track where to store factors in the array

        // loop through numbers from 1 to the number to find its factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // check if i is a factor of the number
                // Store the factor in the factors array
                factors[index++] = i;

                // If the index reaches the max size of the factors array resize it
                if (index == maxFactor) {
                    maxFactor *= 2; 
                    int[] temp = new int[maxFactor]; // Create a new temporary array with double size

                    // copy existing factors into the new temporary array
                    for(int a=0;a<factors.length;a++){
						temp[a]=factors[a];
					}

                    // assign the new larger array back to factors
                    factors = temp;
                }
            }
        }

        // Print the factors
        System.out.println("The factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        // close the scanner 
        sc.close();
    }
}
