package com.task;

import java.util.ArrayList;

public class Region {
    private String regionName;
    private double Square;
    private ArrayList <District> districts = new ArrayList<>();
    private District mainDistrict;
    Region (String regionName, double square, District mainDistrict){
        this.regionName = regionName;
        this.Square = square;
        this.mainDistrict = mainDistrict;
    }
    public String getRegionName() {
        return regionName;
    }
    public void addDistrict(District district)
    {
        this.districts.add(district);
    }
    public String regionalCenter (){
        return mainDistrict.getCity().getCityName();
    }
}
