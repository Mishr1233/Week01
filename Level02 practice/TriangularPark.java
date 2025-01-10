/*An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
I/P => side1, side2, side3
O/P => The total number of rounds the athlete will run is ___ to complete 5 km*/



import java.util.*;  

public class TriangularPark {
    
    
    public static void main(String args[]) {
        
        // Create a Scanner object 'sc' to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to input the length of the first side of the triangular park
        System.out.println("Enter side1 :");
        
        // Read the value of side1 (length of first side) from the user
        double side1 = sc.nextDouble();
        
        // Prompt the user to input the length of the second side
        System.out.println("Enter side2 :");
        
        // Read the value of side2 (length of second side) from the user
        double side2 = sc.nextDouble();
        
        // Prompt the user to input the length of the third side
        System.out.println("Enter side3 :");
        
        // Read the value of side3 (length of third side) from the user
        double side3 = sc.nextDouble();
        
        // Calculate the perimeter of the triangular park by summing the lengths of the three sides
        double perimeter = side1 + side2 + side3;
        
        // Calculate the total number of rounds the athlete will run to complete 5 km (5000 meters)
        // This is done by dividing the total distance (5000 meters) by the perimeter of the triangle
        double round = 5000.0 / perimeter;
        
        // Print the result showing how many rounds the athlete will need to run to complete 5 km
        System.out.println("The total number of rounds the athlete will run is " + round + " to complete 5 km");
    }
}
