/*Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” 
otherwise prints “Not a Spring Season”. 
Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring season and return a boolean true or false 
*/


import java.util.*;
public class SpringSeason{
	public static void main(String args []){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a month :");
		int month =sc.nextInt();
		
		System.out.println("Enter a day :");
		int day =sc.nextInt();

		SpringSeason season = new SpringSeason();
		System.out.println(season.seasonCheck(month,day));
		
		
		sc.close();
	}
	
	public boolean seasonCheck(int month, int day){
		 // Check if the month and day fall within the Spring season 
        if ((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
            return true;
        } else {
            return false;
        }
	}
}
