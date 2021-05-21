package com.hotelreservationservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @description create Class for Testing the Hotel Reservation Service
 *
 */
public class HotelReservationTest {
    /**
     * @description create Method for Testing the Hotel Reservation Service by Adding the Hotel to The ArrayList
     *
     */
    @Test
    public void givenHotelsAddedToHotelReservationShouldReturnTrue () {
        Hotels hotels = new Hotels("LakeWood",110);
        HotelReservationService hotelReservationService = new HotelReservationService();
        hotelReservationService.addHotels(hotels);
        List<Hotels> list = hotelReservationService.getHotelsList();
        Assertions.assertTrue(list.contains(hotels));
    }
    /**
     * @description create Main Method for Passing Welcome Message For Hotel Reservation Service
     *
     */
    public static void main(String[] args) {
        System.out.println("Welcome Message To Hotel Reservation Service");
    }
}
