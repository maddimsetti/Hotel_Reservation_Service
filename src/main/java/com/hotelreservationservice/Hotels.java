package com.hotelreservationservice;

public class Hotels {
    private String hotelName;
    private int dailyRate;

    public Hotels(String hotelName,int dailyRate) {
        this.hotelName = hotelName;
        this.dailyRate = dailyRate;
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
