/*Write a program to take 2 numbers and print their quotient and reminder
Hint => 
Take user input as integer
Use division operator (/) for quotient and moduli operator (%) for reminder
Write Method to find the reminder and the quotient of a number 
public static int[] findRemainderAndQuotient(int number, int divisor) */


import java.util.*;
public class FindRemainderAndQuotient{
	public static void main(String args []){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number  :");
		int number1 =sc.nextInt();
		
		System.out.println("Enter number  :");
		int number2 =sc.nextInt();
		
				
		int array[] =new int[2];
		array = findRemainderAndQuotient(number1,number2);
		
		System.out.println("their quotient is "+array[0]+" and reminder is "+array[1]);
           
	    sc.close();	   
	}
	
	public static int[] findRemainderAndQuotient(int number, int divisor){
		
		int array[] =new int[2];
		
		int quotient = number / divisor;
		int reminder = number % divisor;
		
		array[0]=quotient;
		array[1]=reminder;
		
		return array;
	}
	
}