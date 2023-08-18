package com.diyo.realestatelist.service;

import com.diyo.realestatelist.entity.Booking;
import com.diyo.realestatelist.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;
    public List<Booking> getAllBooking() {
        return bookingRepository.findAll();

    }

    public Booking getBookingById(Long bookingId) {
        Optional<Booking> bookingById = bookingRepository.findById(bookingId);
        if(bookingById.isPresent()){
            return bookingById.get();
        }
        else{
            return null;
        }

    }

    public String saveBooking(Booking booking) {
        bookingRepository.save(booking);
        return "Booking saved successfully!";

    }

    public String saveAllBooking(List<Booking> booking) {
        bookingRepository.saveAll(booking);
        return "Booking List saved successfully!";
    }

    public String updateBookingById(Booking booking, Long bookingId) {
        Optional<Booking> updateBooking = bookingRepository.findById(booking.getBookingId());
        if(updateBooking.isPresent()){
            bookingRepository.save(booking);
            return "Booking updated successfully!";
        }
        else{
            return "Booking id: "+booking.getBookingId()+" does not exist";
        }
    }

    public String deleteBookingById(Long bookingId) {
        Optional<Booking> booking = bookingRepository.findById(bookingId);
        if(booking.isPresent()){
            bookingRepository.deleteById(bookingId);
            return "Booking Deleted successfully!";
        }
        else{
            return "Booking id: "+bookingId+" does not exist!";
        }
    }
}
