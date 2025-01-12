/*An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the team of 10 members. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
Hint => 
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and and store it in the corresponding 2D array of 10 rows and 3 columns. The First Column storing the weight, the second column storing the height in cm and the third column is the BMI
Create a Method to find the BMI of every person and populate the array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Create a Method to determine the BMI status using the logic shown in the figure below. and return the array of all the persons BMI Status. 
*/


import java.util.*;

public class BMICalculator {

    // Method to calculating BMI
    public static double calculateBMI(double weight, double heightInCm) {
        double heightInMeter = heightInCm / 100;  // Converting cm to meters
        return weight / (heightInMeter * heightInMeter);  // BMI formula
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        // 2D array to store weight, height, and BMI for 10 persons
        double[][]personDetail = new double[10][3];

        // input for 10 persons weight in kg and height in cm
        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            personDetail[i][0] = sc.nextDouble(); // Store weight in the first column

            System.out.print("Height (cm): ");
           personDetail[i][1] = sc.nextDouble(); // Store height in the second column

            // Calculate BMI and store it in the third column
           personDetail[i][2] = calculateBMI(personDetail[i][0],personDetail[i][1]);
        }

        // Display the height, weight, BMI, and BMI status for each person
        System.out.println("\nDetails for each person:");
        for (int i = 0; i < 10; i++) {
            
			double bmi =personDetail[i][2];
            String status = getBMIStatus(bmi);
            
			System.out.printf("Person %d: Weight = %.2f kg, Height = %.2f cm, BMI = %.2f, Status = %s\n",
                    (i + 1),personDetail[i][0],personDetail[i][1], bmi, status);
        }

        // Close the sc
        sc.close();
    }
}
