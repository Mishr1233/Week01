/*An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in a team of 10 members. For this create a program to find the BMI and display the height, weight, BMI, and status of each individual
Hint => 
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and store it in the corresponding 2D array of 10 rows. The First Column stores the weight and the second column stores the height in cm
Create a Method to find the BMI and status of every person given the person height and weight and return the 2D String array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Create a Method that takes the 2D array of height and weight as parameter. Calls the  user defined method to compute the BMI and the BMI Status and store in 2D String array of height, weight, BMI, and status.
Create a method to display the 2D string array in a tabular format of Person Height, Weight, BMI and the Status
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
*/



import java.util.Scanner;

public class BMICalculator {

    // Method to calculating BMI and status for each person
    public static String[][] calculateBMI(double[][] personData) {
        String[][] result = new String[personData.length][4];  // Columns for height, weight, BMI, and status
        
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];  // Weight in kg
            double heightInCm = personData[i][1];  // Height in cm
            double heightInMeters = heightInCm / 100;  // Convert height from cm to meters
            
        
            double bmi = weight / (heightInMeters * heightInMeters);
            bmi = Math.round(bmi * 100.0) / 100.0;  // Round to 2 decimal places
            
            // Determine BMI status
            String status = "";
            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status = "Normal";
            } else if (bmi >= 25.0 && bmi < 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }
            
            // Store the height, weight, BMI, and status in the result array
            result[i][0] = String.format("%.2f", personData[i][1]);  // Height (in cm)
            result[i][1] = String.format("%.2f", personData[i][0]);  // Weight (in kg)
            result[i][2] = String.format("%.2f", bmi);  // BMI
            result[i][3] = status; 
        }

        return result;
    }

    // Method to display the BMI table
    public static void displayBMIData(String[][] result) {
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Height (cm)", "Weight (kg)", "BMI", "Status");
       
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-10s\n", result[i][0], result[i][1], result[i][2], result[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an array to store weight and height data for 10 people
        double[][] personData = new double[10][2];  // 10 rows for 10 people, 2 columns for weight and height

        // Taking input from user for height and weight
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("Enter weight (in kg): ");
            personData[i][0] = sc.nextDouble();  // Input weight
            System.out.print("Enter height (in cm): ");
            personData[i][1] = sc.nextDouble();  // Input height
        }

        // Calculate BMI and Status for each person
        String[][] result = calculateBMI(personData);

      
        displayBMIData(result);

        sc.close(); 
    }
}
