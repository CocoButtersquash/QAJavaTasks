package com.company;

/**
 * Created by Administrator on 07/08/2017.
 */
public class Paint{
    private String name;
    private int coverage;
    private int size;
    private double price;
public Paint(String name, int coverage, int size,double price){
    this.name = name;
    this.coverage = coverage;
    this.size = size;
    this.price = price;
}




    public double perTin(){
    return coverage * size;
    }
    public double costPerLitre(){
        return size/price;
    }
    public double amountLeftWhenUsed(int roomsize){
        double result = roomsize - perTin();

        return result;





    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return  price;

    }
}

