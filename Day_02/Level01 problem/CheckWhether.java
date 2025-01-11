/*6.
Write a program to check whether a number is positive, negative, or zero.
Hint => 
Get integer input from the user and store it in the number variable.
If the number is positive, print positive.
If the number is negative, print negative.
If the number is zero, print zero. 
*/

import java.util.Scanner;

class CheckWhether{
	public static void main(String [] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
        int number = scan.nextInt();  // Reading the integer input from the user

        // Checking whether the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
	}
}