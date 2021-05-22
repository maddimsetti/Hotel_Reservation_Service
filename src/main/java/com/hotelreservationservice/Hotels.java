package com.hotelreservationservice;

public class Hotels {
    private String hotelName;
    int weekDayRates,weekendRates;
    private int dailyRate;


    public Hotels(String hotelName,int dailyRate) {
        this.hotelName = hotelName;
        this.dailyRate = dailyRate;
    }
    public Hotels (String hotelName, int weekDayRates,int weekendRates) {
        this.weekDayRates = weekDayRates;
        this.weekendRates = weekendRates;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(int regularRate) {
        this.dailyRate = dailyRate;
    }
}
