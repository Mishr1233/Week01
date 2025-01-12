/*Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to Check if a number is prime number. A prime number is a number greater than 1 that has no positive divisors other than 1 and itself. 
Method to Check if a number is a neon number. A neon number is a number where the sum of digits of the square of the number is equal to the number itself 
Method to Check if a number is a spy number. A number is called a spy number if the sum of its digits is equal to the product of its digits
Method to Check if a number is an automorphic number. An automorphic number is a number whose square ends with the number itself. E.g. 5 is an automorphic number
Method to Check if a number is a buzz number. A buzz number is a number that is either divisible by 7 or ends with 7
*/


import java.util.*;
public class NumberCalculate4 {
   
   //checkPrime function
    public static boolean checkPrime (int number){
        for(int i=2;i<number/2;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;         
    }



   //checkNeon function
    public static boolean checkNeon(int number){
        double squareOfNumber=Math.pow(number, 2);
        double sumOfDigit=0;
        while(squareOfNumber==0){
            int digit=(int)(squareOfNumber%10);
            sumOfDigit=sumOfDigit+digit;
            squareOfNumber=squareOfNumber/10;
        }
        if(number==sumOfDigit)
            return true;
       
        return false;
    }
    
	
	//checkSpy function
    public static boolean checkSpy(int number){
        int sumOfDigit=0;
        int product=1;
        while(number==0){
            int digit=number%10;
            sumOfDigit+=digit;
            product=product*digit;
            number=number/10;
        }
        if(product==sumOfDigit){
            return true;
		}
        
            return false;
        }
		
		
		//checkAutomorphic function
        public static boolean checkAutomorphic(int number){
            double squareOfNumber=Math.pow(number, 2);        
            if((number%10)==(squareOfNumber%10))
                return true;
           
            return false;
        }
        public static boolean checkBuzz(int number){
                
            if((number%7==0)||(number%10==7))
                return true;
           
            return false;
        }
       
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the number");
        int number=input.nextInt();

        boolean checkPrime=checkPrime(number);	//calling of method countDigit
        boolean checkNeon=checkNeon(number);//calling of method mean
        boolean checkBuzz=checkBuzz(number);
        boolean checkSpy=checkSpy(number);
        boolean checkAutomorphic=checkAutomorphic(number);

        System.out.println("The number is Prime  number ? "+checkPrime);
        System.out.println("The number is Neon  number ? "+checkNeon);
        System.out.println("The number is Spy  number ? "+checkSpy);
        System.out.println("The number is Automorphic  number ? "+checkAutomorphic);
        System.out.println("The number is Buzz number ? "+checkBuzz);
    
    }
}
