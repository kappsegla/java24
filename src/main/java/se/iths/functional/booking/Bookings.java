package se.iths.functional.booking;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bookings {
    public static void main(String[] args) {
        // Initialize an ArrayList with HotelBooking objects
        List<HotelBooking> bookings = getHotelBookings();

        // Print the bookings
        bookings.forEach(System.out::println);
    }

    private static List<HotelBooking> getHotelBookings() {
        List<HotelBooking> bookings = new ArrayList<>();

        // Add some bookings to the list
        bookings.add(new HotelBooking(new Guest("Alice", "Smith"), "Single", LocalDate.of(2024, 10, 1), LocalDate.of(2024, 10, 4), 100.0));
        bookings.add(new HotelBooking(new Guest("Bob", "Johnson"), "Double", LocalDate.of(2024, 10, 5), LocalDate.of(2024, 10, 7), 150.0));
        bookings.add(new HotelBooking(new Guest("Carol", "White"), "Suite", LocalDate.of(2024, 10, 8), LocalDate.of(2024, 10, 13), 300.0));
        bookings.add(new HotelBooking(new Guest("David", "Brown"), "Single", LocalDate.of(2024, 10, 14), LocalDate.of(2024, 10, 16), 100.0));
        bookings.add(new HotelBooking(new Guest("Eve", "Davis"), "Double", LocalDate.of(2024, 10, 17), LocalDate.of(2024, 10, 19), 150.0));
        bookings.add(new HotelBooking(new Guest("Frank", "Miller"), "Suite", LocalDate.of(2024, 10, 20), LocalDate.of(2024, 10, 25), 300.0));
        bookings.add(new HotelBooking(new Guest("Grace", "Wilson"), "Single", LocalDate.of(2024, 10, 26), LocalDate.of(2024, 10, 28), 100.0));
        bookings.add(new HotelBooking(new Guest("Hank", "Moore"), "Double", LocalDate.of(2024, 10, 29), LocalDate.of(2024, 10, 31), 150.0));
        bookings.add(new HotelBooking(new Guest("Ivy", "Taylor"), "Suite", LocalDate.of(2024, 11, 1), LocalDate.of(2024, 11, 6), 300.0));
        bookings.add(new HotelBooking(new Guest("Jack", "Anderson"), "Single", LocalDate.of(2024, 11, 7), LocalDate.of(2024, 11, 9), 100.0));
        return bookings;
    }
}
