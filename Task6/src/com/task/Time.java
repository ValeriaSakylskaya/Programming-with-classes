package com.task;

public class Time {
    private int hours=0;
    private int minutes =0;
    private int seconds=0;

    Time(int hours, int minutes, int seconds)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }


    public void setMinutes(int minutes) {
        try {
            if (minutes < 0 || minutes > 60)
                this.minutes = 0;
            else
                this.minutes = minutes;
        }
        catch (IllegalArgumentException e )
        {
            this.minutes = 0;
        }
    }

    public void setSeconds(int seconds) {
       try {
           if (seconds < 0 || seconds > 60)
            this.seconds = 0;
        else
            this.seconds = seconds;
       }
       catch (IllegalArgumentException e )
       {
           this.seconds = 0;
       }
    }

    public void setHours(int hours)   {
       try
       {
           if (hours < 0 || hours > 24)
            this.hours = 0;
        else
            this.hours = hours;
       }
       catch (IllegalArgumentException e )
       {
           this.hours = 0;
       }
    }
    public void infoTime ()
    {
        System.out.println(" now time: " + this.hours + ":" + this.minutes + ":" + this.seconds);
    }
    public void  changeTime (int hours, int minuts, int seconds)
    {
         int timeInSecond = hours * 3600 + minuts * 60 + seconds;
         int timeInSecondFirst = this.hours * 3600 + this.minutes * 60 + this.seconds;
         int allTime = timeInSecond + timeInSecondFirst;
         hours = (int) allTime / 3600;
         minuts = ( int) (allTime - (hours *3600)) / 60;
         seconds = allTime - hours * 3600 - minuts * 60;
         this.hours = hours;
         this.minutes = minuts;
         this.seconds = seconds;
    }

}

