package com.task;

public class Test1 {
   private int firstVar;
   private int secondVar;

    public Test1(){
        this.firstVar = 5;
        this.secondVar = 7;
    }

    public void showValues() {
        System.out.println("var1: " + firstVar + " var2: " + secondVar);
    }
    public void setFirstValue(int newValue) {
        this.firstVar = newValue;
    }

    public void setSecondValue(int secondValue) {
        this.firstVar = secondValue;
    }

    public int getSum() {
        return  this.firstVar + this.secondVar;
    }
    public int getMaxValue() {
        return Math.max(this.firstVar, this.secondVar);
    }
}
