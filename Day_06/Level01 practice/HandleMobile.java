/*Program to Handle Mobile Phone Details
Problem Statement: Create a MobilePhone class with attributes brand, model, and price. Add a method to display all the details of the phone. The MobilePhone class uses attributes to store the phone's characteristics. The method is used to retrieve and display this information for each object.
*/

public class HandleMobile {
  public static void main(String args[]) {
    MobilePhone realme = new MobilePhone("Realme", "VivoT3X", 18000.20);
    realme.disply();
  }
}

class MobilePhone {

  String brand;
  String model;
  double price;

  MobilePhone(String brand, String model, double price) {

    this.brand = brand;
    this.model = model;
    this.price = price;

  }

  void disply() {
    System.out.println("Mobile brand name is :" + this.brand);
    System.out.println("mobile model is :" + this.model);
    System.out.println("mobile price is :" + this.price);
  }

}