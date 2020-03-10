package com.task;
import java.io.EOFException;
import java.io.IOException;

public class Time {
    private int hours=0;
    private int minuts=0;
    private int seconds=0;
    Time ()
    {

    }
    Time ( int hours, int minuts, int seconds)
    {
        this.hours = hours;
        this.minuts = minuts;
        this.seconds = seconds;
    }


    public void setMinuts(int minuts) {

        try { if (minuts < 0 || minuts > 60)
            {
            this.minuts = 0;
            }
            else { this.minuts = minuts;} }
        catch (IllegalArgumentException e ) { this.minuts = 0;}

    }

    public void setSeconds(int seconds) {
       try { if (seconds < 0 || seconds > 60)
        {
            this.seconds = 0;
        }
        else { this.seconds = seconds;} }
       catch (IllegalArgumentException e ) { this.seconds = 0;}
    }

    public void setHours(int hours)   {
       try { if (hours < 0 || hours > 24)
        {
            this.hours = 0;
        }
        else { this.hours = hours;}

       }
       catch (IllegalArgumentException e ) { this.hours = 0;}
    }
    public void infoTime ()
    {
        System.out.println(" now time: " + this.hours + ":" + this.minuts + ":" + this.seconds);
    }
    public void  changeTime (int hours, int minuts, int seconds)
    {
         int timeInSecond = hours * 3600 + minuts * 60 + seconds;
         int timeInSecondFirst = this.hours * 3600 + this.minuts * 60 + this.seconds;
         int AllTime = timeInSecond + timeInSecondFirst;
         hours = (int) AllTime / 3600;
         minuts = ( int) (AllTime - (hours *3600)) / 60;
         seconds = AllTime - hours * 3600 - minuts * 60;
         this.hours = hours;
         this.minuts = minuts;
         this.seconds = seconds;
    }

}

