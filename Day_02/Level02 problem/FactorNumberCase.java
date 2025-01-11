
import java.util.Scanner;

class FactorNumberCase{
	public static void main(String [] args){
		
		// create scanner object for user input''
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int number = scan.nextInt();
		
		System.out.print("Factors of " + number + " are: ");
        for (int i = 1; i < number; i++) {
            // Check if i is a factor of the number
            if (number % i == 0) {
                System.out.print(i + " "); // Print the factor if it's divisible
            }
        }
	}
}