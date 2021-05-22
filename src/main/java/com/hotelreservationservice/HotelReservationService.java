package com.hotelreservationservice;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @description create Class for Defining Hotel Reservation Service
 *
 */
public class HotelReservationService {
    private List<Hotels> hotelsList = new ArrayList<>();    //Created ArrayList to Store the Hotels
    Map<String,Integer> hotelsCost = new HashMap<>();
    private int noOfDays;

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

    /**
     * @description create method  for finding the no of Days to Stay in Hotel
     *
     */
    public int noOfDays(String startDate, String lastDate) {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
        try {
            Date dateStart = myFormat.parse(startDate);
            Date dateEnd = myFormat.parse(lastDate);
            long difference = dateEnd.getTime() - dateStart.getTime();
            noOfDays = (int) (difference / (1000*60*60*24));
            System.out.println("Number of Days between Dates" +noOfDays);
            return noOfDays;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * @description create for Finding the cheapest hotel for Hotel Reservation Service
     *
     */
    public int findTheCheapestHotel(int noOfDays) {
        hotelsCost = hotelsList.stream().collect(Collectors.toMap(k -> k.getHotelName(),k -> k.getDailyRate()*noOfDays));
        String hotel = Collections.min(hotelsCost.keySet());
        int rateOfHotel = hotelsCost.get(hotel);
        System.out.println("Cheapest Hotel is " + hotel+ " with rate " +rateOfHotel);
        return rateOfHotel;
    }
}
