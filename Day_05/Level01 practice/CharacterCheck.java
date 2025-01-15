/*Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method,
 and display the result
Hint => 
Take user input using the  Scanner next() method to take the text into a String variable
Write a method to return the characters in a string without using the toCharArray() 
Write a method to compare two string arrays and return a boolean result
In the main() call the user-defined method and the String built-in ​​toCharArray() method, compare the 2 arrays, and finally display the result
*/



import java.util.*;
public class CharacterCheck{
	
	public static void main(String args []){
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter string :");
		String s1 =sc.nextLine();
		
		char charArray[] = charArrayFunction(s1);
		char charArray2[] =s1.toCharArray();
		
		if(compareString(charArray,charArray2)){
			System.out.println("Both result are same");
			
		}else{
			System.out.println("Both result are not same");
			
		}
		
		sc.close();
	}
	
	//create function charArrayFunction
	public static char[] charArrayFunction(String s1){
		
		char charArray[]=new char[s1.length()];
		
		for(int i=0;i<s1.length();i++){  //store string character in chararray ;
			charArray[i]=s1.charAt(i);
		}
		return charArray;
		
	}
	
	//create function compareString
	public static boolean compareString(char s1[],char s2[]){
		
		if(Arrays.equals(s1,s2)){
			return true;
			
		}else{
			return false;
		}
		
	}
}