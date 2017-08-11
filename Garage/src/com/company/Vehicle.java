package com.company;

/**
 * Created by Administrator on 07/08/2017.
 */
public class Vehicle {
   public String regNo,engineSize,make,model;
    public int topSpeed;
    public boolean isWorking;
    public double value;


    public Vehicle(String make, String model, String regNo, String engine,
                   int topSpeed, boolean working, double value)
    {
        this.make = make;
        this.model = model;
        this.regNo = regNo;
        engineSize = engine;
        this.topSpeed = topSpeed;
        isWorking = working;
        this.value = value;
    }






}
