/*Write a program to split the text into words, compare the result with the split() method and display the result 
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to find the length of the String without using the built-in length() method. 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method 
and return the words. Use the following logic
Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
Then Create an array to store the words and use the indexes to extract the words
Create a method to compare the two String arrays and return a boolean
The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare
 the two string arrays and display the result
*/



import java.util.*;
public class StringSplit{
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner (System.in);
		//taking user input
		System.out.println("Enter a String :");
		String str =sc.nextLine();
		
		int length=lengthOfString(str);
		String []words =stringWord(str);
		String []words1= str.split(" ", -2);
		
		
		if(Arrays.equals(words,words1)){
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
	
	
	
  public static String[] stringWord(String str) {
        int length = lengthOfString(str);  // Get the length of the string
        int wordCount = 1;  
        int[] spaceIndexe = new int[length]; 
        
        // Find indexes of spaces
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexe[spaceCount++] = i;
                wordCount++;
            }
        }
        
        // Create the array to store words
        String[] words = new String[wordCount];
        int startIndex = 0;
        int wordIndex = 0;
        
        // find words based on the space indexes
        for (int i = 0; i < wordCount-1 ; i++) {
            int spaceIndex = spaceIndexe[i];
            words[wordIndex++] = str.substring(startIndex, spaceIndex);  
            startIndex = spaceIndex + 1;  // Start from the next character after the space
        }
        
        // The last word 
        words[wordIndex] = str.substring(startIndex); 
        
        return words;
    }




	
}

