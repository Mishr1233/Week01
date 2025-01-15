/*Write a program to find and return the length of a string without using the length() method 
Hint => 
Take user input using the Scanner next() method 
Create a method to find and return a string's length without using the built-in length() method. 
The logic for this is to use the infinite loop to count each character till the charAt() method throws a runtime exception, 
handles the exception, and then return the count
The main function calls the user-defined method as well as the built-in length() method and displays the result
*/


import java.util.*;
public class StringLength{
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner (System.in);
		//taking user input
		System.out.println("Enter a String :");
		String str =sc.nextLine();
		
		int length1=lengthOfString(str);
		int length2 =str.length();
		
		if(length1 == length2){
			System.out.println("Both result are same ");
		}else{
			System.out.println("Both result are not same ");
		}
		
		
		sc.close();
	}
	
	public static int lengthOfString(String str){
		int i=0,count=0;
		 try {
            while (true) {
                str.charAt(count);  // Accessing characters one by one
                count++;  
            }
		}catch(StringIndexOutOfBoundsException e){
			
			return count;
		}
	}
}