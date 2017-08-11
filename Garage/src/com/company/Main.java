package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    Garage payAndSpray = new Garage();
        Car voltic = new Car("voltic","vapid","REDF5YY","w16",100,false,"4","Sport",100000.00);
        Truck rig = new Truck(false,"Big","Rig","1234ABC","24",75,false,30000.00);
        Motorcycle sanchez = new Motorcycle("Mitshihashi","Sanchez","TRYF566","500cc",80,false,10000.00,false);

       payAndSpray.addVehicle(voltic);
        payAndSpray.addVehicle(rig);
        payAndSpray.addVehicle(sanchez);

       System.out.println(payAndSpray.calculateTotal());
        System.out.println(payAndSpray.costToFixVehicleWithReg("1234ABC"));

        payAndSpray.removeVehicle(voltic);
        payAndSpray.removeVehicleByRegistration("1234ABC");

        payAndSpray.removeTypes("Car");

        System.out.println(payAndSpray.calculateTotal());
        payAndSpray.emptyGarage();
        System.out.println(payAndSpray.calculateTotal());







    }
}
