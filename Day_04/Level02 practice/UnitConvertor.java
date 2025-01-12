/*Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following. 
 Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertKmToMiles(double km) => 
Method To convert kilometers to miles and return the value. Use the following code  double km2miles = 0.621371;
Method to convert miles to kilometers and return the value. Use the following code  double miles2km = 1.60934;
Method to convert meters to feet and return the value. Use the following code to convert  double meters2feet = 3.28084;
Method to convert feet to meters and return the value. Use the following code to convert  double feet2meters = 0.3048;
*/


import java.util.*;

public class UnitConvertor {

    public static void main(String[] args) {

        // Creating a scanner to take user input
        Scanner sc = new Scanner(System.in);
	   
        // hint user to input a number
        System.out.println("Enter a number :");
        double unitValue = sc.nextDouble();
		
		double miles = convertKmToMiles( unitValue);
		double kilometers = convertMilesToKm(miles);
		double meterValue = unitValue * 1000;
		double feet = convertMeters2Feet(meterValue);
		double feet2meters =convertFeet2Meters(feet); 
		
		System.out.println("Km to miles value is "+miles);
		System.out.println("miles to km value is "+kilometers);
		System.out.println("meter to feet value is "+feet);
		System.out.println("feet to meters  value is "+feet2meters);
		
		sc.close();
	}
	
	// converting km to miles .
	public static double convertKmToMiles(double value){
		
		double miles = value * 0.621371;
		return miles;
	}
	
	//converting miles to km .
	public static double convertMilesToKm(double value){
		
		double kilometers = value * 1.60934;
		return kilometers;
	} 
	//converting meters to feet .
	public static double convertMeters2Feet(double meterValue){
	    double feet = meterValue * 3.28084;
		
		return feet;
		
	}
	//converting feet to meters .
	public static double convertFeet2Meters(double feetValue){
		
		double feet2meters = feetValue * 0.3048;
		return feet2meters;
		
	}
	
	
	
	
}