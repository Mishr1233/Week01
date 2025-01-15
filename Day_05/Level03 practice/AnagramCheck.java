/*Write a program to check if two texts are anagrams and display the result
Hint => 
Anagram is a word or phrase formed by rearranging the same letters to form different words or phrase,
Write a method to check if two texts are anagrams. The logic used here is as follows:
Check if the lengths of the two texts are equal
Create an array to store the frequency of characters in the strings for the two text
Find the frequency of characters in the two texts using the loop
Compare the frequency of characters in the two texts. If the frequencies are not equal, return false
In the main function take user inputs, call user-defined methods, and displays result. 
*/





import java.util.Scanner;

public class AnagramCheck {

    // Method to checking if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
       
        if (text1.length() != text2.length()) {
            return false;
        }

     
        int[] freq1 = new int[256];  // Frequency array for text1 (ASCII characters)
        int[] freq2 = new int[256];  // Frequency array for text2 (ASCII characters)

        // Loop to calculate the frequency of characters in both strings
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }

        // Compare the frequencies of the characters in both strings
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false; 
            }
        }

        return true;  // If all frequencies match, the texts are anagrams
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user inputs for the two texts
        System.out.print("Enter the first text: ");
        String text1 = sc.nextLine().toLowerCase();

        System.out.print("Enter the second text: ");
        String text2 = sc.nextLine().toLowerCase();

        // Call the method to check if the two texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display the result
        if (result) {
            System.out.println("The two texts are anagrams.");
        } else {
            System.out.println("The two texts are not anagrams.");
        }

        sc.close();
    }
}
