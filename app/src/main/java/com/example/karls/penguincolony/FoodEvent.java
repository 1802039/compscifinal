package com.example.karls.penguincolony;

import java.util.Random;



/**
 * Created by 1802070 on 4/12/2018.
 */

public class FoodEvent implements Event {

    Random rand = new Random();


    @Override
    public int foodEffect(){
        int  n = rand.nextInt(2) + 1;
        //2 is the maximum and the 1 is our minimum
        if (n == 1){

        }

        return 0;
    }

    @Override
    public int pinguEffect() {
        return 0;
    }
}
