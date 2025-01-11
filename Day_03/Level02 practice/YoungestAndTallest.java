import java.util.Scanner;

public class YoungestAndTallest {

    public static void main(String[] args) {
        // create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // declare arrays to store the ages and heights 
        int[] ages = new int[3];
        double[] heights = new double[3];

        // input the age and height 
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of friend " + (i + 1) + " (in meters): ");
            heights[i] = sc.nextDouble();
        }

        // find the youngest friend
        int youngestAge = ages[0];
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestIndex = i;
            }
        }

        // find the tallest friend
        double tallestHeight = heights[0];
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestIndex = i;
            }
        }

        // output the youngest and tallest friends
        System.out.println("\nThe youngest friend is " + getFriendName(youngestIndex) + " with age " + youngestAge);
        System.out.println("The tallest friend is " + getFriendName(tallestIndex) + " with height " + tallestHeight + " meters.");

      
        sc.close();
    }

    // helper method 
    public static String getFriendName(int index) {
        switch (index) {
            case 0:
                return "Amar";
            case 1:
                return "Akbar";
            case 2:
                return "Anthony";
            default:
                return "Unknown";
        }
    }
}
