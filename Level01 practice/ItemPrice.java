/*Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
Hint => NA
I/P => unitPrice, quantity
O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___*/

import java.util.*; 

public class ItemPrice {
    
    // Main method - starting point of the program
    public static void main(String args[]) {
        
        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter the unit price of an item
        System.out.println("Enter unitprice of item :");
        
        // Reading the input unit price of the item
        double unitPrice = sc.nextDouble();
        
        // Prompting the user to enter the quantity of the item
        System.out.println("Enter quantity of item :");
        
        // Reading the input quantity of the item
        double quantity = sc.nextDouble();
        
        // Calculating the total price by multiplying unit price with quantity
        double totalPrice = unitPrice * quantity;

        // Printing the total price of the items, along with unit price and quantity
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);        
    }
}
