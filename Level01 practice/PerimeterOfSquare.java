/*Write a program to find the side of the square whose parameter you read from user 
Hint => Perimeter of Square is 4 times side
I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ____*/

import java.util.*;  

public class PerimeterOfSquare {

  
    public static void main(String args[]) {

        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter the perimeter of the square
        System.out.println("Enter perimeter in Cm :");
        
        // Reading the perimeter value entered by the user
        double perimeter = sc.nextDouble();

        // Calculating the side length of the square using the formula: side = perimeter / 4
        double sideOfSquare = perimeter / 4.0;

        // Printing the length of the side of the square and its corresponding perimeter
        System.out.println("The length of the side is " + sideOfSquare + " whose perimeter is " + perimeter);
    }
}
