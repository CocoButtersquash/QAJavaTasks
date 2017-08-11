package com.company;

/**
 * Created by Administrator on 07/08/2017.
 */
public class Motorcycle extends Vehicle {
    private boolean hasSideCar;


    public Motorcycle(String make,String model,String reg,String engine,
                      int topSpeed, boolean working, double price,boolean hasSideCar ){
        super(make,model,reg,engine,topSpeed,working,price);
        this.hasSideCar = hasSideCar;


    }

}
