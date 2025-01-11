/*Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay,
 along with the old and new salary.
Hint => 
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Define a double array to save salary and years of service for each of the 10 employees
Also define a double array to save the new salary and the bonus amount as well as variables to save the total bonus, total old salary, and new salary
Define a loop to take input from the user. If salary or year of service is an invalid number then ask the use to enter again. Note in this case you will have to decrement the index counter
Define another loop to calculate the bonus of 10 employees based on their years of service. Save the bonus in the array, compute the new salary, and save in the array.
 Also, the total bonus and total old and new salary can be calculated in the loop
Print the total bonus payout as well as the total old and new salary of all the employees
*/



import java.util.Scanner;

public class EmployeBonus {

    public static void main(String[] args) {
        // create a Scanner object 
        Scanner sc = new Scanner(System.in);

        // declare arrays to hold salary, years of service, bonus, and new salary
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Variables to calculate total bonus, total old salary, and total new salary
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // loop to get input from the user for salary and years of service
        for (int i = 0; i < 10; i++) {
            // input for the salary and years of service of the employee
            System.out.println("Enter details for employee " + (i + 1));
			
            while (true) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                salary[i] = sc.nextDouble();
                if (salary[i] > 0) {
                    break; // If salary is valid positive exit the loop
                } else {
                    System.out.println("Invalid salary Please enter a positive number.");
                }
            }

            // input years of service
            while (true) {
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                yearsOfService[i] = sc.nextDouble();
                if (yearsOfService[i] >= 0) {
                    break; // If years of service is valid 
                } else {
                    System.out.println("Invalid years of service. Please enter a valid number.");
                }
            }

            // compute the bonus and new salary
            double employeeBonus = 0;
            if (yearsOfService[i] > 5) {
                employeeBonus = salary[i] * 0.05; // 5% bonus for employees with more than 5 years of service
            } else {
                employeeBonus = salary[i] * 0.02; // 2% bonus for employees with 5 or less years of service
            }

            // calculate the new salary 
            double employeeNewSalary = salary[i] + employeeBonus;

            // Store the bonus and new salary in the respective arrays
            bonus[i] = employeeBonus;
            newSalary[i] = employeeNewSalary;

           
            totalBonus += employeeBonus;
            totalOldSalary += salary[i];
            totalNewSalary += employeeNewSalary;
        }

       
        System.out.println("\nTotal Bonus Payout: " +totalBonus);
        System.out.println("Total Old Salary: " +totalOldSalary);
        System.out.println("Total New Salary: " +totalNewSalary);

        // close the scanner 
        sc.close();
    }
}
