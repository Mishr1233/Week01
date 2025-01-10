/*Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
Hint => 
Create variables a, b, c of int data type.
Take user input for a, b, and c.
Compute 3 integer operations and assign result to a variable
Finally print the result and try to understand operator precedence.
I/P => fee, discountPrecent
O/P => The results of Int Operations are —-, -—, and —-
*/


import java.util.*;  

public class Operation {
	
    public static void main(String args[]) {
        
        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the value of 'a'
        System.out.println("Enter a :");
        int a = sc.nextInt();  // Reading the value of 'a' from user input
        
        // Prompt the user to enter the value of 'b'
        System.out.println("Enter b :");
        int b = sc.nextInt();  // Reading the value of 'b' from user input
        
        // Prompt the user to enter the value of 'c'
        System.out.println("Enter c :");
        int c = sc.nextInt();  // Reading the value of 'c' from user input
        
        // Performing operations based on the given formulae
        int operation1 = a + b * c;  // First operation: a + (b * c)
        int operation2 = a * b + c;  // Second operation: (a * b) + c
        int operation3 = c + a / b;  // Third operation: c + (a / b)
        int operation4 = a % b + c;  // Fourth operation: (a % b) + c
        
        // Displaying the results of all operations
        System.out.println("The results of the operations are: " + operation1 + ", " + operation2 + ", " + operation3 + " and " + operation4);
    }
}
