import java.util.Scanner;

class CalculateMultiplication{
	public static void main(String [] args){
		
		//create scanner object for user input 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int number = scan.nextInt();
		
		System.out.print("Multiple number is :");
		for(int i=1 ; i<=100;i++){
		if(number % i == 0){
			System.out.print(i + " " );
		}
		}
	}
}