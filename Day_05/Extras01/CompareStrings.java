import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter first string: ");
        String firstString = sc.nextLine();
        System.out.print("Enter second string: ");
        String secondString = sc.nextLine();

        // Compare strings lexicographically
        int comparisonResult = firstString.compareTo(secondString);
        if (comparisonResult < 0) {
            System.out.println("\"" + firstString + "\" comes before \"" + secondString + "\" lexicographically.");
        } else if (comparisonResult > 0) {
            System.out.println("\"" + firstString + "\" comes after \"" + secondString + "\" lexicographically.");
        } else {
            System.out.println("Both strings are equal.");
        }

        sc.close();
    }
}
