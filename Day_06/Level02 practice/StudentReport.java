/*Program to Simulate Student Report
Problem Statement: Create a Student class with attributes name, rollNumber, and marks. Add two methods:
To calculate the grade based on the marks.
To display the student's details and grade.
Explanation: The Student class organizes all relevant details about a student as attributes. 
Methods are used to calculate the grade and provide a way to display all information.
*/

import java.util.Scanner;

public class StudentReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accepting user input
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();

        int marks[] = new int[3];
        System.out.println("Enter marks for 3 subjects:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        Student s1 = new Student(name, rollNumber, marks);

        // Calculate percentage
        double percentage = s1.calculatePercent(marks);
        s1.display(percentage);

        sc.close();
    }
}

class Student {
    String name;
    int rollNumber;
    int[] marks;

    // Constructor of class Student;
    Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    char GradeCalculate(double percentage) {
        if (percentage <= 100 && percentage >= 75) {
            return 'A';
        } else if (percentage < 75 && percentage >= 60) {
            return 'B';
        } else if (percentage < 60 && percentage >= 50) {
            return 'C';
        } else {
            return 'D';
        }
    }

    double calculatePercent(int[] marks) {
        return (marks[0] + marks[1] + marks[2]) / 3.0;
    }

    // dislay result
    void display(double percentage) {
        System.out.println("Student name is: " + this.name);
        System.out.println("Student roll number is: " + this.rollNumber);
        System.out.println("Student marks are: ");
        for (int mark : this.marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nStudent grade is: " + GradeCalculate(percentage));
    }
}
