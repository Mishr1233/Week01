/*Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to find factors of a number and return them as an array. Note there are 2 for loops one for the count and another for finding the factor and storing in the array
Method to find the greates factor of a Number using the factors array
Method to find the sum of the factors using factors array and return the sum
Method to find the product of the factors using factors array and return the product
Method to find product of cube of the factors using the factors array. Use Math.pow() 
Method to Check if a number is a perfect number. Perfect numbers are positive integers that are equal to the sum of their proper divisors
Method to find the number is a abundant number. A number is called an abundant number if the sum of its proper divisors is greater than the number itself
Method to find the number is a deficient number. A number is called a deficient number if the sum of its proper divisors is less than the number itself
Method to Check if a number is a strong number. A number is called a strong number if the sum of the factorial of its digits is equal to the number itself
*/


import java.util.*;
public class NumberCalculate5 {
    
	
	//factorsOfNumber function creating
    public static int[]factorsOfNumber(int number){
         int maxFactor = 10;
         int[] factors = new int[maxFactor]; 
         int index = 0; 
         for (int i = 1; i <number; i++) {
             if (number % i == 0) { 
                 factors[index++] = i;
                 if (index == maxFactor) {
                     maxFactor *= 2; 
                     int[] temp = new int[maxFactor]; 
                     for(int a=0;a<factors.length;a++){
                         temp[a]=factors[a];
                     }
                     factors = temp;
                 }
             }
        }
        return factors;
    }
    
	
	//greatestFactor function creating
    public static int greatestFactor(int number){
        int greatestFactor=1;
        int[]factor=factorsOfNumber(number);
        for(int i=0;i<factor.length;i++){
            if(factor[i]>greatestFactor){
                greatestFactor=factor[i];
            }
        }
        return greatestFactor;
    }
	
	//sumOfFactor function creating
    public static int sumOfFactor(int number){
        int sumOfFactor=0;
        int[]factor=factorsOfNumber(number);
        for(int i=0;i<factor.length;i++){
            sumOfFactor=sumOfFactor+factor[i];
        }
        return sumOfFactor;
    }
	
	//productOfFactor function creating
    public static int productOfFactor(int number){
        int productOfFactor=1;
        int[]factor=factorsOfNumber(number);
        for(int i=0;i<factor.length;i++){
			if(factor[i]== 0){
				break;
			}
			
            productOfFactor=productOfFactor*factor[i];
        }
        return productOfFactor;
    }
	
	//cubeOfFactors function creating
    public static double[] cubeOfFactors(int number){
        int[] factor=factorsOfNumber(number);
        int size=factor.length;
        double[] cubeOfFactors=new double[size];
        for(int i=0; i<size ;i++){
			if(factor[i]== 0){
				break;
			}
            cubeOfFactors[i]=Math.pow(factor[i],3);
        }
        return cubeOfFactors;
    }
	
	//checkPerfect function creating
    public static boolean checkPerfect(int number){
        if(number<0){
            return false;
        }
        int sumOfDivisor=sumOfFactor(number);
        if(number==sumOfDivisor)
            return true;
        return false;
    }
	
	
	//checkAbundant function creating
    public static boolean checkAbundant(int number){
        if(number<0){
            return false;
        }
        int sumOfDivisor=sumOfFactor(number);
        if(number<sumOfDivisor)
            return true;
        return false;
    }
	
	
	//checkDeficient function creating
    public static boolean checkDeficient(int number){
        if(number<0){
            return false;
        }
        int sumOfDivisor=sumOfFactor(number);
        if(number>sumOfDivisor)
            return true;
        return false;
    }
    
	//factorial function
    public static int factorial(int digit){
        int factorial=1;
        for(int i=1;i<=digit;i++){
			
            factorial=factorial*i+1;
        }
        return factorial;
    }
	
	//checkStrong function
    public static boolean checkStrong(int number){
        if(number<0){
            return false;
        }
        int sumOfFactorialOfDigits=0;
        int temp=number;
        while(temp==0){
            int digit=temp%10;
            temp=temp/10;
            sumOfFactorialOfDigits=sumOfFactorialOfDigits+factorial(digit);
        }
        if(number==sumOfFactorialOfDigits)
            return true;
        return false;
    }
	
	
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the number");
        int number=input.nextInt();

        int[] factors=factorsOfNumber(number);
        int sumOfFactor=sumOfFactor(number);
        int greatestFactor=greatestFactor(number);
        int productOfFactor=productOfFactor(number);
        double[] cubeOfFactors=cubeOfFactors(number);

        boolean checkPerfect=checkPerfect(number);	//calling of method countDigit
        boolean checkAbundant=checkAbundant(number);//calling of method mean
        boolean checkDeficient=checkDeficient(number);
        boolean checkStrong=checkStrong(number);
		
		
        System.out.println("Factors of number"+number);
        for (int i=0; i <factors.length; i++) {
			if(factors[i]== 0){
				break;
			}
            System.out.println(factors[i]+",");
        }
        System.out.println("Cube of Factors of number "+number);
        for (int i=0; i <cubeOfFactors.length; i++) {
			if(cubeOfFactors[i]== 0){
				break;
			}
            System.out.print(cubeOfFactors[i]+", ");
        }
		
        System.out.println("\nGreatest Factors of number "+number+" is "+ greatestFactor);
        System.out.println("Sum Factors of number "+number+" is "+ sumOfFactor);
        System.out.println("product of number "+number+" is "+ productOfFactor);

        System.out.println("The number is Perfect number ? "+checkPerfect);
        System.out.println("The number is Abundant number ? "+checkAbundant);
        System.out.println("The number is Deficient number ? "+checkDeficient);
        System.out.println("The number is Strong number ? "+checkStrong);
    
    }
}

