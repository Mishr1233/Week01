/*Program to Simulate a Shopping Cart
Problem Statement: Create a CartItem class with attributes itemName, price, and quantity. Add methods to:
Add an item to the cart.
Remove an item from the cart.
Display the total cost.
Explanation: The CartItem class models a shopping cart item. The methods handle cart operations like adding or removing items and calculating the total cost.
*/

import java.util.ArrayList;

public class ShoppingCart {
    public static void main(String[] args) {
        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Add items to the cart
        cart.addItemToCart("Laptop", 999.99, 1);
        cart.addItemToCart("Smartphone", 599.99, 2);
        cart.addItemToCart("Headphones", 49.99, 3);

        // Display the total cost
        cart.displayTotalCost();

        // Remove an item from the cart
        cart.removeItemFromCart("Smartphone");

        // Display the total cost after removing an item
        cart.displayTotalCost();
    }

}

public class CartItem {
    // Attributes for each cart item
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize the CartItem object
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to geting the total cost for this item
    public double getTotalPrice() {
        return price * quantity;
    }

    // Getters for item attributes
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Class for managing the shopping cart
    public static class ShoppingCart {
        // List to store cart items
        private ArrayList<CartItem> cartItems;

        // Constructor to initialize the shopping cart
        public ShoppingCart() {
            cartItems = new ArrayList<>();
        }

        // Method to add an item to the cart
        public void addItemToCart(String itemName, double price, int quantity) {
            CartItem newItem = new CartItem(itemName, price, quantity);
            cartItems.add(newItem);
            System.out.println(quantity + " " + itemName + "(s) added to the cart.");
        }

        // Method to remove an item from the cart
        public void removeItemFromCart(String itemName) {
            boolean removed = false;
            for (CartItem item : cartItems) {
                if (item.getItemName().equals(itemName)) {
                    cartItems.remove(item);
                    System.out.println(itemName + " removed from the cart.");
                    removed = true;
                    break;
                }
            }
            if (!removed) {
                System.out.println(itemName + " not found in the cart.");
            }
        }

        // Method to display the total cost of all items in the cart
        public void displayTotalCost() {
            double totalCost = 0;
            System.out.println("\nShopping Cart Details:");
            for (CartItem item : cartItems) {
                System.out.println(item.getItemName() + " - $" + item.getPrice() + " x " + item.getQuantity() + " = $"
                        + item.getTotalPrice());
                totalCost += item.getTotalPrice();
            }
            System.out.println("\nTotal Cost: $" + totalCost);
        }
    }

}
