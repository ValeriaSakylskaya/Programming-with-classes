package com.task;

import Enums.TypeOfFood;
import Enums.TypeOfTransport;
import Enums.TypeOfVoucher;

public class TravelVoucher {
    private String nameVoucher;
    private TypeOfVoucher typeOfVoucher;
    private TypeOfTransport typeOfTransport;
    private TypeOfFood typeOfFood;
    private int countDays;
    TravelVoucher (String nameVoucher, TypeOfVoucher typeOfVoucher, TypeOfTransport typeOfTransport, TypeOfFood typeOfFood, int countDays)
    {
        this.nameVoucher = nameVoucher;
        this.typeOfVoucher = typeOfVoucher;
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

    public TypeOfVoucher getTypeOfVoucher() {
        return typeOfVoucher;
    }

    public TypeOfTransport getTypeOfTransport() {
        return typeOfTransport;
    }

    public String getNameVoucher() {
        return nameVoucher;
    }

    @Override
    public String toString()
   {
       return " Voucher: " + this.nameVoucher + " transport " + this.typeOfTransport + " type of voucher " + this.typeOfVoucher + "  food " + this.typeOfFood + " cound days " + countDays;
   }
}
