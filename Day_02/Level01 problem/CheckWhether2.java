/*
Write a program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.
Hint => 
Get integer input from the user and store it in the age variable.
If the person is 18 or older, print "The person can vote." Otherwise, print "The person cannot vote." 
I/P => age
O/P => If the person's age is greater or equal to 18 then the output is 
The person's age is ___ and can vote.
Otherwise 
The person's age is ___ and cannot vote.
*/

import java.util.Scanner;

class CheckWhether2{
	public static void main(String [] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
        int age = scan.nextInt(); // Reading the age input from the user

        // Checking if the person can vote based on their age
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
	}
}