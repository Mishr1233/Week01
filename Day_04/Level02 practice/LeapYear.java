/*Write a program that takes a year as input and outputs the Year is a Leap Year or not 
Hint => 
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. 
Also Leap year is divisible by 4 and not divisible by 100 or divisible by 400
Write a method to check for Leap Year using the conditions a and b
*/


import java.util.*;

public class LeapYear {

    public static void main(String[] args) {

        // Creating a scanner to take user input
        Scanner sc = new Scanner(System.in);
	   
        // hint user to input a number
        System.out.println("Enter a number :");
        int number = sc.nextInt();
		
		boolean check =leapYearCheck(number);
		if(check){
			System.out.println(number+" Year is a Leap Year.");
		}else{
			System.out.println(number+" Year is not a Leap Year.");
		}
		
		sc.close();
	}
	
	public static boolean leapYearCheck(int number){
		
		if(number%4==0 || number%100 ==0 || number%400==0){
			return true;
			
		}
		
		return false;
		
	}
}