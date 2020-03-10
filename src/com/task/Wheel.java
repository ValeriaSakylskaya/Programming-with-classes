package com.task;
import Enums.typeOfWheel;

public class Wheel {
private typeOfWheel typeWheel;
Wheel ()
{
    this.typeWheel = typeOfWheel.summer;
}
Wheel (typeOfWheel type)
{
    this.typeWheel = type;
}

    public typeOfWheel getTypeWheel() {
        return typeWheel;
    }
}
