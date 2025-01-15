/*Write a program to find vowels and consonants in a string and display the count of  Vowels and Consonants in the string
Hint => 
Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
Create a Method to Method to find vowels and consonants in a string using charAt() method and finally return the count of vowels and consonants in an array
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.
*/



import java.util.Scanner;

public class CheckVowelConsonant {

    // Method to checking if the character is a vowel or consonant
    public static String checkCharacter(char ch) {
        // Converting to lowercase if character is uppercase
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

    // Method to finding the count of vowels and consonants in a string
    public static int[] countVowelAndConsonant(String str) {
        int vowels = 0;
        int consonants = 0;

        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a letter and categorize it
            String result = checkCharacter(ch);
            if (result.equals("Vowel")) {
                vowels++;
            } else if (result.equals("Consonant")) {
                consonants++;
            }
        }

       
        return new int[] { vowels, consonants };
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner object for user input

        // Taking user input for the string
        System.out.println("Enter a string:");
        String input = sc.nextLine();

       
        int[] counts = countVowelAndConsonant(input);

       
        System.out.println("Vowels count: " + counts[0]);
        System.out.println("Consonants count: " + counts[1]);

        sc.close(); 
    }
}
