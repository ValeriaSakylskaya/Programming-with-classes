package com.task;

public class District {
    private String nameDistrict;
    private double squareDistrict;
    private City city;

    District(String nameDistrict, double squareDistrict, City city) {
        this.city = city;
        this.squareDistrict = squareDistrict;
        this.nameDistrict = nameDistrict;
    }

    public String getNameDistrict() {
        return nameDistrict;
    }

    public double getSquareDistrict() {
        return squareDistrict;
    }

    public City getCity() {
        return city;
    }
}
