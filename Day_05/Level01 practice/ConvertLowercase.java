/*Write a program to convert the complete text to lowercase and compare the results
Hint => 
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is lowercase to the Upper Case.
 Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so 
 the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toUpperCase() to get the Uppercase Text and compare the two strings using the user-defined method. And finally display the result
Write a program to split the text into words and return the words along with their lengths in a 2D array
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to to find and return the length of a string without using the length() method. 
Create a method to take the word array and return 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
The main function calls the user-defined method and display the result in a tabular format. During display make sure to convert the length value from String to Integer and then display
*/



import java.util.*;
public class ConvertLowercase{
	
	public static void main(String args []){
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter string :");
		String s =sc.nextLine();
		
		String lowercaseString =lowecaseConversion(s);
		String lowercaseString1=s.toLowerCase();
		
		boolean check =compareString(lowercaseString,lowercaseString1);
		if(check){
			System.out.println("Both result are same");
		}else{
			System.out.println("Both result are not same");
		}
		
		sc.close();
		}
		
		
		//create lowecaseConversion function
		public static String lowecaseConversion(String s1){
			
			StringBuilder sb =new StringBuilder();
			
			for(int i=0;i<s1.length();i++){
				int value = (int) s1.charAt(i);
				if(value>=65 && value<=90){
					sb.append((char)(value+32));
					
				}else{
					sb.append((char)value);
				}
				
			}
			return sb.toString();
			
		}
		
		
		
		//create function compareString
		public static boolean compareString(String s1,String s2){
			
			if(s1.equals(s2)){
				return true;
				
			}else{
				return false;
			}
		}
	}