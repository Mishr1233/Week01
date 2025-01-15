/*Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
Create a method to define the random 2 digit age of number of students provided as method parameters and return 1D array of age of n students
Create a method which takes in array of age as a parameter and returns 2D String array of age and boolean true or false to indicate can vote and cannot vote. Inside the method firstly validate the age for a negative number, if a negative cannot vote. For valid age check for age is 18 or above to settrue to indicate can vote.
Create a method to display the 2D array in a tabular format.
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
*/



import java.util.Scanner;

public class StudentsVotingEligibility {

    // Method to generating random ages for n students
    public static int[] generateRandomAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int)(Math.random() * 100);  
        }
        return ages;
    }

    // Method to checking if students can vote based on their ages
    public static String[][] VotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
         
            if (ages[i] < 0) {
                result[i][0] = Integer.toString(ages[i]);
                result[i][1] = "Cannot Vote (Invalid Age)";
            } else {
                result[i][0] = Integer.toString(ages[i]);
                // Check if age is 18 or greater for voting eligibility
                if (ages[i] >= 18) {
                    result[i][1] = "Can Vote";
                } else {
                    result[i][1] = "Cannot Vote";
                }
            }
        }

        return result;
    }

   
    public static void VotingEligibilityPrint(String[][] result) {
        System.out.print("\nAge \t\tVoting Eligibility");
      
        for (int i = 0; i < result.length; i++) {
            System.out.print("\n"+ result[i][0]+"\t\t"+ result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for number of students
        System.out.print("Enter the number of students (max 10): ");
        int n = sc.nextInt();
        if (n < 1 || n > 10) {
            System.out.println("Number of students should be between 1 and 10.");
            return;
        }

        // Generate random ages for the students
        int[] ages = generateRandomAges(n);

        // Check voting eligibility
        String[][] eligibility = VotingEligibility(ages);

       
          VotingEligibilityPrint(eligibility);

        sc.close(); 
    }
}
