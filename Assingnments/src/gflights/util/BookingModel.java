package gflights.util;

import java.util.Scanner;

public class BookingModel {
    private int bookingId;
    private String source;
    private String destination;
    private String ticketClass;
    private int noOfPassengers;
    private boolean roundTrip;

   // public BookingModel(){}

    public BookingModel(int bookingId, String source, String destination, String ticketClass, int noOfPassengers, boolean roundTrip) {
//        this.bookingId = bookingId;
//        this.source = source;
//        this.destination = destination;
//        this.ticketClass = ticketClass;
//        this.noOfPassengers = noOfPassengers;
//        this.roundTrip = roundTrip;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTicketClass() {
        return ticketClass;
    }

    public void setTicketClass(String ticketClass) {
        this.ticketClass = ticketClass;
    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    public boolean isRoundTrip() {
        return roundTrip;
    }

    public void setRoundTrip(boolean roundTrip) {
        this.roundTrip = roundTrip;
    }

    @Override
    public String toString() {
        return "BookingModel{" +
                "bookingId=" + bookingId +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", ticketClass='" + ticketClass + '\'' +
                ", noOfPassengers=" + noOfPassengers +
                ", roundTrip=" + roundTrip +
                '}';
    }

    public static class MainMenuUtil {
        public static int displayMainMenu(){
            System.out.println("Welcome to GFlights...");
            System.out.println("1. Book Flights");
            System.out.println("2. Display bookings");
            System.out.println("3. Search bookings by bookingId");
            System.out.println("4. Update bookings");
            System.out.println("5. Delete a booking");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            return choice;
        }
    }
}

