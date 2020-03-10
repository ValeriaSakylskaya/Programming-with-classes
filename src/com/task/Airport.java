package com.task;

import Enums.DaysOfWeek;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Airport {
    private  Airline [] airline;
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("H.m");
    Airport () throws ParseException {
        airline = new Airline[5];
        airline [0] = new Airline("Minsk", "23", "Tu-134","23.45",DaysOfWeek.MONDAY);
        airline [1] = new Airline("Moscow", "24", "Tu-134","10.12",DaysOfWeek.THURSDAY);
        airline [2] = new Airline("Vilnius", "56", "Tu-204","9.23",DaysOfWeek.THURSDAY);
        airline [3] = new Airline("Vilnius", "21", "Tu-204","5.00",DaysOfWeek.SUNDAY);
        airline [4] = new Airline("Prague", "111", "Tu-134","18.12",DaysOfWeek.WEDNESDAY);
    }
    public String GetFlightByDestination (String destination)
    {
        StringBuilder builder =  new StringBuilder();
        for(int i = 0; i < airline.length; i ++)
        {
            if(destination.equalsIgnoreCase(airline[i].getDestination()))
            {
                builder.append(airline[i].toString() + "\n");
            }
        }
        return builder.toString();
    }
    public String GetFlightByDaysOfWeek(DaysOfWeek day)
    {
        StringBuilder builder =  new StringBuilder();

        for(int i = 0; i < airline.length; i ++)
        {
            if(day == airline[i].getDaysOfWeekAir())
            {
                builder.append(airline[i].toString() + "\n");
            }
        }
        return builder.toString();
    }
    public String GetFlightByDaysOfWeekAndTime (DaysOfWeek day, String time) throws ParseException {
        StringBuilder builder =  new StringBuilder();

        for(int i = 0; i < airline.length; i ++)
        {
            if(day == airline[i].getDaysOfWeekAir() && simpleDateFormat.parse(time).before(airline[i].getDepartureTime()))
            {
                builder.append(airline[i].toString() + "\n");
            }
        }
        return builder.toString();
    }


}
