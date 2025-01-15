/*Write a program to find the frequency of characters in a string using unique characters and display the result
Hint => 
Create a method to Find unique characters in a string using charAt() method and return them as 1D array.  Use Nested Loops to find the unique characters in the text
Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 2D array. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Call the uniqueCharacters() method to find the unique characters in the text
Create a 2D String array to store the unique characters and their frequencies. 
Loop through the unique characters and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays result.  
*/






import java.util.Scanner;

public class FrequencyOfCharacter2 {

    // Method to finding unique characters in a string
    public static char[] uniqueCharacters(String text) {
        // Create a boolean array to check if a character is already in the unique characters list
        boolean[] visited = new boolean[256];
        StringBuilder uniqueChars = new StringBuilder();

        // Loop through the string to find unique characters
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!visited[ch]) {
                visited[ch] = true;
                uniqueChars.append(ch);
            }
        }

        // Convert StringBuilder to char array
        return uniqueChars.toString().toCharArray();
    }

    // Method to finding the frequency of unique characters in the string
    public static String[][] findCharacterFrequency(String text) {
       
        int[] freq = new int[256];

      
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Get the unique characters using the uniqueCharacters() method
        char[] uniqueChars = uniqueCharacters(text);

        // Creating a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

      
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);  // Store character
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);   // Store frequency
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();

        // Call the method to find character frequencies
        String[][] frequencies = findCharacterFrequency(inputText);

        // Display the result
        System.out.println("\nUnique characters and their frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println(frequencies[i][0] + " -> " + frequencies[i][1]);
        }

        sc.close();
    }
}
