/*Find unique characters in a string using charAt() method and display the result
Hint => 
Create a Method to find the length of the text without using the String method length()
Create a method to Find unique characters in a string using charAt() method and return them as 1D array. The logic used here is as follows:
Create an array to store the unique characters in the text. The size is the length of the text
Loops to Find the unique characters in the text. Find the unique characters in the text using a nested loop. An outer loop iterates through each character and an inner loop checks if the character is unique by comparing it with the previous characters. If the character is unique, it is stored in the result array
Create a new array to store the unique characters 
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 
*/




import java.util.Scanner;

public class FindUniqueCharactersInString {

    // Method to finding the length of the string without using the String method length()
    public static int findLength(String text) {
        int length = 0;
        while (true) {
            try {
                text.charAt(length);  
                length++; 
            } catch (StringIndexOutOfBoundsException e) {
                break;  
            }
        }
        return length;
    }

    // Method to finding unique characters using charAt()
    public static char[] findUniqueCharacter(String text) {
        int len = findLength(text);  // Get the length of the string
        char[] uniqueChars = new char[len];  // Array to store unique characters
        int uniqueCount = 0;  // To keep track of the number of unique characters

        for (int i = 0; i < len; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the current character has already been added to the result
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;  // No need to check further
                }
            }

            // If the character is unique, add it to the result array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a final array to return the unique characters
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    // Main method to take user input, call methods, and display results
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacter(input);

        // Display the result
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        scanner.close();
    }
}
