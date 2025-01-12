/*Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertFarhenheitToCelsius(double farhenheit) => 
Method to convert Fahrenheit to Celsius and return the value. Use the following code  double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
Method to convert Celsius to Fahrenheit and return the value. Use the following code  double celsius2farhenheit = (celsius * 9 / 5) + 32;
Method to convert pounds to kilograms and return the value. Use the following code  double pounds2kilograms = 0.453592;
Method to convert kilograms to pounds and return the value. Use the following code  double kilograms2pounds = 2.20462; 
Method to convert gallons to liter and return the value. Use following code to convert   double gallons2liter = 3.78541; 
Method to convert liter to gallons and return the value. Use following code to convert  double liter2gallons = 0.264172; 
*/

import java.util.Scanner;

public class TemperatureConverterCalculator {

    
    public static double convertFahrenheitToCelsius(double fahrenheit) {
		// Converting  Fahrenheit to Celsius
        return (fahrenheit - 32) * 5 / 9;
    }

    
    public static double convertCelsiusToFahrenheit(double celsius) {
		// Converting  Celsius to Fahrenheit
        return (celsius * 9 / 5) + 32;
    }

    // Converting pounds to kilograms
    public static double convertPoundsToKg(double pounds) {
        // pounds to kilograms = 0.453592
        return pounds * 0.453592;
    }

   
    public static double convertKgToPounds(double kilograms) {
        // kilograms to pounds = 2.20462;
        return kilograms * 2.20462;
    }

   
    public static double convertGallonsToliter(double gallons) {
       //  gallons to liter = 3.78541;
        return gallons * 3.78541;
    }

    
    public static double convertLiterToGallons(double liter) {
        //double liter to gallons = 0.264172;
        return liter * 0.264172;
    }

    public static void main(String[] args) {
        // Creating Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Display menu to the user
       
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to liter");
        System.out.println("6. liter to Gallons");
        System.out.print("Please select the conversion type ");
        
        int choice = sc.nextInt();  

        double result ;

        // Switch statement for different conversions
        switch (choice) {
            case 1:
                // Fahrenheit to Celsius conversion
                System.out.print("Enter temperature in fahrenheit ");
                double fahrenheit = sc.nextDouble();
                result = convertFahrenheitToCelsius(fahrenheit);
                System.out.println(fahrenheit + " fahrenheit is equal to " + result + " celsius ");
                break;

            case 2:
                // Celsius to Fahrenheit conversion
                System.out.print("Enter temperature in celsius ");
                double celsius = sc.nextDouble();
                result = convertCelsiusToFahrenheit(celsius);
                System.out.println(celsius + " celsius is equal to " + result + " fahrenheit ");
                break;

            case 3:
                // Pounds to Kilograms conversion
                System.out.print("Enter weight in pounds ");
                double pounds = sc.nextDouble();
                result = convertPoundsToKg(pounds);
                System.out.println(pounds + " pounds is equal to " + result + " kilograms ");
                break;

            case 4:
                // Kilograms to Pounds conversion
                System.out.print("Enter weight in Kilograms ");
                double kilograms = sc.nextDouble();
                result = convertKgToPounds(kilograms);
                System.out.println(kilograms + " kilograms is equal to " + result + " pounds ");
                break;

            case 5:
                // Gallons to liter conversion
                System.out.print("Enter volume in Gallons ");
                double gallons = sc.nextDouble();
                result = convertGallonsToliter(gallons);
                System.out.println(gallons + " gallons is equal to " + result + " liter ");
                break;

            case 6:
                // liter to Gallons conversion
                System.out.print("Enter volume in liter ");
                double liter = sc.nextDouble();
                result = convertLiterToGallons(liter);
                System.out.println(liter + " liter is equal to " + result + " gallons ");
                break;

            default:
                System.out.println("invalid choice");
        }

    }
}
