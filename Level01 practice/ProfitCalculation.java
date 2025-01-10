/*Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 
Hint => 
Use a single print statement to display multiline text and variables.
Profit = selling price - cost price
Profit Percentage = profit / cost price * 100
I/P => NONE
O/P => 
The Cost Price is INR ___ and Selling Price is INR ___
The Profit is INR ___ and the Profit Percentage is ___
*/

public class ProfitCalculation{
	
	public static void main(String args[]){
		
		//Create a variable costPrice for the cost price of INR 129
		double costPrice=129;
		
		//Create a variable sellingPrice for the selling price of INR 191
		double sellingPrice=191;
		
		//Create a variable profit for calculate profit and calculate profit
		double profit=sellingPrice - costPrice;
		
		//Create a variable profitPercentage for calculate percentage of profit
		 double profitPercentage = profit / costPrice * 100;
		 
		 System.out.println("The Cost Price is INR "+129+" "+"and Selling Price is INR "+191+"\nThe Profit is INR"+" "+profit+" and the Profit Percentage is "+profitPercentage);
		 
		
	}
	
}