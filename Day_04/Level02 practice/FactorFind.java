/*Create a program to find the factors of a number taken as user input, store the factors in an array and display the factors.
 Also find the sum, sum of square of factors and product of the factors and display the results
Hint => 
Take the input for a number
Write a static Method to find the factors of the number and save them in an array and return the array. 
To find factors and save to array will have two loops. The first loop to find the count and initialize the array with the count.
 And the second loop save the factors into the array
Write a method to find the sum of the factors using factors array
Write a method to find the product of the factors using factors array
Write a method to find the sum of square of the factors using Math.pow() method
*/



import java.util.*;

public class FactorFind {

    public static void main(String[] args) {

        // Creating a scanner to take user input
        Scanner sc = new Scanner(System.in);

        // hint user to input a number
        System.out.println("Enter a number to find its factors:");
        int number = sc.nextInt();
		
		int array[] =factor(number);
		
		int sum =sum(array);
		System.out.println("sum of factor element :"+sum);
		
		int multiply = multiplication(array);
		System.out.println("multiplication of factor element :"+multiply);
		
		int square = power(sum);
		System.out.println("power of factor element sum :"+square);
		
		
		
    }
	
	//Creating a sum function
	public static int sum(int array[]){
		
		int add=0;
		for(int i=0;i<array.length;i++){
			add+=array[i];
		}
		return add;
		
	}
	
	//Creating a factor calculator 
	public static int[] factor(int number){
		int array[] = new int[10];
		int track =0;
		
		for(int i=1;i<number;i++){
			
			if(number % i ==0){
				array[track++]= i;
				
				if(array.length ==track){
					
					int temp[]=new int[array.length*2];
					
					for(int j=0;j<array.length;j++){
						temp[j] = array[j];
						
					}
					array=temp;
				}
				
			}
			
			
		}
		System.out.println("Factrs are : ");	
		for(int a=0;a<track;a++){
		     System.out.print(array[a]+" ");
		}
		System.out.println();
		
		
		
		return array;
		
	}
	
	//Creating a multiplication function
	public static int multiplication(int array[]){
		int totalValue = 1;
		
		for(int i=0;i<array.length;i++){
			if(array[i]==0){
				break;
				
			}else{
				totalValue*=array[i];
			}
		}
		return totalValue;
		
	}
	
	//Calculating square;
	public static int power(int sum){
		int square = (int)Math.pow(sum,2);
		
		return square;
	}
	
	
	
	
}