package se.iths.functional.booking;

import java.time.LocalDate;

public record HotelBooking(Guest guest, String roomType, LocalDate checkInDate, LocalDate checkOutDate, double pricePerNight) {}
