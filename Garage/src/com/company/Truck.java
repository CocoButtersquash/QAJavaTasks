package com.company;

/**
 * Created by Administrator on 07/08/2017.
 */
public class Truck extends Vehicle {
    boolean hasTrailer;
    public Truck( boolean hasTrailer,String make,String model,String reg,String engine,
                  int topSpeed, boolean working, double price){
        super(make,model,reg,engine,topSpeed,working,price);
        this.hasTrailer = hasTrailer;


    }

}
