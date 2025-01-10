/*Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Display the number of possible handshakes.
*/

import java.util.*; 
public class StudentHandshakes{
	
	public static void main(String args[]){
		
		 // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
		
		System.out.println("input numberOfStudents :");
		double numberOfStudents = sc.nextDouble();
		
		double numberOfPossibleHanshakes = (numberOfStudents * (numberOfStudents-1.0))/2.0;
		
		System.out.println("number of possible handshakes "+numberOfPossibleHanshakes);
	}
}