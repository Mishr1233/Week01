/*Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
Hint => 
Create a variable number1 and number 2 and take user inputs.
Perform Arithmetic Operations of addition, subtraction, multiplication and division and assign the result to a variable and finally print the result
I/P => number1, number2
O/P => The addition, subtraction, multiplication and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___
*/

import java.util.*;
public class Calculator{
	
	public static void main(String args[]){
	
     Scanner sc =new Scanner(System.in);
     
	 System.out.println("Enter number1 :");
	 //create a vairable number1 and take input
     double	number1= sc.nextDouble();
     
	  System.out.println("Enter number2 :");
	 //create a vairable number2 and take input
     double number2= sc.nextDouble();
     
	 //calculate Addition and store in sum variable
     double sum= number1 + number2;
     
	 //calculate subtraction and store in subtraction variable
     double subtraction = number1 - number2;
    
      //calculate multiplication and store in multiplication variable	
	 double multiplication = number1 * number2;
	 
	  //calculate division and store in division variable
     double division = number1 / number2;


     System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1+" and "+number2+","+sum+","+subtraction+" "+multiplication+" and "+division);	 
		
	}
	
	
	
}