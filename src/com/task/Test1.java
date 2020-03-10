package com.task;

public class Test1 {
   private int FirstVar;
   private int SecondVar;

    Test1(){
        this.FirstVar = 5;
        this.SecondVar = 7;
    }

    void ShowValues()
    {
        System.out.println("var1: " + FirstVar + " var2: " + SecondVar);
    }
    void SetFirstValue (int newValue)
    {
        this.FirstVar = newValue;
    }

    void SetSecondValue (int secondValue)
    {
        this.FirstVar = secondValue;
    }

    int GetSum()
    {
        return  this.FirstVar + this.SecondVar;
    }
    int  GetMaxValue ()
    {
        return Math.max(this.FirstVar, this.SecondVar);
    }
}
