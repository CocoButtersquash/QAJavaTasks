package com.company;

import java.util.ArrayList;

/**
 * Created by Administrator on 08/08/2017.
 */

public class Garage {
    private ArrayList<Vehicle> garage = new ArrayList<>();

    public Garage(){

    }


    public void addVehicle(Vehicle toAdd){
        garage.add(toAdd);


    }
   public double calculateTotal(){
       double total = 0.00;
        for(Vehicle i : garage){
            if(!i.isWorking){
                if(i instanceof Car){
                     total = total + (i.value / 10);


                }
                else if(i instanceof  Truck){
                    total = total + (i.value / 8.75);

                }
                else{
                    total = total + (i.value / 15);

                }

            }

        }

       return total;
   }
   public void emptyGarage(){
       garage.clear();
   }
   public void removeVehicle(Vehicle vehicle){
       garage.remove(vehicle);
   }
   public String removeVehicleByRegistration(String reg){
       String response = "";
       for (Vehicle i : garage){
           if (i.regNo.equals(reg)){
               response = "Vehicle " + i.regNo + " was removed";
               garage.remove(i);


           }
           else{response = "Vehicle is not in the garage";

       }

   }
       return response;

   }

   public double  costToFixVehicleWithReg(String reg){
       double cost = 0.00;
       for (Vehicle i : garage){
           if (i.regNo == reg){
               if (i instanceof Car){
                   cost = i.value * 0.1;
               }
               else if (i instanceof Truck){
                   cost = i.value * 0.125;

               }
               else {
                   cost = i.value * 0.05;
               }

           }
       }

       return cost;
   }
   public void removeTypes(String type){
       for(Vehicle i : garage){
           if(i instanceof Car && type == "Car"){
               garage.remove(i);

           }
           else if(i instanceof Truck && type == "Truck"){
               garage.remove(i);


           }
           else if(i instanceof Motorcycle && type == "Motorcycle"){
               garage.remove(i);


           }
       }

   }
   public void fixVehicle (Vehicle vehicle){
       vehicle.isWorking = true;
   }
}