/*Write a program to demonstrate IllegalArgumentException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Here use the subString() and set the start index to be greater than the end index.
This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate IllegalArgumentException. Here use the subString() and set 
the start index to be greater than the end index. This will generate a runtime exception. Use the try-catch block to 
handle the IllegalArgumentException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/


import java.util.Scanner;

public class DemonstrateIllegalArgumentException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        
        // Call the method to generate IllegalArgumentException
        try {
            generateException(str);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
           
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }

        // method to demonstrate IllegalArgumentException handling
        demonstrateException(str);

        sc.close();  // close the scanner
    }

    // Method to generate IllegalArgumentException
    public static void generateException(String str) {
        System.out.println("Trying to generate exception by using substring() with invalid indices...");
        System.out.println(str.substring(5, 3));  
    }

    // Method to demonstrate IllegalArgumentException handling
    public static void demonstrateException(String str) {
        try {
          
            System.out.println("Demonstrating IllegalArgumentException handling...");
            System.out.println(str.substring(10, 5)); 
        } catch (IllegalArgumentException e) {
           
            System.out.println("Handled IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
          
            System.out.println("Handled RuntimeException: " + e);
        }
    }
}
