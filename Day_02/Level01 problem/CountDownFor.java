import java.util.Scanner;

class CountDownFor{
	public static void main(String [] args){
		
		//create scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the countdown start value: ");
        int counter = scan.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.print(i + " "); // Print the current value of i
        }
		
        // Printing "Launch" when the countdown is complete
        System.out.println("Launch!");
	}
}