/*Write a program to calculate various trigonometric functions using Math class given an angle in degrees
Hint => 
Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
public double[] calculateTrigonometricFunctions(double angle)
*/


import java.util.*; 

public class TrigonometricFunctions {

    
    public static void main(String args[]) {
        
       
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter angle in degrees :");
        double angle = sc.nextDouble();
		
		double array[] = calculateTrigonometricFunctions(angle);
		
		System.out.println("Sine: " + array[0] + " cosine "+array[1]+ " tangent "+array[2]);
		
		sc.close();
	}
	
	
		
		public static double[] calculateTrigonometricFunctions(double angle) {
        // convert angle from degree to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return the results as an array
        return new double[]{sine, cosine, tangent};
    }
}
		
		
