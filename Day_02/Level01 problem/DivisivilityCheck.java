/*Write a program to check if a number is divisible by 5
I/P => number
O/P => Is the number ___ divisible by 5? ___
*/


import java.util.Scanner;
public class DivisivilityCheck{
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter an number :");
		int number = sc.nextInt();
		boolean isDivisible = false;
		
		if(number%5==0){
			isDivisible =true;
		}
		
		if(isDivisible){
			System.out.println("Is the number "+number+" divisible by 5? "+isDivisible);
		}else{
			System.out.println("Is the number "+number+" divisible by 5? "+isDivisible);
		}
		
		sc.close();
	}


}