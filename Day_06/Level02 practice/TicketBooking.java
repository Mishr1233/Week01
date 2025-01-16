/*Program to Model a Movie Ticket Booking System
Problem Statement: Create a MovieTicket class with attributes movieName, seatNumber, and price. 
Add methods to:
Book a ticket (assign seat and update price).
Display ticket details.
Explanation: The MovieTicket class organizes ticket information with attributes. 
The methods handle booking logic and display ticket details.*/

public class TicketBooking {
    public static void main(String[] args) {
        // Creating an instance of the MovieTicket class
        MovieTicket ticket = new MovieTicket("Avatar 2");

        // Displaying details before booking
        ticket.displayTicketDetails();

        // Booking a ticket
        ticket.bookTicket("A15", 15.50);

        // Displaying details after booking
        ticket.displayTicketDetails();
    }

}

class MovieTicket {
    // Attributes
    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor to initialize the movie name
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = null;
        this.price = 0.0;
    }

    // Method to booking a ticket by assigning seat number and price
    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket successfully booked for movie '" + movieName + "'!");
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        if (seatNumber == null) {
            System.out.println("Ticket has not been booked yet.");
        } else {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + String.format("%.2f", price));
        }
    }

}
