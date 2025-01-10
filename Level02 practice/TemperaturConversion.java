/*Write a TemperaturConversion program, given the temperature in Celsius as input outputs the temperature in Fahrenheit
Hint => 
Create a celsius variable and take the temperature as user input
Use the Formulae Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F and assign to farenheitResult  and print the result
I/P => celcius
O/P =>  The ____ celsius is _____ fahrenheit
*/

import java.util.*;  

public class TemperaturConversion {

    public static void main(String args[]) {

        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the temperature in Celsius
        System.out.println("Enter celsius :");

        // Reading the temperature in Celsius from user input
        double celsius = sc.nextDouble();

        // Formula to convert Celsius to Fahrenheit
        // Fahrenheit = (Celsius * 9/5) + 32
        double fahrenheitResult = (celsius * 9.0 / 5.0) + 32.0;

        // Displaying the result: converting the Celsius temperature to Fahrenheit
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");
    }
}
