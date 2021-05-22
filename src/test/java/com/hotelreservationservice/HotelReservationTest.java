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
    public void givenHotelsWhenAddedToHotelReservationServiceShouldReturnTrue () {
        Hotels hotels = new Hotels("LakeWood",110);
        HotelReservationService hotelReservationService = new HotelReservationService();
        hotelReservationService.addHotels(hotels);
        List<Hotels> list = hotelReservationService.getHotelsList();
        Assertions.assertTrue(list.contains(hotels));
    }

    /**
     * @description create Method for Testing the Hotel Reservation Service which Hotel become Cheapest for given Date Range
     *
     */
    @Test
    public void given3HotelsAddedToHotelReservationServiceShouldReturnCheapestHotelForGivenDateRange () {
        Hotels lakeWood = new Hotels("LakeWood",160);
        Hotels bridgeWood = new Hotels("BridgeWood",110);
        Hotels ridgeWood = new Hotels("RidgeWood",200);
        HotelReservationService hotelReservationService = new HotelReservationService();
        hotelReservationService.addHotels(lakeWood);
        hotelReservationService.addHotels(bridgeWood);
        hotelReservationService.addHotels(ridgeWood);
        int noOfDays = hotelReservationService.noOfDays("10 09 2020","11 09 2020");
        int result = hotelReservationService.findTheCheapestHotel(noOfDays);
        Assertions.assertEquals("110",result);
    }
    /**
     * @description create Main Method for Passing Welcome Message For Hotel Reservation Service
     *
     */
    public static void main(String[] args) {
        System.out.println("Welcome Message To Hotel Reservation Service");
    }
}
