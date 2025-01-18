import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String firstString = sc.nextLine();
        System.out.print("Enter second string: ");
        String secondString = sc.nextLine();

        // Sort characters of both strings
        char[] firstCharArray = firstString.replaceAll("\\s", "").toCharArray();
        char[] secondCharArray = secondString.replaceAll("\\s", "").toCharArray();
        Arrays.sort(firstCharArray);
        Arrays.sort(secondCharArray);

        // Compare the sorted strings
        if (Arrays.equals(firstCharArray, secondCharArray)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
