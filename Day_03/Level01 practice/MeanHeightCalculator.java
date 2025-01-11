/*Create a program to find the mean height of players present in a football team.
Hint => 
The formula to calculate the mean is: mean = sum of all elements / number of elements
Create a double array named heights of size 11 and get input values from the user.
Find the sum of all the elements present in the array.
Divide the sum by 11 to find the mean height and print the mean height of the football team
*/



import java.util.*;

public class MeanHeightCalculator {

    public static void main(String[] args) {

        // Create a scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Define an array to store the heights of 11 players
        double[] heights = new double[11];

        // Prompt the user to enter the heights of the players
        System.out.println("Please enter the heights of 11 football players (in meters):");

        // variable to store the sum of all heights
        double sum = 0;

        // loop to get the height of each player and calculate the sum
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height for player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble(); // Take input for each players height
            sum += heights[i]; // add the current players height to the sum
        }

        // Calculate the mean height
        double meanHeight = sum / heights.length; // Divide the sum by 11 to get the mean height

        // Print the mean height of the football team
        System.out.println("The mean height of the football team is: " + meanHeight + " meters.");

        // Close the scanner 
        sc.close();
    }
}
