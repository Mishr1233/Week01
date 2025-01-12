/*An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => 
Take user input for 3 sides of a triangle 
The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
Write a Method to compute the number of rounds user needs to do to complete 5km run
*/


import java.util.*;  

public class TriangularPark {
    
    
    public static void main(String args[]) {
        
        // create a Scanner object 'sc' to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to input the length of the first side of the triangular park
        System.out.println("Enter side1 :");
        double side1 = sc.nextDouble();
        
        // Prompt the user to input the length of the second side
        System.out.println("Enter side2 :");
        double side2 = sc.nextDouble();
        
        // Prompt the user to input the length of the third side
        System.out.println("Enter side3 :");
        double side3 = sc.nextDouble();
		
		TriangularPark triangular = new TriangularPark();
		triangular.triangularPark(side1,side2,side3);
		
		
		sc.close();
	}
	
	public void triangularPark(double side1, double side2, double side3 ){
		 // calculate the perimeter of the triangular park by summing the lengths of the three sides
        double perimeter = side1 + side2 + side3;
        
        // calculate the total number of rounds the athlete will run to complete 5 km 
       
        double round = 5000.0 / perimeter;
        
    
        System.out.println("The total number of rounds the athlete will run is " + round + " to complete 5 km");
	}
}