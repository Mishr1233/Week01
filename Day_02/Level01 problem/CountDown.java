/*
Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
Hint => 
Create a variable counter to take user inputted value for the countdown.
Use the while loop to check if the counter is 1
Inside a while loop, print the value of the counter and decrement the counter.
*/

import java.util.Scanner;

class CountDown{
	public static void main(String [] args){
		
		//create scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the countdown start value: ");
        int counter = scan.nextInt();

        // While loop to countdown from the input value to 1
        while (counter >= 1) {
            System.out.print(counter + " "); 
            counter--; 
        }

        // Printing "Launch!" when the countdown is complete
        System.out.println("Launch!");
	}
}