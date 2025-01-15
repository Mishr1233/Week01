/*Write a program to demonstrate ArrayIndexOutOfBoundsException
Hint => 
Define a variable of array of names and take input from the user
Write a Method to generate the Exception. Here access index larger then the length of the array. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate ArrayIndexOutOfBoundsException. Here access index larger then the length of the array. This will generate a runtime exception. Use the try-catch block to handle the ArrayIndexOutOfBoundsException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/



import java.util.Scanner;

public class DemonstrateArrayIndexOutOfBoundsException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the number of names:");
        int n = sc.nextInt();
        sc.nextLine();  

      
        String[] names = new String[n];
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        // Call the method to generate the ArrayIndexOutOfBoundsException
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
           
            System.out.println("Caught RuntimeException: " + e);
        }

      
        demonstrateException(names);

        sc.close();  // Closing the scanner
    }

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        System.out.println("Trying to access an invalid index in the array...");
       
        System.out.println(names[names.length]);  // This will throw ArrayIndexOutOfBoundsException
    }

   
    public static void demonstrateException(String[] names) {
        try {
            System.out.println("Demonstrating exception handling...");
         
            System.out.println(names[names.length]);  // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catching the ArrayIndexOutOfBoundsException 
            System.out.println("Handled ArrayIndexOutOfBoundsException: Index out of bounds.");
        } catch (RuntimeException e) {
            
            System.out.println("Handled RuntimeException: " + e);
        }
    }
}
