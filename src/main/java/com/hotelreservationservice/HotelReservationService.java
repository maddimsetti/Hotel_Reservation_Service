package com.hotelreservationservice;

import java.util.ArrayList;
import java.util.List;
/**
 * @description create Class for Defining Hotel Reservation Service
 *
 */
public class HotelReservationService {
    private List<Hotels> hotelsList = new ArrayList<>();    //Created ArrayList to Store the Hotels

    /**
     * @description create Method for Adding the Hotels in Hotel Reservation Service
     *
     */
    public void addHotels(Hotels hotels) {
        hotelsList.add(hotels);
    }

    /**
     * @description created Getter and Setter for Hotel Reservation Service
     *
     */
    public List<Hotels> getHotelsList() {
        return hotelsList;
    }

    public void setHotelsList(List<Hotels> hotelsList) {
        this.hotelsList = hotelsList;
    }
}
