package com.task;


import com.task.Enum.DaysOfWeek;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Airline {
    private String destination;
    private String flightNumber;
    private String typeOfAircraft;
    private Date departureTime = new Date();
    private DaysOfWeek daysOfWeekAir;
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("H.m");

    public Airline(String destination, String flightNumber, String typeOfAircraft , String time , DaysOfWeek daysOfWeekAir) throws ParseException {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.typeOfAircraft = typeOfAircraft;
        this.departureTime = simpleDateFormat.parse(time);
        this.daysOfWeekAir = daysOfWeekAir;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getTypeOfAircraft() {
        return typeOfAircraft;
    }

    public DaysOfWeek getDaysOfWeekAir() {
        return daysOfWeekAir;
    }

    public void setDaysOfWeekAir(DaysOfWeek daysOfWeekAir) {
        this.daysOfWeekAir = daysOfWeekAir;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setTypeOfAircraft(String typeOfAircraft) {
        this.typeOfAircraft = typeOfAircraft;
    }

    @Override
    public  String toString () {
        return " " + destination + " " + flightNumber + " " + typeOfAircraft + " " + simpleDateFormat.format(departureTime)  + " " + daysOfWeekAir;
    }


}
