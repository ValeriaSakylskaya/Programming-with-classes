package com.task;

import com.task.Enum.DaysOfWeek;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Airport {
    private  Airline [] airlines;
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("H.m");

    Airport () throws ParseException {
        airlines = new Airline[5];
        airlines[0] = new Airline("Minsk", "23", "Tu-134","23.45",DaysOfWeek.MONDAY);
        airlines[1] = new Airline("Moscow", "24", "Tu-134","10.12",DaysOfWeek.THURSDAY);
        airlines[2] = new Airline("Vilnius", "56", "Tu-204","9.23",DaysOfWeek.THURSDAY);
        airlines[3] = new Airline("Vilnius", "21", "Tu-204","5.00",DaysOfWeek.SUNDAY);
        airlines[4] = new Airline("Prague", "111", "Tu-134","18.12",DaysOfWeek.WEDNESDAY);
    }

    public String GetFlightByDestination (String destination) {
        StringBuilder builder =  new StringBuilder();
        for(int i = 0; i < airlines.length; i ++)
        {
            if(destination.equalsIgnoreCase(airlines[i].getDestination()))
                builder.append(airlines[i].toString() + "\n");
        }
        return builder.toString();
    }

    public String GetFlightByDaysOfWeek(DaysOfWeek day)
    {
        StringBuilder builder =  new StringBuilder();
        for(int i = 0; i < airlines.length; i ++)
        {
            if(day == airlines[i].getDaysOfWeekAir())
                builder.append(airlines[i].toString() + "\n");
        }
        return builder.toString();
    }

    public String GetFlightByDaysOfWeekAndTime (DaysOfWeek day, String time) throws ParseException {
        StringBuilder builder =  new StringBuilder();
        for(int i = 0; i < airlines.length; i ++)
        {
            if(day == airlines[i].getDaysOfWeekAir() && simpleDateFormat.parse(time).before(airlines[i].getDepartureTime()))
                builder.append(airlines[i].toString() + "\n");
        }
        return builder.toString();
    }

}

