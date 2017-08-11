package com.company;

/**
 * Created by Administrator on 07/08/2017.
 */
public class Person {
   private String name,job;
    private int age;

Person(){


}
    Person(String name, int age, String jobTitle){
        this.name = name;
        this.age = age;
        job = jobTitle;

    }

    public String toString(){
        return("Name: " + name+   " Age: " + age + " Job Title: " + job );

    }
    public boolean isName(String name){
        if (name == this.name){
            return true;


        }
        else{return false;}


    }


}
