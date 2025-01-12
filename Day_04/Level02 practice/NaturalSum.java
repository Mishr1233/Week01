/*Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show
 the result from both computations is correct. 
Hint => 
Take the user input number and check whether it's a Natural number, if not exit
Write a Method to find the sum of n natural numbers using recursion
Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2 
Compare the two results and print the result
*/



import java.util.*;

public class NaturalSum {

    public static void main(String[] args) {

        // Creating a scanner to take user input
        Scanner sc = new Scanner(System.in);
	   
        // hint user to input a number
        System.out.println("Enter a number :");
        int number = sc.nextInt();	
		
		System.out.println("recursion sum is "+recursive(number));
		System.out.println("formula sum is "+sumByFormula(number));
		
       
     sc.close();   	   
	}
	
	public static int recursive(int number){
		if(number ==0){
			return number;
		}
			
	 return number+recursive(number-1);
	}
	
	public static int sumByFormula(int number ){
		 
		
		
		return number*(number+1)/2; 
		
	}
	
}