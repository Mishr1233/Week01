/*Create a program to find the shortest, tallest, and mean height of players present in a football team.
Hint => 
The formula to calculate the mean is: mean = sum of all players/number of players
Create an int array named heights of size 11 and get 3 digits random height in cms for each player in the range 150 cms to 250 cms
Write the method to Find the sum of all the players present in the array.
Write the method to find the mean height of the players on the football team
Write the method to find the shortest height of the players on the football team 
Write the method to find the tallest height of the players on the football team
Finally display the results
*/


import java.util.Scanner;
public class FootballPlayer{

	//method returns sum of all players
	public static int sum(int height[]){
		int sum=0;
		for(int i=0;i<height.length;i++){
			sum=sum+height[i];
		}
		return sum;
	}

	//method returns mean of all players
	public static int mean(int[]height){

		int sum=sum(height);
		int mean=sum/height.length;
		
		return mean;
	}

	//method returns shortest player of all players
	public static int shortest(int height[]){
		int shortest=Integer.MAX_VALUE;
		for(int i=0;i<height.length;i++){
			if(height[i]<shortest)
				shortest=height[i];
		}
		return shortest;
	}

	//method returns tallest player of all players
	public static int tallest(int height[]){
		int tallest=Integer.MIN_VALUE;
		for(int i=0;i<height.length;i++){
			if(height[i]>tallest)
				tallest=height[i];
		}
		return tallest;

	}

	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);

		int[]height=new int[11];		//initialising height array

		System.out.println("Enter height of all the players :");
		for(int i=0;i<height.length;i++){
			height[i]=sc.nextInt();
		}
		int sumOfAll=sum(height);		//calling of method sum
		int meanOfAll=mean(height);		//calling of method mean
		int shortestOfAll=shortest(height);	//calling of method shortest
		int tallestOfAll=tallest(height);	//calling of method tallest
	
		//printing all results
		System.out.println("Sum of all players "+sumOfAll);
		System.out.println("Mean of all players "+meanOfAll);
		System.out.println("Shortest among all players "+shortestOfAll);
		System.out.println("Tallest among all players "+tallestOfAll);
	}

		
}