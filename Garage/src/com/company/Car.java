package com.company;

/**
 * Created by Administrator on 07/08/2017.
 */
public class Car extends Vehicle {
   private String noOfWheels, bodyType;



    public Car(String make,String model,String reg,String engine,
               int topSpeed, boolean working, String noOfWheels, String bodyType,double price){
        super(make,model,reg,engine,topSpeed,working,price);
        this.noOfWheels = noOfWheels;
        this.bodyType = bodyType;

    }




}
