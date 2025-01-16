/*
 * Program to Track Inventory of Items
 * Problem Statement: Create an Item class with attributes itemCode, itemName,
 * and price. Add a method to display item details and calculate the total cost
 * for a given quantity.
 */

public class TrackInventory {
    public static void main(String[] args) {
        Item sugar = new Item(100, "SweetSugar", 50);
        sugar.display();
        double quantity = 5.5;// quantity in kg

        System.out.println("total cost of given quantity :" + sugar.totalCost(quantity));

    }
}

class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {

        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;

    }

    void display() {
        System.out.println("Name of the item is :" + itemName);
        System.out.println("code of the item is :" + itemCode);
        System.out.println("price of the item is :" + price);
    }

    double totalCost(double quantity) {

        return this.price * quantity;

    }

}