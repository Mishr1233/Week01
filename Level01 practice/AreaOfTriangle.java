/*Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height
I/P => base, height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
*/

import java.util.*;
public class AreaOfTriangle{
	
	public static void main(String args[]){
		
	Scanner sc =new Scanner(System.in);
	
	//print message for user
	System.out.println("Enter base of triangle in centimeters : ");
	
	//create a variable base 
	double base=sc.nextDouble();
	
	System.out.println("Enter height of triangle in centimeters : ");
	
	//create a variable height
	double height=sc.nextDouble();
	
    //calculate area in centimeters and store
    double areaOfTriangleInCm =	1.0/2.0*base*height;
	
	//calculate area in Inches and store 
	double areaOfTriangleInInches= areaOfTriangleInCm * 0.155;
	
	System.out.println("Your Area in cm is "+areaOfTriangleInCm+" and inches is "+ areaOfTriangleInInches);
		
		
	}
	
	
}