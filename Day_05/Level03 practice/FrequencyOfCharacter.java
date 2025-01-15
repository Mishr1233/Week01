/*Write a program to find the frequency of characters in a string using charAt() method and display the result
Hint => 
Create a method to find the frequency of characters in a string using charAt() method and return the characters and their frequencies in a 2D array. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Create an array to store the characters and their frequencies
Loop through the characters in the text and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays result.  
*/






import java.util.Scanner;

public class FrequencyOfCharacter {

    
    public static String[][] findCharacterFrequency(String text) {
        int[] freq = new int[256];  

       
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Create a 2D array to store characters and their frequencies
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;

       
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf((char) i);  
                result[index][1] = String.valueOf(freq[i]);  
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
        String[][] frequencies = findCharacterFrequency(inputText);

      
        System.out.println("\nCharacter frequencies in the string:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println(frequencies[i][0] + " -> " + frequencies[i][1]);
        }

        sc.close();
    }
}
