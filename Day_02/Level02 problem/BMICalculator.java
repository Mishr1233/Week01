/*Create a program to find the BMI of a person
Hint => 
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and store it in the corresponding variable.
Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Use the table to determine the weight status of the person
*/

import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {

        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their weight in kg
        System.out.print("Enter your weight (in kg): ");
        double weight = sc.nextDouble();

        // Prompt the user to enter their height in cm
        System.out.print("Enter your height (in cm): ");
        double height = sc.nextDouble();

        // Convert height from cm to meters
        height = height / 100;

        // Calculate BMI using the formula: BMI = weight / (height * height)
        double bmi = weight / (height * height);

        // Output the BMI
        System.out.println("Your BMI is: " + bmi);

        // Determine and print the weight status based on the BMI value
        if (bmi <= 18.4) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Weight Status: Normal ");
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obese ");
        }

        // Close the scanner
        sc.close();
    }
}
