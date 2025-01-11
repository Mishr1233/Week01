/*
Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
Hint => 
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop using break;
*/

import java.util.Scanner;

class FindAddition{
	public static void main(String [] args){
		
		//create Scanner object scan for user input
		Scanner scan = new Scanner(System.in);
		
		//create a variable total for adding all numbers
		double total = 0;
		
		//create a infinite loop 
		while(true){
			
			System.out.print("Enter a number :");
			double number = scan.nextDouble();
			
			//conditional statement for check number is 0 or not
			if(number <= 0){
				break;
			}else{
				//Here first add a number in total and then assign it in total
				total += number;
			}
		}
		
		System.out.println("The total sum is :" + total);
	}
}