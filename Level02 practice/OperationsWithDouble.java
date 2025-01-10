/*Similarly, write the DoubleOpt program by taking double values and doing the same operations.
*/



import java.util.*;  // Importing the Scanner class from the java.util package

public class OperationsWithDouble {
	
    public static void main(String args[]) {
        
        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the value of 'a'
        System.out.println("Enter a :");
        double a = sc.nextDouble();  // Reading the value of 'a' from user input
        
        // Prompt the user to enter the value of 'b'
        System.out.println("Enter b :");
        double b = sc.nextDouble();  // Reading the value of 'b' from user input
        
        // Prompt the user to enter the value of 'c'
        System.out.println("Enter c :");
        double c = sc.nextDouble();  // Reading the value of 'c' from user input
        
        // Performing operations based on the given formulae
        double operation1 = a + b * c;  // First operation: a + (b * c)
        double operation2 = a * b + c;  // Second operation: (a * b) + c
        double operation3 = c + (a / b);  // Third operation: c + (a / b)
        double operation4 = a % b + c;  // Fourth operation: (a % b) + c
        
        // Displaying the results of all operations
        System.out.println("The results of the operations are: " + operation1 + ", " + operation2 + ", " + operation3 + " and " + operation4);
    }
}
