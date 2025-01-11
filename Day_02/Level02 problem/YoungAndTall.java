import java.util.Scanner;

class YoungAndTall {
    public static void main(String[] args) {
        // Creating the Scanner object to read input
        Scanner scan = new Scanner(System.in);

        // Taking input for Amar's age and height
        System.out.print("Enter Amar's age: ");
        int amarAge = scan.nextInt();
        System.out.print("Enter Amar's height: ");
        int amarHeight = scan.nextInt();

        // Taking input for Akbar's age and height
        System.out.print("Enter Akbar's age: ");
        int akbarAge = scan.nextInt();
        System.out.print("Enter Akbar's height: ");
        int akbarHeight = scan.nextInt();

        // Taking input for Anthony's age and height
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = scan.nextInt();
        System.out.print("Enter Anthony's height: ");
        int anthonyHeight = scan.nextInt();

        // Find the youngest among the 3 friends based on age
        int youngestAge = Math.min(Math.min(amarAge, akbarAge), anthonyAge);
        String youngestFriend = "";
        if (youngestAge == amarAge) {
            youngestFriend = "Amar";
        } else if (youngestAge == akbarAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        // Find the tallest among the 3 friends based on height
        int tallestHeight = Math.max(Math.max(amarHeight, akbarHeight), anthonyHeight);
        String tallestFriend = "";
        if (tallestHeight == amarHeight) {
            tallestFriend = "Amar";
        } else if (tallestHeight == akbarHeight) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        // Display the youngest friend and tallest friend
        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge);
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight);
    }
}