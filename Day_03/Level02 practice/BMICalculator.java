import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // ask the user how many people are in the group
        System.out.print("Enter the number of people: ");
        int numberOfPeople = sc.nextInt();

        // create arrays to store the weight, height, BMI, and weight status for each person
        double[] weight = new double[numberOfPeople];
        double[] height = new double[numberOfPeople];
        double[] bmi = new double[numberOfPeople];
        String[] weightStatus = new String[numberOfPeople];

       
        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println("Person " + (i + 1) + ":");

            System.out.print("Enter height (in meters): ");
            height[i] = sc.nextDouble();

            System.out.print("Enter weight (in kilograms): ");
            weight[i] = sc.nextDouble();

            // calculate BMI for the current person
            bmi[i] = weight[i] / (height[i] * height[i]);

            // determine weight status based on the BMI
            if (bmi[i] <=18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // display the results 
        System.out.println("\nBMI Calculation Results:");
        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + height[i] + " meters");
            System.out.println("Weight: " + weight[i] + " kilograms");
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Weight Status: " + weightStatus[i]);
            System.out.println(); 
        }

       
        sc.close();
    }
}
