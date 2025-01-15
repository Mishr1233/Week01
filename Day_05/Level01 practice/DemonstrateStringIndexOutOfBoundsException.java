/*Write a program to demonstrate StringIndexOutOfBoundsException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Access the index using charAt() beyond the length of the String. 
This will generate a runtime exception and abruptly stop the program.
Write the Method to demonstrate StringIndexOutOfBoundsException. Access the index using charAt() beyond the length of the String. 
Then write try catch block for Exception while accessing the String method
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/



import java.util.Scanner;

public class  DemonstrateStringIndexOutOfBoundsException{
    
    // generate StringIndexOutOfBoundsException function
    public static void generateException(String str) {
       
        
        System.out.println("Trying to access index " + str.length());
        char character = str.charAt(str.length()); // This will throw an exception
        System.out.println("Character at the accessed index: " + character);
    }
    
  
    public static void handleException(String str) {
        try {
          
            generateException(str);
        } catch (StringIndexOutOfBoundsException e) {
           
            System.out.println("Exception message: " + e);
            System.out.println("Please try accessing a valid index within the string length.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        System.out.println("Enter a string:");
        String str =sc.nextLine();
        
       
        System.out.println("\nDemonstrating StringIndexOutOfBoundsException...\n");
        generateException(str);
        
       
        System.out.println("\nHandling the exception using try-catch \n");
        handleException(str);
        
       sc.close();
    }
}
