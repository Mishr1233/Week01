/*Write a program to find the smallest and the largest of the 3 numbers.
Hint => 
Take user input for 3 numbers
Write a single method to find the smallest and largest of the three numbers
public static int[] findSmallestAndLargest(int number1, int number2, int number3)
*/

import java.util.*;
public class SmallestAndLargest{
	public static void main(String args []){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number  :");
		int number =sc.nextInt();
		
		System.out.println("Enter number  :");
		int number1 =sc.nextInt();
		
		System.out.println("Enter number  :");
		int number2 =sc.nextInt();
		
		int array[] =new int[2];
		array = findSmallestAndLargest(number,number1,number2);
		
		System.out.println("Largest Number is "+array[0]+" smallest number is "+array[1]);
		
		
		sc.close();
		
	}
	
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		int array[] =new int[2];
		
		int largest =Math.max(number1 , Math.max(number2,number3));
		int smallest =Math.min(number1 , Math.min(number2,number3));
		
		array[0]=largest;
		array[1]=smallest;
		
		return array;
	}
}