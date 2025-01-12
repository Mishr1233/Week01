/*Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following. 
 Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertYardsToFeet(double yards) => 
Method to convert yards to feet and return the value. Use following code to convert  double yards2feet = 3;
Method to convert feet to yards and return the value. Use following code to convert  double feet2yards = 0.333333;
Method to convert meters to inches and return the value. Use following code to convert  double meters2inches = 39.3701;
Method to convert inches to meters and return the value. Use following code to convert  double inches2meters = 0.0254;
Method to convert inches to centimeters and return the value. Use the following code  double inches2cm = 2.54;
*/

import java.util.Scanner;
class YardsToFeetConvertor{
	
	 public static double unitConvertorYardsToFeet(double yards) {
		// yards to feet = 3;
		 
		 
		 return yards*3;
      
    }
	 public static double unitConvertorFeetToYards(double feet) {
		
		 // feet to yards = 0.333333
         return feet*0.333333;
      
    }
	 public static double unitConvertorMeterToInches(double meters) {
				 
		  //meters to inches = 39.3701;
				 
		 return meters*39.3701;
      
    }
	 public static double unitConvertorInchesToMeter(double inches) {
		
		 //inches to meters = 0.0254;
		 
		 return inches*0.0254;
      
    }
	 public static double unitConvertorInchesToCm(double inches) {
		/* 
		 inches to cm = 2.54
		 */
		 return inches * 2.54;
      
    }
	
	public static void main(String[] args){
		
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
      // Display options to the user
        System.out.println("Select a conversion type:");
        System.out.println("1. yards to feet");
        System.out.println("2. feet to yards");
        System.out.println("3. Meters to inches");
        System.out.println("4. inches to Meters");
		System.out.println("4. inches to cm");
        System.out.print("Enter the number of your choice: ");
        
        int choice = sc.nextInt(); 

        double result;
        
        switch (choice) {
            case 1:
                // call method convert yards to feet
                System.out.print("Enter yards: ");
                double yards = sc.nextDouble();
                result = unitConvertorYardsToFeet(yards);
                System.out.println(yards + " yards is equal to " + result + " feet.");
                break;
                
            case 2:
                // call method convert feet to yards
                System.out.print("Enter feet: ");
                double feet = sc.nextDouble();
                result = unitConvertorFeetToYards(feet);
                System.out.println(feet + " miles is equal to " + result + " yards.");
                break;
                
            case 3:
                // call method convert meters to feet
                System.out.print("Enter meters: ");
                double meters = sc.nextDouble();
                result = unitConvertorMeterToInches(meters);
                System.out.println(meters + " meters is equal to " + result + " inches.");
                break;
                
            case 4:
                // call method convert inches to meters
                System.out.print("Enter inches: ");
                double inches = sc.nextDouble();
                result = unitConvertorInchesToMeter(inches);
                System.out.println(inches + " inches is equal to " + result + " meters.");
                break;
				
			case 5:
                // call method convert inches to cm
                System.out.print("Enter inches: ");
                double inches2 = sc.nextDouble();
                result = unitConvertorInchesToCm(inches2);
                System.out.println(inches2 + " inches is equal to " + result + " cm.");
                break;
                
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
		
	}
}