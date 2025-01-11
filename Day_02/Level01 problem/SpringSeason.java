/*
Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
Hint => 
Spring Season is from March 20 to June 20
*/

import java.util.Scanner;

class SpringSeason{
	public static void main(String [] args){
	
	    Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter month :");
		int month = scan.nextInt();
		
		System.out.print("Enter Day :");
		int day = scan.nextInt();

        // Check if the month and day fall within the Spring season (March 20 to June 20)
        if ((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
	}
}