package com.task;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Train {
    private String Destination;
    private String NumberOfTrain;
    private Date time = new Date();
    private SimpleDateFormat sdf = new SimpleDateFormat("H.m");
    private Train[] Trains;
    Train() {
    }

    public String getDestination() {
        return Destination;
    }

    public String getNumberOfTrain() {
        return NumberOfTrain;
    }

    public Date getTime() {
        return time;
    }

    @Override

    public  String toString () {
        return " Number of train " + this.NumberOfTrain + " destination " + this.Destination + " departure time " + sdf.format(this.time);
    }
    public void getInfoByNumber (Train[] trains , String number) {
        for (Train t : trains) {
            if (t.getNumberOfTrain().equals(number))
                System.out.println(t.toString());
        }
    }

    public void sortByNumberOfTrain (Train[] trains) {
        Arrays.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                return o1.getNumberOfTrain().compareToIgnoreCase(o2.getNumberOfTrain());
            }
        });
    }

    public void sortByDestination (Train[] trains) {
        Arrays.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
               if ( o1.getDestination()== o2.getDestination())
                return o1.getTime().compareTo(o2.getTime());
                return o1.getDestination().compareToIgnoreCase(o2.getDestination()) ;
            }
        });
    }

    public static Builder newBuilder() {
        return new Train().new Builder();
    }

    public  class Builder {
    private Builder() {

    }
    public Builder setNumberOfTrain(String numberOfTrain) {
        Train.this.NumberOfTrain = numberOfTrain;
        return this;
    }
    public Builder  setDestination(String destination) {
        Train.this.Destination = destination;
        return this;
    }
    public Builder setTime(Date time) {
        Train.this.time = time;
        return this;
    }
    public Train build () {
        return  Train.this;
    }
}
}
