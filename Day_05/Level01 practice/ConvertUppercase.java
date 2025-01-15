/*09  Write a program to convert the complete text to uppercase and compare the results
Hint => 
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is lowercase to the Upper Case.
 Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toLowerCase() to get the Uppercase Text and compare the two strings using the user-defined method. 
And finally display the result
*/



import java.util.*;
public class ConvertUppercase{
	
	public static void main(String args []){
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter string :");
		String s =sc.nextLine();
		
		String uppercaseString =uppercaseConversion(s);
		String uppercaseString1=s.toUpperCase();
		
		boolean check =compareString(uppercaseString,uppercaseString1);
		if(check){
			System.out.println("Both result are same");
		}else{
			System.out.println("Both result are not same");
		}
		
		sc.close();
		}
		
		
		//create uppercaseConversion function
		public static String uppercaseConversion(String s1){
			
			StringBuilder sb =new StringBuilder();
			
			for(int i=0;i<s1.length();i++){
				int value = (int) s1.charAt(i);
				if(value>=97 && value<=122){
					sb.append((char)(value-32));
					
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