/*Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() 
to find the substring of the text. Finally Compare the the two strings and display the results
Hint => 
Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get 
the substring from the given text
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result
*/


import java.util.*;
public class CompareSubString{
	
	public static void main(String args []){
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter string :");
		String s1 =sc.nextLine();
		
		System.out.println("Enter start and end :");
		int start =sc.nextInt();
		int end =sc.nextInt();
		
	  resultCheck(s1,start,end);
		
		sc.close();
		
	}
	
	//creating function resultCheck
	public static void resultCheck(String s1,int start,int end){
		
		String subString1 = substringFunction(s1,start,end);
	  String subString2 = s1.substring(start,end);
	  
	  if(subString1.equals( subString2)){
		  System.out.println("Both result are same");
	  }else{
		  System.out.println("Both result are not same");
	  }
	  
	  System.out.println(subString1);
	  System.out.println(subString2);
		
	}
	
	//creating function substringFunction
	public static String substringFunction(String s1 ,int start , int end){
		StringBuilder s1Substring=new StringBuilder();
		for(int i=start;i<end;i++){
			s1Substring.append(s1.charAt(i));
		}
		
		return s1Substring.toString();
	}
}