/*Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
Method to reverse the digits array 
Method to compare two arrays and check if they are equal
Method to check if a number is a palindrome using the Digits. A palindrome number is a number that remains the same when its digits are reversed. 
Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
*/



import java.util.Scanner;

public class NumberCalculate3 {
	
	//count function
    public static int countDigit(int number){
		int count=0;
		while(number!=0){
			count++;
			number=number/10;
		}
		return count;
	}
	
	
    public static int[] digitInNumber(int number){
		int countDigit=countDigit(number);
		int []digits=new int[countDigit];
		int i=0;
		while(number!=0){
			digits[i]=number%10;
			number=number/10;
			i++;
		}
		return digits;
    }
    public static int[] reverseDigits(int number){
		
		int []digits=digitInNumber(number);
        int size=digits.length;
        int []reverse=new int[size];
		for(int i=0;i<size;i++){
            reverse[i]=digits[size-i-1];
        }
		return reverse;
    }
	//check palindrome function
    public static boolean checkPalindrome(int number){
        int []digits=digitInNumber(number);
        int []reverse=reverseDigits(number);
		
        for(int i=0;i<digits.length;i++){
            if(digits[i]!=reverse[i])
                return false;

        }
        return true;
    }
	
	//checkDuck function
    public static boolean checkDuck(int number){
        int []digits=digitInNumber(number);
        for(int i=0;i<digits.length;i++){
            if(digits[i]==0)
                return false;

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number");
        int number=sc.nextInt();
    

        int countOfDigits=countDigit(number);	//calling of method countDigit
        int[]digitInNumber=digitInNumber(number);//calling of method mean
      
       
	    boolean checkPalindrome=checkPalindrome(number);
        boolean checkDuck=checkDuck(number);


        System.out.println("Count of digits is "+countOfDigits);

        System.out.println("Digits in number are ");
        for(int i=0;i<digitInNumber.length;i++){
            System.out.println(digitInNumber[i]);
        }

        System.out.println("The number is Duck  number ? "+checkDuck);

        System.out.println("The number is Palindrome number ? "+checkPalindrome);
    
    }
}
