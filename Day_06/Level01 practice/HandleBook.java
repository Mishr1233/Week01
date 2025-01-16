/*
 * Program to Handle Book Details
 * Problem Statement: Write a program to create a Book class with attributes
 * title, author, and price. Add a method to display
 * the book details.
 */

public class HandleBook {
    public static void main(String[] args) {

        Book english = new Book("English communication", "MishraJi", 500.50);
        english.disply();

    }
}

class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, Double price) {

        this.title = title;
        this.author = author;
        this.price = price;
    }

    void disply() {
        System.out.println("Title of book :" + this.title);
        System.out.println("Author of book :" + this.author);
        System.out.println("Price of book :" + this.price);
    }
}