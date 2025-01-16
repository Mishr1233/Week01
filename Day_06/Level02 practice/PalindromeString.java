/*Program to Check Palindrome String
Problem Statement: 	Create a PalindromeChecker class with an attribute text. Add methods to:
Check if the text is a palindrome.
Display the result.
Explanation: The PalindromeChecker class holds the text attribute. The methods operate on this attribute to verify its palindrome status and display the result.*/

import java.util.*;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.println("Enter a text :");
        String text = sc.next();

        PalindromeChecker palin = new PalindromeChecker(text);
        // display result
        palin.display(text);
    }

}

class PalindromeChecker {

    String text;

    // constructor of the class
    PalindromeChecker(String text) {
        this.text = text;

    }

    // checkpalindrome method
    boolean checkPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {

            if (text.charAt(start) == text.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }

        }
        return true;

    }

    void display(String text) {

        System.out.println("Is text palindrome ? :" + checkPalindrome(text));

    }
}