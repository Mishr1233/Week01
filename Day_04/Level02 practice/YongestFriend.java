/*Create a program to find the young friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the friends based on their heights and display it
Hint => 
Take user sc for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Write a Method to find the young of the 3 friends
Write a Method to find the tallest of the 3 friends
*/


import java.util.*;

class YongestFriend {
	
	public static void yougestTallest(double age[],double height[],String name[]){
		
		// assume amar is yougest with this we calculating youngest age 
		double young = age[0];
		String youngestFriend = name[0];
		
		// Assume amar is tallest with this we calculate tallest height
		double tallest = height[0];
		String tallestFriend = name[0];
		
		for(int i=0;i<3;i++){
			if(young>age[i]){
				young = age[i];
				youngestFriend = name[i];
			}
			if(tallest<height[i]){
				tallest = height[i];
				tallestFriend = name[i];
			}
		}

        // Display the young friend and tall friend
        System.out.println("The young friend is " + youngestFriend + " with age " + young);
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallest);
		
	}
	
	
    public static void main(String[] args) {
		
        // Creating the Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
		// creating Age and Height array for 3 friends
		double age[] = new double[3];
		double height[] = new double[3];
		String name[] = {"Amar","Akbar","Anthony"};
		
		
		
		for(int i=0;i<3;i++){
			  
	   System.out.print("Enter the Age "+name[i] +" : ");
	  
	   // Taking variable age as sc for user
	    age[i] = sc.nextDouble();
	  
	    System.out.print("Enter the height "+name[i]+" : ");
	  
	     // Taking variable height as input for user
	    height[i] = sc.nextDouble();
		}
		yougestTallest( age, height, name);
    }
}