package com.task;

import java.util.ArrayList;

public class Country {
    private String countryName;
    private double squareCountry;
    private ArrayList <Region> regions = new ArrayList<>();
    private Region mainRegion;
    Country (String countryName, double squareCountry, Region region)
    {
        this.countryName = countryName;
        this.squareCountry = squareCountry;
        this.mainRegion = region;
    }
    public void addRegion(Region region)
    {
        this.regions.add(region);
    }
    public void displayCapital()
    {
        System.out.println("capital: " + mainRegion.regionalCenter());
    }
    public void displayCountRegion()
    {
        System.out.println("count of region: " + regions.size());
    }
    public void displaySquare()
    {
        System.out.println("square: " + this.squareCountry);
    }
    public void displayRegionCenter()
    {
        regions.forEach((region) ->System.out.println("regional  center " + region.regionalCenter()));
    }
}
