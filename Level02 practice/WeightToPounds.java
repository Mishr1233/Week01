/*Create a program to convert weight in pounds to kilograms.
Hint => 1 pound = 2.2 kg
I/P => weight
O/P => The weight of the person in pound is ___ and in kg is ___
*/


import java.util.*; 

public class WeightToPounds {

    public static void main(String args[]) {
        
        // Create a scanner object 'sc' to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the weight in kilograms
        System.out.println("Enter weight in kilograms :");
        
        // Read the weight in kilograms from the user
        double weight = sc.nextDouble();
        
        // Convert weight from kilograms to pounds (1 kg = 2.2 pounds)
        double pounds = weight * 2.2;
        
        // Print the weight in both kilograms and pounds
        System.out.println("The weight of the person in pound is "+ pounds +" and in kg is "+weight);
    }
}
