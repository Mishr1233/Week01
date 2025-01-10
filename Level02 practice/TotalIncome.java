/*Create a program to find the total income of a person by taking salary and bonus from user
Hint => 
Create a variable named salary and take user input.
Create another variable bonus and take user input.
Compute income by adding salary and bonus and print the result
I/P => salary, bonus
O/P => The salary is INR ___ and bonus is INR ___. Hence Total Income is INR ___
*/


import java.util.*; 

// Declaring the public class 'TotalIncome'
public class TotalIncome {
    
   
    public static void main(String args[]) {
        
        // Creating a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompting the user to input their salary
        System.out.println("Enter your salary :");
        
        // Reading the salary entered by the user
        double salary = sc.nextDouble();
        
        // Prompting the user to input their bonus
        System.out.println("Enter your bonus :");
        
        // Reading the bonus entered by the user
        double bonus = sc.nextDouble();
        
        // Calculating the total income by adding salary and bonus
        double totalSalary = salary + bonus;
    
        // Displaying the result: salary, bonus, and total income
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence, Total Income is INR " + totalSalary);
    }
}
