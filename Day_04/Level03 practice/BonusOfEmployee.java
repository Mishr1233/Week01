/*Create a program to find the bonus of 10 employees based on their years of service as well as the total bonus amount the 10-year-old company Zara has to pay as a bonus, along with the old and new salary.
Hint => 
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Create a Method to determine the Salary and years of service and return the same. Use the Math.random() method to determine the 5-digit salary for each employee and also use the random method to determine the years of service. Define 2D Array to save the salary and years of service.
Write a Method to calculate the new salary and bonus based on the logic defined above and return the new 2D Array of the latest salary and bonus amount 
Write a Method to Calculate the sum of the Old Salary, the Sum of the New Salary, and the Total Bonus Amount and display it in a Tabular Format
*/





import java.util.Random;


class BonusOfEmployee {
  
  
  //generateSalaryAndYears create function
    public static int[][] generateSalaryAndYears(int numEmployees) {
        Random rand = new Random();
        int[][] employeeData = new int[numEmployees][2];

        for (int i = 0; i < numEmployees; i++) {
            employeeData[i][0] = 10000 + rand.nextInt(90000);  // Random 5-digit salary
            employeeData[i][1] = 1 + rand.nextInt(20);  // Random years of service between 1 and 20
        }
        return employeeData;
    }


//calculateBonusAndNewSalary create function
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] resultData = new double[employeeData.length][3];  // [Old Salary, Bonus, New Salary]

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonus = (yearsOfService > 5) ? 0.05 * oldSalary : 0.02 * oldSalary;
            double newSalary = oldSalary + bonus;

            resultData[i][0] = oldSalary;
            resultData[i][1] = bonus;
            resultData[i][2] = newSalary;
        }
        return resultData;
    }

//displaySalaryDetails create function
    public static void displaySalaryDetails(double[][] resultData) {
        double oldSalarySum = 0, newSalarySum = 0, totalBonus = 0;

        System.out.println("Employee Salary Details:");
        System.out.println("Old Salary\tBonus\tNew Salary");

        for (double[] employee : resultData) {
            oldSalarySum += employee[0];
            totalBonus += employee[1];
            newSalarySum += employee[2];
            System.out.printf("%d\t\t%.2f\t%.2f\n", (int) employee[0], employee[1], employee[2]);
        }

        System.out.println("\nTotal Old Salary: " + oldSalarySum);
        System.out.println("Total New Salary: " + newSalarySum);
        System.out.println("Total Bonus: " + totalBonus);
    }

    public static void main(String[] args) {
        int numEmployees = 10;
        int[][] employeeData = generateSalaryAndYears(numEmployees);
        double[][] resultData = calculateBonusAndNewSalary(employeeData);
        displaySalaryDetails(resultData);
    }
}
