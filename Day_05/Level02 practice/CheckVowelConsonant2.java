/*Write a program to find vowels and consonants in a string and display the character type - Vowel, Consonant, or Not a Letter
Hint => 
Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
Create a Method to find vowels and consonants in a string using charAt() method and return the character and vowel or consonant in a 2D array
Create a Method to display the 2D Array of Strings in a Tabular Format
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 
*/



import java.util.Scanner;

public class CheckVowelConsonant2 {

    // Method to checking if the character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        // Convert to lowercase if character is uppercase
        ch = Character.toLowerCase(ch);

        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        // Check if the character is a consonant
        else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }
        else {
            return "Not a Letter";
        }
    }

    // Method to finding vowels and consonants in a string and return 2D array
    public static String[][] findCharacterTypes(String str) {
        // Creating a 2D array to store the character and its type
        String[][] result = new String[str.length()][2];

      
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check the character type and store it in the 2D array
            result[i][0] = String.valueOf(ch);  
            result[i][1] = checkCharacterType(ch); 
        }

        return result;  
    }

    // Method to display the 2D array in a tabular format
    public static void displayTypesOfCharacter(String[][] characterTypes) {
        System.out.println("Character\tType");
       
        for (int i = 0; i < characterTypes.length; i++) {
            System.out.println(characterTypes[i][0] + "\t\t" + characterTypes[i][1]);
        }
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the string
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Finding the character types for the input string
        String[][] characterTypes = findCharacterTypes(input);

       
        displayTypesOfCharacter(characterTypes);

        sc.close();  
    }
}
