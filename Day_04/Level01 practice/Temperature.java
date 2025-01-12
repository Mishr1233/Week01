/*Write a program calculate the wind chill temperature given the temperature and wind speed
Hint => 
Write a method to calculate the wind chill temperature using the formula 
windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed0.16 
public double calculateWindChill(double temperature, double windSpeed)
*/


import java.util.*; 

public class Temperature {

    
    public static void main(String args[]) {
        
       
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter temperature :");
        int temperature= sc.nextInt();
		
		System.out.println("Enter windSpeed :");
        int windSpeed = sc.nextInt();
		
		System.out.println("windChill temperature is "+calculateWindChill(temperature,  windSpeed));
		
		sc.close();
		
		
		
	}
	
	public static double calculateWindChill(double temperature, double windSpeed){
		
	double windChill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * windSpeed * 0.16 ;
	
	return windChill;
	}
}