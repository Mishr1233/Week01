/*Write a program the find the distance in yards and miles for the distance provided by user in feets
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
*/

import java.util.*;  

public class DistanceConverter {
    
    
    public static void main(String args[]) {
        
        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter a distance in feet
        System.out.println("Enter distance in feets :");
        
        // Reading the input distance in feet
        double distanceInFeet = sc.nextDouble();
        
        // Converting the distance from feet to yards (1 yard = 3 feet)
        double distanceInYard = distanceInFeet / 3.0;
        
        // Converting the distance from yards to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYard / 1760.0;
        
        // Printing the converted distance in yards, feet, and miles
        System.out.println("Your distance in yard is " + distanceInYard + " while in feet is " + distanceInFeet + " and in miles is " + distanceInMiles);        
    }
}
