/*Program to Display Employee Details
Problem Statement: Write a program to create an Employee class with attributes name, id, and salary. Add a method to display the details.
*/


class Employee {

    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee name is: " + this.name);
        System.out.println("Employee id is: " + this.id);
        System.out.println("Employee salary is: " + this.salary);
    }
}

public class EmployeDetail {
    public static void main(String[] args) {
        Employee employee = new Employee("Shiv Shankar Mishra", 154, 5000000);
        employee.display();
    }
}




