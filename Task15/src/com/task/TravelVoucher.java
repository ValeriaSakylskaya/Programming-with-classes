package com.task;

import Enums.TypeOfFood;
import Enums.TypeOfTransport;
import Enums.TypeOfVoucher;

public class TravelVoucher {
    private String name;
    private TypeOfVoucher type;
    private TypeOfTransport typeOfTransport;
    private TypeOfFood typeOfFood;
    private int countDays;

    TravelVoucher(String name, TypeOfVoucher type, TypeOfTransport typeOfTransport, TypeOfFood typeOfFood, int countDays) {
        this.name = name;
        this.type = type;
        this.typeOfTransport = typeOfTransport;
        this.typeOfFood = typeOfFood;
        this.countDays = countDays;
    }

    public TypeOfFood getTypeOfFood() {
        return typeOfFood;
    }

    public int getCountDays() {
        return countDays;
    }

    public TypeOfVoucher getType() {
        return type;
    }

    public TypeOfTransport getTypeOfTransport() {
        return typeOfTransport;
    }

    public String getVoucherName() {
        return name;
    }

    @Override
    public String toString() {
        return " Voucher: " + this.name + " transport " + this.typeOfTransport + " type of voucher " + this.type + "  food " + this.typeOfFood + " cound days " + countDays;
    }
}
