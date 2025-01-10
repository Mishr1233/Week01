/*Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => Simple Interest = Principal * Rate * Time / 100
I/P => principal, rate, time
O/P => The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___
*/



import java.util.*;  

public class SimpleInterest {
    
    public static void main(String args[]) {
        
        // Create a scanner object 'sc' to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Ask for the principal amount
        System.out.println("Enter principal :");
        double principal = sc.nextDouble();  // Read the principal from the user
        
        // Ask for the rate of interest
        System.out.println("Enter rate :");
        double rate = sc.nextDouble();  // Read the rate of interest from the user
        
        // Ask for the time duration
        System.out.println("Enter time :");
        double time = sc.nextDouble();  // Read the time period from the user
        
        // Calculate the Simple Interest
        double simpleInterest = (principal * rate * time) / 100.0;
        
        // Print the calculated Simple Interest along with the entered details
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
    }
}
