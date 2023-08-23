package com.diyo.realestatelist.controller;

import com.diyo.realestatelist.entity.Booking;
import com.diyo.realestatelist.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("booking")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @GetMapping
    public ResponseEntity<List<Booking>> getAllBooking(Booking booking){
        List<Booking> bookingList = bookingService.getAllBooking();
        return ResponseEntity.status(200).body(bookingList);
    }

    @GetMapping("/{bookingId}")
    public ResponseEntity<Booking> getBookingById(@PathVariable("bookingId") Long bookingId){
        Booking booking1 = bookingService.getBookingById(bookingId);
        return ResponseEntity.status(200).body(booking1);
    }

    @PostMapping
    public ResponseEntity<String> saveBooking(@RequestBody Booking booking){
        String result = bookingService.saveBooking(booking);
        return ResponseEntity.status(200).body(result);

    }

    @PostMapping("/all")
    public ResponseEntity<String> saveAllBooking(@RequestBody List<Booking> booking){
        String result = bookingService.saveAllBooking(booking);
        return ResponseEntity.status(200).body(result);

    }
    @PutMapping("/{bookingId}")
    public ResponseEntity<String> updateBookingById(@RequestBody Booking booking, @PathVariable("bookingId") Long bookingId){
        String result = bookingService.updateBookingById(booking, bookingId);
        return ResponseEntity.status(200).body(result);
    }

    @DeleteMapping("/{bookingId}")
    public ResponseEntity<String> deleteBookingById(@PathVariable("bookingId") Long bookingId){
        String result = bookingService.deleteBookingById(bookingId);
        return ResponseEntity.status(200).body(result);
    }
}
