package gflights.util;

//package com.gflights.repository;
//
//import com.gflights.model.BookingModel;

import java.util.ArrayList;
import java.util.List;

public class BookingRepository {
    List<BookingModel> bookingModelList = new ArrayList<>();

    public void addBooking(BookingModel bookingModel) {
        for (BookingModel bm : bookingModelList) {
            if (bm.getBookingId() == bookingModel.getBookingId()) {
                throw new DuplicateBookingException("Booking ID already exists.");
            }
        }
        bookingModelList.add(bookingModel);
        System.out.println("Saved booking: " + bookingModel);
    }

    public void displayBookings() {
        if (bookingModelList.isEmpty()) {
            System.out.println("No bookings available.");
            return;
        }
        for (BookingModel bookingModel : bookingModelList) {
            System.out.println(bookingModel);
        }
    }

    public BookingModel searchBookingById(int bookingId) {
        for (BookingModel bookingModel : bookingModelList) {
            if (bookingModel.getBookingId() == bookingId) {
                return bookingModel;
            }
        }
        throw new BookingNotFoundException("Booking not found.");
    }

    public void updateBooking(BookingModel bookingModel) {
        int index = -1;
        for (int i = 0; i < bookingModelList.size(); i++) {
            if (bookingModelList.get(i).getBookingId() == bookingModel.getBookingId()) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            bookingModelList.set(index, bookingModel);
            System.out.println("Updated booking: " + bookingModel);
        } else {
            throw new BookingNotFoundException("Booking not found.");
        }
    }

    public void deleteBooking(int bookingId) {
        BookingModel bookingModel = searchBookingById(bookingId);
        if (bookingModel != null) {
            bookingModelList.remove(bookingModel);
            System.out.println("Deleted booking: " + bookingModel);
        } else {
            throw new BookingNotFoundException("Booking not found.");
        }
    }
}

class BookingNotFoundException extends RuntimeException {
    public BookingNotFoundException(String message) {
        super(message);
    }
}

class DuplicateBookingException extends RuntimeException {
    public DuplicateBookingException(String message) {
        super(message);
    }
}

