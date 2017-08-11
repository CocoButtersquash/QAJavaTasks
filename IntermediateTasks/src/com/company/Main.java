package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println(blackjack(5, 7));
        System.out.println(uniqueSum(1,2,3));
        System.out.println(uniqueSum(1,1,3));
        System.out.println(uniqueSum(1,2,1));
        System.out.println(uniqueSum(1,3,3));
        System.out.println(tooHot(100,true));
        System.out.println(tooHot(20,true));
        System.out.println(tooHot(100,false));

        Person jack = new Person("Jack",22,"Baker");
        Person ryan = new Person("Ryan",25, "Writer");
        Person chris = new Person("Chris",56,"Banker");

        ArrayList<Person> people = new ArrayList<>();
        people.add(jack);
        people.add(ryan);
        people.add(chris);

        outputPeople(people);
        findPerson("Jack",people);
        findPerson("jack",people);
        findPerson("bob",people);



    }
    @Test
    public void testBlackjack(){
        Assert.assertEquals(blackjack(21,22),21);
        Assert.assertEquals(blackjack(25,23),0);
        Assert.assertEquals(blackjack(12,9),12);


    }

    public static int blackjack(int firstNum, int secondNum) {
        int result = 0;
        int biggest = Integer.max(firstNum, secondNum);
        int smallest = Integer.min(firstNum, secondNum);
        if (biggest <= 21) {
            result = biggest;
        } else if (smallest <= 21) {
            result = smallest;

        } else {
            result = 0;
        }
        return result;

    }
        @Test
        public void testUniqueSum(){
            Assert.assertEquals(uniqueSum(1,1,2),2);
            Assert.assertEquals(uniqueSum(3,4,3),4);
            Assert.assertEquals(uniqueSum(6,7,7),6);
            Assert.assertEquals(uniqueSum(1,2,3),6);



        }

    public static int uniqueSum(int first, int second, int third) {
        int sum = 0;
        if (first == second) {
            first = 0;
            second = 0;
        } else if (first == third) {
            first = 0;
            third = 0;
        } else if (second == third) {
            second = 0;
            third = 0;
        }
        sum = first + second + third;
        return sum;
    }
    public static boolean tooHot(int temperature, boolean isSummer){
    boolean answer = false;
        int upperLimit = 90;

        if (isSummer){
            upperLimit = 100;

        }
        if(temperature >= upperLimit){
            answer = true;
        }
        return answer;
    }
    public static void outputPeople(ArrayList<Person> people){

        for(Person i : people){
            System.out.println(i.toString());
        }
    }
    public static void findPerson(String name, ArrayList<Person> people){

        for(Person i : people){
            if (i.isName(name)){
                System.out.println(i.toString());
                return;


            }




        }

        System.out.println("Person was not Found");



    }
}
