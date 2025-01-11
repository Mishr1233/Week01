/*Write a program to check if the first, second, or third number is the largest of the three.
I/P => number1, number2, number3
O/P => 
Is the first number the largest? ____
Is the second number the largest? ___
Is the third number the largest? ___
*/


import java.util.*;
public class LargestNum{
	
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	
	    System.out.println("Enter number1 :");
		int number1 = sc.nextInt();
		
		System.out.println("Enter number2 :");
		int number2 = sc.nextInt();
		
		
		System.out.println("Enter number3 :");
		int number3 = sc.nextInt();
		
		int largest =Math.max(number1,Math.max(number2,number3));
		
		boolean isLargest =false;
		
		if(largest==number1){
		System.out.println("Is the first number the largest? yes"+ "\nIs the second number the largest? No "+ " \nIs the third number the largest?  no" );
		
		
		}else if(largest==number2){
			System.out.println("Is the first number the largest? No"+ "\nIs the second number the largest? Yes "+ " \nIs the third number the largest?  no" );
		}else{
			System.out.println("Is the first number the largest? No"+ "\nIs the second number the largest? No "+ " \nIs the third number the largest?  yes" );
		}
		sc.close();
		
	}
}