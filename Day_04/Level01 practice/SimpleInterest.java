/*Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => 
Simple Interest = Principal * Rate * Time / 100
Take user input for principal, rate, time
Write a method to calculate the simple interest given principle, rate and time as parameters
Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”
*/

import java.util.*;
public class SimpleInterest{
	public static void main(String args []){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter principal :");
		double principal =sc.nextDouble();
		
		System.out.println("Enter rate :");
	   double rate =sc.nextDouble();

		
		
		System.out.println("Enter time :");		
		double time =sc.nextDouble();
		
		SimpleInterest interest = new SimpleInterest();
        interest.simpleInterest(principal,rate,time);		
		
		sc.close();

		
	}
	
	public void simpleInterest(double principal, double rate, double time ){
		
		double interest = (principal * rate * time)/100.0;
		
		System.out.println("The Simple Interest is "+interest+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
	}
 
 
}