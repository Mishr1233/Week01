/*Extend or Create a elementChecker utility class and perform following task. Call from main() method the different methods and display results. 
Make sure all are static methods
Hint => 
Method to Find the count of elements in the element
Method to Store the elements of the element in a elements array
Method to Check if a element is a duck element using the elements array. A duck element is a element that has a non-zero digit present in it
Method to check if the element is a armstrong element using the elements array. ​​Armstrong element is a element that is equal to the sum of its own elements raised to the power of the element of elements.
 Eg: 153 = 1^3 + 5^3 + 3^3
Method to find the largest and second largest elements in the elements array. Use Integer.MIN_VALUE to initialize the variable.
Method to find the the smallest and second smallest elements in the elements array. Use Integer.MAX_VALUE to initialize the variable.
*/


import java.util.Scanner;
public class NumberChecker1{
    
	//count digit function
	public static int countDigit(int element){
		int count=0;
		while(element!=0){
			count++;
			element=element/10;
		}
		return count;
	}
	
	//digit store in array
	public static int[] digitInArray(int element){
		int countDigit=countDigit(element);
		int []elements=new int[countDigit];
		int i=0;
		while(element!=0){
			elements[i]=element%10;
			element=element/10;
			i++;
		}
		return elements;
	
	}
	//cheaking duck element
	public static boolean checkDuck(int element){
		int[]elements=digitInArray(element);

		for(int i=0;i<elements.length;i++){
			if(elements[i]==0)
				return false;
		}
		return true;
	}
	
	//checking armstrong number
	public static boolean checkArmstrong(int element){
		int[]elements=digitInArray(element);
		int sum=0;
		for(int i=0;i<elements.length;i++){
			sum=sum+(elements[i]*elements[i]*elements[i]);			
		}
		boolean check=(sum==element);
		return check;

	}
	public static int[]largestAndSecondLargest(int element){

		int[]elements=digitInArray(element);
		int largest=Integer.MIN_VALUE, secondLargest=Integer.MIN_VALUE;
        	// Finding the largest element
        	for (int i = 0; i <elements.length; i++) {
            	if (elements[i] > largest)
                	largest = elements[i];
        	}
        	// Finding the second largest element
        	for (int i = 0;i <elements.length; i++) {
           	 	//Update second largest if the current element is greater
           	 	//than second largest and not equal to the largest
           	 	if (elements[i] > secondLargest && elements[i] != largest) {
               			secondLargest = elements[i];
           		}
       	 	}
			
		int[]largestAndSecondLargest={largest,secondLargest};
		
		return largestAndSecondLargest;
	}
	public static int[] smallestAndSecondSmallest(int element){
		int[]elements=digitInArray(element);
		int smallest=Integer.MAX_VALUE, secondSmallest=Integer.MAX_VALUE;
        	// Finding the largest element
        	for (int i = 0; i <elements.length; i++) {
            	if (elements[i] < smallest)
                	smallest = elements[i];
        	}
        	// Finding the second largest element
        	for (int i = 0;i <elements.length; i++) {
           	 	//Update second largest if the current element is greater
           	 	//than second largest and not equal to the largest
           	 	if (elements[i] < secondSmallest && elements[i] != smallest) {
               			secondSmallest = elements[i];
           		}
       	 	}
		int[]smallestAndSecondSmallest={smallest,secondSmallest};
		
		return smallestAndSecondSmallest;

	}
	
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int element=sc.nextInt();
	

		int countOfelements=countDigit(element);	//calling of method countDigit
		System.out.println("Count of elements is "+countOfelements);
		
		int[]digitInArray=digitInArray(element);//calling of method mean
		int[]smallestAndSecondSmallest=smallestAndSecondSmallest(element);//calling of method shortest
		int[]largestAndSecondLargest=largestAndSecondLargest(element);	//calling of method tallest
		
		

		System.out.println("elements in element are ");
		for(int i=0;i<digitInArray.length;i++){
			System.out.println(digitInArray[i]);
		}

		System.out.println("largest And SecondLargest of elements are "+largestAndSecondLargest[0]+" and "+largestAndSecondLargest[1]);

		System.out.println("smallest And SecondSmallest of elements are "+smallestAndSecondSmallest[0]+" and "+smallestAndSecondSmallest[1]);
		
		System.out.println("number is armstrong : "+checkArmstrong(element));
		System.out.println("number is duck number : "+checkDuck(element));
		
		sc.close();
		

	}



}