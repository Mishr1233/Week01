/*Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade as shown in figure below

Hint => 
Write a method to generate random 2-digit scores for Physics, Chemistry and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using Math.round() method
Write a Method to calculate the grade based on the percentage as shown in the ref table and return a 2D array of students' grade
Finally write a Method to display the scorecard of all students with their scores, total, average, percentage, and grade in a tabular format. 
*/




import java.util.Scanner;

public class StudentScoreCalculate {

    // Method to generating random 2-digit scores for Physics, Chemistry, and Maths
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0]=(int) (Math.random() * 100);  // Physics score
            scores[i][1] =(int) (Math.random() * 100);  // Chemistry score
            scores[i][2]=(int) (Math.random() * 100);  // Maths score
        }
        return scores;
    }

    // Method to calculating total, average, and percentage for each student
    public static double[][] calculateAveragePercentage(int[][] scores) {
        double[][] results = new double[scores.length][4]; 

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;  
            results[i][2] = Math.round(percentage * 100.0) / 100.0;  // Round to 2 decimal places
        }

        return results;
    }

    // Method to calculating remarks based on percentage
    public static String[] calculateRemarks(double[][] results) {
        String[] remarks = new String[results.length];
        
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];

            if (percentage >= 80) {
                remarks[i] = "A (Level 4, above agency-normalized standards)";
            } else if (percentage >= 70) {
                remarks[i] = "B (Level 3, at agency-normalized standards)";
            } else if (percentage >= 60) {
                remarks[i] = "C (Level 2, below, but approaching agency-normalized standards)";
            } else if (percentage >= 50) {
                remarks[i] = "D (Level 1, well below agency-normalized standards)";
            } else if (percentage >= 40) {
                remarks[i] = "E (Level 1-, too below agency-normalized standards)";
            } else {
                remarks[i] = "R (Remedial standards)";
            }
        }

        return remarks;
    }

  
    public static void displayScorecard(int[][] scores, double[][] results, String[] remarks) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-50s\n", "Student", "Physics", "Chemistry", "Maths", "Total", "Percentage", "Remarks");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10s %-10d %-10d %-10d %-10.2f %-10.2f %-50s\n", 
                              "Student " + (i + 1),
                              scores[i][0], 
                              scores[i][1], 
                              scores[i][2], 
                              results[i][0], 
                              results[i][2], 
                              remarks[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Generating random scores for the students
        int[][] scores = generateScores(n);

        // Calculating total, average, and percentage for each student
        double[][] results = calculateAveragePercentage(scores);

        // Calculating remarks based on percentage
        String[] remarks = calculateRemarks(results);

       
        displayScorecard(scores, results, remarks);

        sc.close(); 
    }
}
