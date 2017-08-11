package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.math.*;


public class Main {

    public static void main(String[] args) {

        helloWorld();
        helloWorldVariable();
        String helloWorld = "Hello World";
        displayString(helloWorld);
        System.out.println(giveString());
        System.out.println(additionWithZero(0,87,false));
        System.out.println(additionWithZero(7,87,true));
        testAddition(9);
        arrayAddition(6);
        int[] testArray = {1,2,3,4};
        displayArray(testArray);
        arrayTimesTen();





    }
    public static void helloWorld(){
        System.out.println("Hello World");
    }
    public static void helloWorldVariable(){
        String phrase = "Hello World";
        System.out.println(phrase);

    }
    public static void displayString(String phrase){
        System.out.println(phrase);

    }
    public  static String giveString(){
        return "Hello World";
    }

    public static int additionWithZero(int firstNum,int secondNum,boolean isAddition){
        int result = 0;
        if(firstNum == 0 || secondNum == 0 || isAddition  ) {
           result = firstNum + secondNum;

        }
        else{
            result = firstNum - secondNum;
        }
        return result;

    }

    public static void testAddition(int timesTable){
        for(int i = 0;i<10;i++){
            System.out.println(additionWithZero(i,timesTable,true));


        }

    }
    public static void arrayAddition(int givenNumber){

        int[] numbers = {5,6,7,34,23,12,34,0,89,9};

        for (int i: numbers){
            System.out.println(additionWithZero(givenNumber, i,true));
        }

    }
    public  static void displayArray(int[] toDisplay){
        for(int i: toDisplay){
            System.out.print(i);
        }

    }
    public static void arrayTimesTen(){
        int[] numbers = new int[9];
        System.out.println();
        for(int i = 0; i <numbers.length; i++){
            numbers[i] = i *17;
            System.out.print(numbers[i]);


        }
        System.out.println();

        for (int i = 0; i< numbers.length; i++){
            numbers[i] = numbers[i] * 10;
            System.out.print(numbers[i]);


        }



    }

}