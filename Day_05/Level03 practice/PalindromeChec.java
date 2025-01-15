import java.util.Scanner;

public class Palindromechec{

    // Logic 1: Iterative method to checking palindrome
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // Logic 2: Recursive method to checking palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        //If start index is greater or equal to end index
        if (start >= end) {
            return true;
        }

        // If characters at the current positions don't match
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

       
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using character arrays to checking palindrome
    public static boolean isPalindromeUsingCharArray(String text) {
        // Convert the string to a character array
        char[] originalArray = text.toCharArray();
        
        // Create a reverse character array
        char[] reversedArray = new char[originalArray.length];
        int j = 0;
        for (int i = originalArray.length - 1; i >= 0; i--) {
            reversedArray[j++] = originalArray[i];
        }

        // Compare the original array with the reversed array
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for text
        System.out.print("Enter a string to checking if it's a palindrome: ");
        String inputText = sc.nextLine().toLowerCase().replaceAll("[^a-zA-Z0-9]", ""); // Normalize text

        // checking palindrome using Logic 1 (Iterative)
        boolean isPalindrome1 = isPalindromeIterative(inputText);
        System.out.println("Palindrome checking using Iterative method: " + isPalindrome1);

        // checking palindrome using Logic 2 (Recursive)
        boolean isPalindrome2 = isPalindromeRecursive(inputText, 0, inputText.length() - 1);
        System.out.println("Palindrome checking using Recursive method: " + isPalindrome2);

        // checking palindrome using Logic 3 (Character arrays)
        boolean isPalindrome3 = isPalindromeUsingCharArray(inputText);
        System.out.println("Palindrome checking using Character arrays method: " + isPalindrome3);

        sc.close();
    }
}
