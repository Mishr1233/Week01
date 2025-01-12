/*Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to find the count of array in the number and a Method to Store the array of the number in a array array
Method to find the sum of the array of a number using the array array
Method to find the sum of the squares of the array of a number using the array array. Use Math.pow() method
Method to Check if a number is a harshad number using a array array. A number is called a Harshad number if it is divisible by the sum of its array. For e.g. 21
Method to find the frequency of each digit in the number. Create a 2D array to store the frequency with digit in the first column and frequency in the second column.
*/

import java.util.*;
public class NumberChecker2 {
    //count digit
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
		int []array=new int[countDigit];
		int i=0;
		while(number!=0){
			array[i]=number%10;
			number=number/10;
			i++;
		}
		return array;
    }
    public static int sumOfDigit(int number){
        int []array=digitInNumber(number);
		int sum=0;
		for(int i=0;i<array.length;i++){
			sum=sum+array[i];
		}
		return sum;
    }
    public static double sumOfSquareOfDigit(int number){
        int []array=digitInNumber(number);
		double sum=0;
		for(int i=0;i<array.length;i++){
			sum=sum+Math.pow(array[i],2);
		}
		return sum;
    }
    public static boolean checkHarshad(int number){
        int sumOfDigit=sumOfDigit(number);
		if(number%sumOfDigit==0){
				return true;
		}
		return false;
    }

    public static int[][] frequencyOfDigit(int number) {
    // handle negative numbers
    number = Math.abs(number);
    
    int[][] array = new int[10][2];

    // Initialize the array for counting frequency of each digit
    for (int i = 0; i < 10; i++) {
        array[i][0] = i;  // Store the digit in the first column
        array[i][1] = 0;  // Initialize frequency count to 0
    }

    // Count the frequency of each digit
    while (number > 0) {
        int digit = number % 10;  
        array[digit][1]++;        
        number = number / 10;     
    }

    return array;
}

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the number");
        int number=input.nextInt();
    

        int countOfarray=countDigit(number);	//calling of method countDigit
		
		
        int[]digitInNumber=digitInNumber(number);//calling of method mean
		
		
        int sumOfDigit=sumOfDigit(number);
        double sumOfSquareOfDigit=sumOfSquareOfDigit(number);
        boolean checkHarshad=checkHarshad(number);
        int[][]frequencyOfDigit=frequencyOfDigit(number);


        System.out.println("Count of array is "+countOfarray);

        System.out.println("array in number are ");
        for(int i=0;i<digitInNumber.length;i++){
            System.out.println(digitInNumber[i]);
        }
        System.out.println("Sum  of array is "+sumOfDigit);

        System.out.println("Sum of Square of array are "+sumOfSquareOfDigit);

        System.out.println("The number is Harshad number ? "+checkHarshad);
        
        for(int i=0;i<10;i++){
            System.out.println("Digit "+frequencyOfDigit[i][0]+" frequency "+frequencyOfDigit[i][1]);
        }
    
    }
}