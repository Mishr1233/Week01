/*Write a program to split the text into words and find the shortest and longest strings in a given text
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf()
 to generate the String value for the number
Create a Method that takes the 2D array of word and corresponding length as parameters, find the shortest and longest string and return them in an 1D int array. 
The main function calls the user-defined methods and displays the result. 
*/




import java.util.Scanner;

public class WordsCompare {

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

    // Method to find and return the length of a string without using length() method
    public static String wordsLengths(String word) {
        int length = 0;
        for (int i = 0; i < word.length(); i++) {
            length++;
        }
        return String.valueOf(length); // Return length as string
    }

    // Method to create a 2D array with words and corresponding lengths
    public static String[][] getwordsAndLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i]; // Store the word
            result[i][1] = wordsLengths(words[i]); // Store length of word as a string
        }
        return result;
    }

    // method to finding the shortest and longest word from the 2D array
    public static int[] findShortAndLongString(String[][] wordsAndLengths) {
        int shortestIndex = 0, longestIndex = 0;
        int shortestLength = Integer.parseInt(wordsAndLengths[0][1]);
        int longestLength = Integer.parseInt(wordsAndLengths[0][1]);

        for (int i = 1; i < wordsAndLengths.length; i++) {
            int currentLength = Integer.parseInt(wordsAndLengths[i][1]);
            if (currentLength < shortestLength) {
                shortestLength = currentLength;
                shortestIndex = i;
            }
            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestIndex = i;
            }
        }

        // Return the indices of the shortest and longest words
        return new int[] { shortestIndex, longestIndex };
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner object for user input

        // Take user input for the text
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        // Split the input text into words
        String[] words = stringWord(input);

        // words with their lengths
        String[][] wordsAndLengths = getwordsAndLengths(words);

        // find the shortest and longest word
        int[] result = findShortAndLongString(wordsAndLengths);

       
        System.out.println("Shortest word: " + wordsAndLengths[result[0]][0] + " (Length: " + wordsAndLengths[result[0]][1] + ")");
        System.out.println("Longest word: " + wordsAndLengths[result[1]][0] + " (Length: " + wordsAndLengths[result[1]][1] + ")");

        sc.close(); 
    }
}
