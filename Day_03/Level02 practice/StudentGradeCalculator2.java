import java.util.Scanner;

public class StudentGradeCalculator2 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        // ask the user how many students are there
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

      
        int[][] marks = new int[numberOfStudents][3]; 
        double[] percentages = new double[numberOfStudents]; // To store the percentage of each student
        String[] grades = new String[numberOfStudents]; // to store the grade of each student

        // loop to take input marks for each student in physics, chemistry, and maths
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");

           
            for (int j = 0; j < 3; j++) {
                int subjectMarks;
                do {
                    if (j == 0) System.out.print("Enter marks for Physics: ");
                    else if (j == 1) System.out.print("Enter marks for Chemistry: ");
                    else System.out.print("Enter marks for Maths: ");
                    
                    subjectMarks = sc.nextInt();
                    
                    if (subjectMarks < 0) {
                        System.out.println("Marks must be positive. Please try again.");
                    }
                } while (subjectMarks < 0);
                
                marks[i][j] = subjectMarks; // Store the marks for each subject
            }

            // calculate the percentage for the student
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2]; 
            percentages[i] = (totalMarks / 300) * 100; // calculate percentage

            // Calculate the grade based on the percentage
            if (percentages[i] >= 80) {
                grades[i] = "Level 4, excellent performance"; 
            } else if (percentages[i] >= 70) {
                grades[i] = "Level 3, at agency-normalized standards"; 
            } else if (percentages[i] >= 60) {
                grades[i] = "Level 2, approaching agency-normalized standards";
            } else if (percentages[i] >= 50) {
                grades[i] = "Level 1, below agency-normalized standards"; // 
            } else if (percentages[i] >= 40) {
                grades[i] = "Level 1, too below agency-normalized standards"; 
            } else {
                grades[i] = "Remedial standards"; 
            }
        }

        // Display the marks, percentages, and grades
        System.out.println("\nStudent Results:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Physics Marks: " + marks[i][0]);
            System.out.println("Chemistry Marks: " + marks[i][1]);
            System.out.println("Maths Marks: " + marks[i][2]);
            System.out.println("Percentage: " + percentages[i]);
            System.out.println("Grade: " + grades[i]);
        }

       
        sc.close();
    }
}
