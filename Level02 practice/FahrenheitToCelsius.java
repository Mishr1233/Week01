/*Write a TemperaturConversion program, given the temperature in Fahrenheit as input outputs the temperature in Celsius
Hint => 
Create a fahrenheit variable and take the user's input
User the formulae to convert Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C and assign the result to celsiusResult  and print the result
I/P => fahrenheit
O/P => The ____ fahrenheit is _____ celsius
*/




import java.util.*;  

public class FahrenheitToCelsius {

    public static void main(String args[]) {

        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the temperature in Fahrenheit
        System.out.println("Enter Fahrenheit :");

        // Reading the temperature in Fahrenheit from user input
        double Fahrenheit = sc.nextDouble();

        // Formula to convert Fahrenheit to Celsius
        // Celsius = (Fahrenheit - 32) * 5/9
        double celsiusResult = (Fahrenheit - 32.0) * 5.0 / 9.0;

        // Displaying the result: converting the Fahrenheit temperature to Celsius
        System.out.println("The " + Fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius");
    }
}
