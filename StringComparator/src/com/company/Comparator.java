package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Administrator on 09/08/2017.
 */
public class Comparator {

    @Test
    public void testLongest(){
        Assert.assertEquals(longestCommonSubString("Red","Red"),"Red");
        Assert.assertEquals(longestCommonSubString("xxRed","Red"),"Red");
        Assert.assertEquals(longestCommonSubString("Redxxxx","Red"),"Red");
        Assert.assertEquals(longestCommonSubString("wRedw","xRedx"),"Red");

    }



    public String longestCommonSubString(String one, String two) {
        String small, big, smallFromRight = null,smallestEither = null;
        String longest = "",longestRight = "", longsetEither = "";
        int noOfPasses= 0;

        if (one.length() > two.length()) {
            big = one;
            small = two;
            smallFromRight = two;
            smallestEither = two;
        } else {
            small = one;
            big = two;
            smallFromRight = one;
            smallestEither = one;
        }
        noOfPasses = small.length();
        for (int i = 0; i < noOfPasses; i++) {

            if (big.contains(small) ){
                longest = small;
                break;

            } else {
                small = small.substring(0,small.length()-1);


            }

        }
        for(int i = 0; i < noOfPasses; i++){
            if(big.contains(smallFromRight) ){
                longestRight = smallFromRight;
                break;
            }
            else{
                smallFromRight = smallFromRight.substring(1,smallFromRight.length());
            }



        }
        for(int i = 0; i < noOfPasses; i++){
            if(big.contains(smallestEither)){
                longsetEither = smallestEither;
                break;

            }
            if(i % 2 == 0 ){
                smallestEither = smallestEither.substring(0,smallestEither.length()-1);

            }
            else{smallestEither = smallestEither.substring(1,smallestEither.length());}


        }
        if (longest.length() < longestRight.length()) {
            longest = longestRight;
        }
        if(longest.length() < longsetEither.length()){
            longest = longsetEither;

        }
        return longest;


    }

    public String turnOneIntoTheOther(String turnFrom,String turnInto){
        ArrayList<Character> from = putStringInArrayList(turnFrom),
                to = putStringInArrayList(turnInto),
                commonChars = new ArrayList<>();
        Iterator itr = commonChars.iterator();
        String output = "";






        for(Character c : from){
            if (to.contains(c)) {
                
                commonChars.add(c);
            }
        }
        for(Character c : commonChars){
            if(to.contains(c)){

                to.remove(c);
            }
            if(from.contains(c)){
                from.remove(c);

            }
        }



while(itr.hasNext()){
          output += itr.next().toString();


        }
        return output;
    }
    public ArrayList<Character> putStringInArrayList(String convertee){
        ArrayList<Character> turned = new ArrayList<>();
        char[] charString = convertee.toCharArray();
        for(int i = 0;i< charString.length;i++ ){
            turned.add(charString[i]);
        }



        return turned;
    }



}