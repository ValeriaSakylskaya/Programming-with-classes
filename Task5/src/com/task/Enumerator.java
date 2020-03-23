package com.task;

import java.util.Random;


public class Enumerator {
    private int count;
    private int max;
    private int min;
    private Random random = new Random();

    Enumerator() {
        this.max = 100;
        this.min = 0;
        int diff = max - min;
        count = random.nextInt(diff + 1);

    }

    Enumerator(int min, int max, int count) {
        this.min = min;
        this.max = max;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void Increase() {
        int value = this.count + 1;
        if (value > this.max || value < this.min)
            return;
        this.count++;
    }

    public void Decrease() {
        int value = this.count - 1;
        if (value > this.max || value < this.min)
            return;
        this.count--;
    }

}
