/*Rewrite the Sample Program 2 with user inputs
Hint => 
Create variables and take user inputs for name, fromCity, viaCity, toCity
Create variables and take user inputs for distances fromToVia and viaToFinalCity in Miles
Create Variables and take time taken 
Finally, print the result and try to understand operator precedence.
I/P => fee, discountPrecent
O/P => The results of Int Operations are ___, ___, and ___
*/




 import java.util.*;  // Import Scanner class for user input

public class TravelComputation {

   public static void main(String[] args) {
      
      // Create a scanner object to take input from the user
      Scanner sc = new Scanner(System.in);
      
      // Take user input for the person's name
      System.out.print("Enter the traveler's name: ");
      String name = sc.nextLine();
      
      // Take user input for cities
      System.out.print("Enter the starting city: ");
      String fromCity = sc.nextLine();
      
      System.out.print("Enter the via city: ");
      String viaCity = sc.nextLine();
      
      System.out.print("Enter the destination city: ");
      String toCity = sc.nextLine();
   
      // Take user input for distances in miles
      System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
      double distanceFromToVia = sc.nextDouble();
   
      System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
      double distanceViaToFinalCity = sc.nextDouble();
   
      // Take user input for travel times (in minutes)
      System.out.print("Enter the travel time from " + fromCity + " to " + viaCity + " in minutes: ");
      int timeFromToVia = sc.nextInt();
   
      System.out.print("Enter the travel time from " + viaCity + " to " + toCity + " in minutes: ");
      int timeViaToFinalCity = sc.nextInt();
   
      // Calculate total distance in miles
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;
   
      // Calculate total time in minutes
      int totalTime = timeFromToVia + timeViaToFinalCity;
   
      // Print the travel details including name, cities, total distance, and total time
      System.out.println("The Total Distance travelled by " + name + " from " + fromCity + 
                         " to " + toCity + " via " + viaCity + " is " + totalDistance + " miles. The Total Time taken is " + totalTime + " minutes.");
	  
	  
      
    
   }
}
