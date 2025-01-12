/*Write a program that generates five 4 digit random values and then finds their average value, and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max().
Hint => 
Write a method that generates array of 4 digit random number given the size as a parameter as shown in the method signature 
public int[] generate4DigitRandomArray(int size)
Write a method to find average, min and max value of an array 
public double[] findAverageMinMax(int[] number) 
*/


import java.util.Random;

public class RandomNumberCheck {

    // Method to generate an array of 4-digit random number
    public static int[] generate4DigitRandomArray(int size) {
        Random random = new Random();
        int[] number = new int[size];

        // Generate 4-digit random number
        for (int i = 0; i < size; i++) {
            number[i] = 1000 + random.nextInt(9000); // Generates number from 1000 to 9999
        }

        return number;
    }

    // Method to find average, min and max value of an array
    public static double[] findAverageMinMax(int[] number) {
        int sum = 0;
        int min = number[0];
        int max = number[0];

        // Loop through the array to calculate sum, min, and max
        for (int num : number) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Calculate average
        double average = (double) sum / number.length;

        // Return average, min, and max in a double array
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int size = 5;

        // Generate the 4-digit random number array
        int[] randomnumber = generate4DigitRandomArray(size);

        // Find average, min, and max values
        double[] result = findAverageMinMax(randomnumber);

        // Display the results
        System.out.println("Generated 4 digit random number:");
        for (int num : randomnumber) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nAverage: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }
}
