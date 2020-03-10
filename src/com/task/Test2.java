package com.task;

public class Test2 {
    private int firstValue;
    private int secondValue;

    Test2 ()
    {
        this.firstValue = 5;
        this.secondValue = 4;
    }
    Test2(int firstValue , int secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public void setFirstValue(int firstValue) {
        this.firstValue = firstValue;
    }

    public void setSecondValue(int secondValue) {
        this.secondValue = secondValue;
    }

    public int getFirstValue() {
        return firstValue;
    }

    public int getSecondValue() {
        return secondValue;
    }
}
