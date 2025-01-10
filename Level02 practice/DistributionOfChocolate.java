/*Create a program to divide N number of chocolates among M children.
Hint => 
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Find the number of chocolates each child gets and number of remaining chocolates
Display the results
I/P => numberOfchocolates, numberOfChildren
O/P => The number of chocolates each child gets is ___ and the number of remaining chocolates are ___
*/




import java.util.*; 

public class DistributionOfChocolate {

    
    public static void main(String args[]) {
        
        // Creating a Scanner object 'sc' to read user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the total number of chocolates
        System.out.println("Enter numberOfchocolates :");
        
        // Read the total number of chocolates from the user
        int numberOfchocolates = sc.nextInt();
        
        // Prompt the user to enter the number of children
        System.out.println("Enter numberOfChildren :");
        
        // Read the total number of children from the user
        int numberOfChildren = sc.nextInt();
        
        // Calculate the number of chocolates each child will get
        int distributedChocolate = numberOfchocolates / numberOfChildren;
        
        // Calculate the remaining chocolates after distribution
        int remaining = numberOfchocolates % numberOfChildren;
        
        // Print the results: the number of chocolates each child gets and the remaining chocolates
        System.out.println("The number of chocolates each child gets is " + distributedChocolate + " and the number of remaining chocolates are " + remaining);
    }
}
