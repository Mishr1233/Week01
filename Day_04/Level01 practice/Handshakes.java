/*Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for number of students
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Write a method to use the combination formulae to calculate the number of handshakes
*/

import java.util.*;
public class Handshakes{
	public static void main(String args []){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of students :");
		int numberOfStudents =sc.nextInt();
		
		Handshakes handshakes =new Handshakes();
		
		handshakes.handshakesCalculate(numberOfStudents);
		
		
		
			sc.close();

		
	}
	
	public void handshakesCalculate(int numberOfStudents){
		int totalHandshake =numberOfStudents*(numberOfStudents-1)/2;
		
		System.out.println("the number of handshakes is "+totalHandshake);
		
	}
	
}