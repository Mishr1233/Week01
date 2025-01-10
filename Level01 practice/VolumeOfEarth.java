/*Write a Program to compute the volume of Earth in km^3 and miles^3
Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____
*/


import java.util.*;
public class VolumeOfEarth{
	
	public static void main(String args[]){
		
		//create a vairable radius
		int radius=6378;
		
		//create a vairable earthVolumeKM
		double earthVolumeKM= (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		
		//createa vairable earthVolumeMile
		double earthVolumeMile=earthVolumeKM * 0.239913;
		
		 System.out.printf("The volume of Earth in cubic kilometers is %.2f and cubic miles is %.2f ", earthVolumeKM, earthVolumeMile);
		
	}
	
	
	
	
}
