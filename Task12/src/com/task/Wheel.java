package com.task;

import Enums.TypeOfWheel;

public class Wheel {
    private TypeOfWheel typeWheel;

    Wheel() {
        this.typeWheel = TypeOfWheel.SUMMER;
    }

    Wheel(TypeOfWheel type) {
        this.typeWheel = type;
    }

    public TypeOfWheel getTypeWheel() {
        return typeWheel;
    }
}
