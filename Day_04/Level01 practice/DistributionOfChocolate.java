/*Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also
 the remaining chocolates
Hint => 
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Write the method to find the number of chocolates each child gets and number of remaining chocolates
public static int[] findRemainderAndQuotient(int number, int divisor) 
*/


import java.util.*; 

public class DistributionOfChocolate {

    
    public static void main(String args[]) {
        
       
        Scanner sc = new Scanner(System.in);
        
        //user to enter the total number of chocolates
        System.out.println("Enter numberOfchocolates :");
        int numberOfchocolates = sc.nextInt();
        
        // Prompt the user to enter the number of children
        System.out.println("Enter numberOfChildren :");
        int numberOfChildren = sc.nextInt();
		
		int array[] =new int[2];
		array = chocolates(numberOfChildren,numberOfchocolates);
		
	    System.out.println("The number of chocolates each child gets is " + array[0] + " and the number of remaining chocolates are " + array[1]);

		sc.close();
	}
	
	public static int[] chocolates(int numberOfChildren,int numberOfchocolates) {
		int distributedChocolate = numberOfchocolates / numberOfChildren;
        
        // Calculate the remaining chocolates after distribution
        int remaining = numberOfchocolates % numberOfChildren;
		
		int array[] =new int[2];
		
	    array[0]=distributedChocolate;
		array[1]=remaining;
		
		return array;
		
	}
}

