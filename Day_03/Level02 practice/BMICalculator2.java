import java.util.Scanner;

public class BMICalculator2 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        // ask the user how many people are in the group
        System.out.print("Enter the number of people: ");
        int numberOfPeople = sc.nextInt();

        // create a 2D array to store weight, height, and BMI for each person
        double[][] personData = new double[numberOfPeople][3];  
        String[] weightStatus = new String[numberOfPeople];

        // for each person ask for their height and weight
        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println("Person " + (i + 1) + ":");

            // get valid height input 
            double height;
            do {
                System.out.print("Enter height in meters : ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be a positive value Please try again");
                }
            } while (height <= 0);
            personData[i][0] = height;

         
            double weight;
            do {
                System.out.print("Enter weight : ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be a positive value Please try again !");
                }
            } while (weight <= 0);
            personData[i][1] = weight;

            // calculate BMI for the current person 
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

           
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the results
        System.out.println("\nBMI Calculation Results:");
        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][0] + " meters");
            System.out.println("Weight: " + personData[i][1] + " kilograms");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Weight Status: " + weightStatus[i]);
            System.out.println();  
        }

      
        sc.close();
    }
}
