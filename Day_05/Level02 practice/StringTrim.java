/*Write a program to trim the leading and trailing spaces from a string using the charAt() method 
Hint => 
Create a method to trim the leading and trailing spaces from a string using the charAt() method.
 Inside the method run a couple of loops to trim leading and trailing spaces and determine the starting and ending points with no spaces. Return the start point and end point in an array
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
The main function calls the user-defined trim and substring methods to get the text after trimming the leading and trailing spaces. 
Post that use the String built-in method trim() to trim spaces and compare the two strings. And finally display the result
*/




import java.util.Scanner;

public class StringTrim {

    
    public static int[] trimSpaces(String str) {
        int startIndex = 0;
        int endIndex = str.length() - 1;

        // Trim leading spaces
        while (startIndex <= endIndex && str.charAt(startIndex) == ' ') {
            startIndex++;
        }

        // Trim trailing spaces
        while (endIndex >= startIndex && str.charAt(endIndex) == ' ') {
            endIndex--;
        }

       
        return new int[] { startIndex, endIndex };
    }

    // method to creating a substring using charAt() based on start and end indices
    public static String createSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // Method to comparing two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner object for user str

        // Take user str for the string
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        // triming the string using the custom trimSpaces method
        int[] trimIndices = trimSpaces(str);
        String trimmedString = createSubstring(str, trimIndices[0], trimIndices[1]);

        // Triming the string using the built-in trim() method
        String TrimString = str.trim();

        // Comparing the results of custom trim and built-in trim methods
        boolean areEqual = compareStrings(trimmedString, TrimString);

       
        System.out.println("Trimmed string using charAt(): \"" + trimmedString + "\"");
        System.out.println("Trimmed string using built-in trim(): \"" + TrimString + "\"");
        System.out.println("Are both trimmed strings equal? " + areEqual);

        sc.close(); 
    }
}
