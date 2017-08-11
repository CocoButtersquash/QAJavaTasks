package com.company;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by Administrator on 08/08/2017.
 */
public class Wizard {
    ArrayList<Paint> paints = new ArrayList<>();
    Paint cheapomax = new Paint("Cheapomax", 10, 20,19.99);
    Paint averageJoes = new Paint("AverageJoes", 11, 15,17.99);
    Paint duluxourousPaint = new Paint("DuluxourousPaints", 20, 10,25.00);

    public Wizard() {

        paints.add(cheapomax);
        paints.add(averageJoes);
        paints.add(duluxourousPaint);
    }
    public String cheapestPaint(int roomSize){
       String cheap ="";
        double totalCost;
        double cheapest = 20000;



        for (Paint i : paints){
            totalCost = (Math.ceil(roomSize/i.perTin())* i.getPrice());
            if ( cheapest > totalCost) {
                cheapest = totalCost;
                cheap = i.getName();


            }
            }


        return cheap;
        }



    public String wastesLeast(int roomSize){
        double leastWaste = 1;
        double howMany;
        double waste;

        String best = "";
        for(Paint i : paints){
            howMany = roomSize/i.perTin();
            waste = (Math.ceil(howMany) - howMany);


            if (waste < leastWaste){
                best = i.getName();
                leastWaste = waste;
            }
        }

        return best;
    }


    }


