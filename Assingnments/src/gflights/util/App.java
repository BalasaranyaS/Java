package gflights.util;

//package com.gflights.ui;
//
//import com.gflights.model.BookingModel;
//import com.gflights.repository.BookingRepository;
//import com.gflights.util.MainMenuUtil;
//import com.gflights.util.MenuUtil;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to GFlights");
        BookingRepository bookingRepository = new BookingRepository();

        while (true) {
            int choice = MainMenuUtil.displayMainMenu();
            switch (choice) {
                case 1:
                    BookingModel bookingModel = MenuUtil.bookFlights();
                    bookingRepository.addBooking(bookingModel);
                    break;
                case 2:
                    bookingRepository.displayBookings();
                    break;
                case 3:
                    int searchId = MenuUtil.getBookingId();
                    BookingModel foundBooking = bookingRepository.searchBookingById(searchId);
                    if (foundBooking != null) {
                        System.out.println(foundBooking);
                    } else {
                        System.out.println("Booking not found.");
                    }
                    break;
                case 4:
                    int updateId = MenuUtil.getBookingId();
                    BookingModel updateBooking = bookingRepository.searchBookingById(updateId);
                    if (updateBooking != null) {
                        bookingRepository.updateBooking(MenuUtil.updateBooking(updateBooking));
                    } else {
                        System.out.println("Booking not found.");
                    }
                    break;
                case 5:
                    int deleteId = MenuUtil.getBookingId();
                    bookingRepository.deleteBooking(deleteId);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
