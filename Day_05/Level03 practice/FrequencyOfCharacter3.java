/*Write a program to find the frequency of characters in a string using nested loops and display the result
Hint => 
Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 1D array. The logic used here is as follows:
Create an array to store the frequency of each character in the text and an array to store the characters in the text using the toCharArray() method
Loops to Find the frequency of each character in the text and store the result in an frequency array. For this use Nested Loop with Outer loop to iterate through each character in the text and initialize the frequency of each character to 1. And an Inner loop to check for duplicate characters. In case of duplicate increment the frequency value and set the duplicate characters to '0' to avoid counting them again.
Create an 1D String array to store the characters and their frequencies. For this Iterate through the characters in the text and store the characters and their frequencies 
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 
*/




import java.util.Scanner;

public class FrequencyOfCharacter3 {

    // Method to finding the frequency of characters in a string using nested loops
    public static String[] findCharacterFrequency(String text) {
        // Convert the string to a character array
        char[] characters = text.toCharArray();
        int length = characters.length;

        // Array to store the frequency of each character
        int[] frequency = new int[length];

        // 1D array to store the result (characters and their frequencies)
        String[] result = new String[length];
        
      
        for (int i = 0; i < length; i++) {
            // Skip already counted characters
            if (characters[i] == '0') {
                continue;
            }
            
       
            frequency[i] = 1;
            
            // Nested loop to check for duplicate characters
            for (int j = i + 1; j < length; j++) {
                // If characters match, increment frequency and mark the duplicate as '0'
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0'; // Mark this character as counted
                }
            }
        }

        // Store the characters and their frequencies in the result array
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (characters[i] != '0') {
                result[index] = characters[i] + " -> " + frequency[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String inputText = sc.nextLine();

        // Call the method to find character frequencies
        String[] frequencies = findCharacterFrequency(inputText);

        // Display the result
        System.out.println("\nCharacter frequencies in the string:");
        for (String frequency : frequencies) {
            if (frequency != null) {
                System.out.println(frequency);
            }
        }

        sc.close();
    }
}
