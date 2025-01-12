/*Write a program to check whether a number is positive, negative, or zero.
Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1 for positive number and 0 if number is zero
*/


import java.util.*;
public class NumberCheck{
	public static void main(String args []){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int number =sc.nextInt();
		
		NumberCheck value =new NumberCheck();
		System.out.println("number is "+value.numberCheck(number));
		
      sc.close();
     }
	 
	 public int numberCheck(int number){
		 if(number<0){
			 return -1;
		 }else if(number>0){
			 return 1;
		 }else{
			 return 0;
		 }
	 }
}