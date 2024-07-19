package gflights.util;



//import com.gflights.model.BookingModel;

import java.util.Scanner;

public class MenuUtil {
    public static BookingModel bookFlights() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Booking Id: ");
        int bookingId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Source: ");
        String source = scanner.nextLine();
        System.out.print("Enter Destination: ");
        String destination = scanner.nextLine();
        System.out.print("Enter Ticket Class: ");
        String ticketClass = scanner.nextLine();
        System.out.print("Enter Number of Passengers: ");
        int noOfPassengers = scanner.nextInt();
        System.out.print("Is it a Round Trip? (true/false): ");
        boolean roundTrip = scanner.nextBoolean();

        return new BookingModel(bookingId, source, destination, ticketClass, noOfPassengers, roundTrip);
    }

    public static int getBookingId() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Booking Id: ");
        return scanner.nextInt();
    }

    public static BookingModel updateBooking(BookingModel bookingModel) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Updating Booking: " + bookingModel);
        System.out.print("Enter new Source: ");
        bookingModel.setSource(scanner.nextLine());
        System.out.print("Enter new Destination: ");
        bookingModel.setDestination(scanner.nextLine());
        System.out.print("Enter new Ticket Class: ");
        bookingModel.setTicketClass(scanner.nextLine());
        System.out.print("Enter new Number of Passengers: ");
        bookingModel.setNoOfPassengers(scanner.nextInt());
        System.out.print("Is it a Round Trip? (true/false): ");
        bookingModel.setRoundTrip(scanner.nextBoolean());

        return bookingModel;
    }
}

