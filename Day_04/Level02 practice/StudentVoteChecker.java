/*Write a program to take user sc for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
Create a class public class StudentVoteChecker and define a method public boolean canStudentVote(int age) which takes in age as a parameter and returns true or false
Inside the method firstly validate the age for a negative number, if a negative return is false cannot vote. For valid age check for age is 18 or above return true; else return false;
In the main function define an array of 10 integer elements, loop through the array by take user sc for the student's age, call canStudentVote() and display the result
*/



import java.util.Scanner;
class StudentVoteChecker{
	
	public static boolean canStudentVote(int age){
		// check age is not negative or not
	if (age < 0) {
            return false;
        }
        // Check age is 18 or above 
        return age >= 18;
    }
		
	
	public static void main(String[] args){
		
	  // Creating Scanner object to take input from user
	  Scanner sc = new Scanner(System.in);
	  
	  // creating an array of ages
	  int age[] = new int[10];
	  
	  // loop for get student age
	  for(int currentPostion=0; currentPostion<age.length;currentPostion++){
        
		// taking Student Age as sc
		System.out.print("\nEnter student age : "+(currentPostion+1)+" ");
	    age[currentPostion]= sc.nextInt();
	  }
	  
        // check eligibility for voting
	    for(int currentPostion=0; currentPostion<age.length;currentPostion++){
			boolean results = canStudentVote(age[currentPostion]);
		
		if(results){
			
			System.out.println("The student with the age "+age[currentPostion]+" can vote ");
		}
		else{
			
			System.out.println("The student with the age "+age[currentPostion]+" cannot vote ");
		}
	  }
	}
}
		
       	   
	  