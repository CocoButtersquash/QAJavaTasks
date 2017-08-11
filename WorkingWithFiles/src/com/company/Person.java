package com.company;

/**
 * Created by Administrator on 09/08/2017.
 */
public class Person {
    String name,occupation;
   int age;

    public Person(String name,String occupation, int age ){
        this.name = name;
        this.occupation = occupation;
        this.age = age;
    }
    public String toString(){
        return  name + "." + occupation + "." + age + "\n";


    }


}
