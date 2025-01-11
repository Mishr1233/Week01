/*Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array
Hint => 
Take user input for rows and columns, create a 2D array (Matrix), and take the user input 
Copy the elements of the matrix to a 1D array. For this create a 1D array of size rows*columns as in int[] array = new int[rows * columns];
Define the index variable and Loop through the 2D array. Copy every element of the 2D array into the 1D array and increment the index
Note: For looping through the 2D array, you will need Nested for loop, Outer for loop for rows, and the inner for loops to access each element
*/


import java.util.*;

public class Copy2DTo1DArray {
    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner sc = new Scanner(System.in);

        // take user input for the number of rows and columns for the matrix
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        // Create a 2D array of size rows x columns
        int[][] matrix = new int[rows][columns];

        // Take user input for elements of the 2D array
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // create a 1D array to store the copied elements of the 2D array
        int[] array = new int[rows * columns];

        // copy elements from the 2D array to the 1D array
        int index = 0; 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j]; // Copy element and increment the index
            }
        }

        // Display the original 2D array 
        System.out.println("\nOriginal 2D Array :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Display the copied 1D array
        System.out.println("\nCopied 1D Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // close the scanner
        sc.close();
    }
}
