/*Write a program to split the text into words and return the words along with their lengths in a 2D array
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length.
 Use String built-in function String.valueOf() to generate the String value for the number
The main function calls the user-defined method and displays the result in a tabular format. During display make sure to convert the length value from String to Integer and then display
*/




import java.util.Scanner;

public class StringSplit2 {
    
    // Method to spliting the text into words
 public static String[] stringWord(String str) {
        int length = str.length();  // Get the length of the string
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
    
   

    // Method to create a 2D array with word and length
    public static String[][] wordsLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // Store the word
            result[i][1] = lengthOfString(words[i]); // Store the length of the word as a string
        }
        return result;
    }

    // method to display the 2D array in tabular format
    public static void displyWords(String[][] wordsWithLengths) {
        System.out.println("Word\tLength");
        for (int i = 0; i < wordsWithLengths.length; i++) {
            // Convert the length string to integer and display
            System.out.println(wordsWithLengths[i][0] + "\t" + Integer.parseInt(wordsWithLengths[i][1]));
        }
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        // Taking user input
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        // Spliting the input text into words
        String[] words = stringWord(input);

        // Get words with their lengths
        String[][] wordsWithLengths = wordsLengths(words);

        // Display the result in tabular format
        displyWords(wordsWithLengths);

        sc.close();  
    }
	
	
	public static String lengthOfString(String str){
		int i=0,count=0;
		 try {
            while (true) {
                str.charAt(count);  // Accessing characters one by one
                count++;  
            }
		}catch(StringIndexOutOfBoundsException e){
			
			return String.valueOf(count);
		}
	}
}
