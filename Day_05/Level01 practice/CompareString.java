/*Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
Hint => 
Take user input using the  Scanner next() method for 2 String variables
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String Built-In method to check if the results are the same and display the result 
*/


import java.util.*;
public class CompareString{
	
	public static void main(String args []){
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter string1 :");
		String s1 =sc.nextLine();
		
		System.out.println("Enter string2 :");
		String s2 =sc.nextLine();
		
		boolean check =s1.equals(s2);
		boolean check1 =stringEquals(s1,s2); //check by method
		
		if(check == check1){
			System.out.println("Both result are same");
			
		}else{
			System.out.println("Both result are not same");
		}
		
		sc.close();
		
		
	}
	
	//create stringEquals function
	public static boolean stringEquals(String s1 , String s2){
		
		if(s1.length() != s2.length()){
			return false;
		}else{
		
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)== s2.charAt(i)){
				continue;
			}else{
				return false;
			}
		}
		return true;
		
		}
		
	}
	
	

}