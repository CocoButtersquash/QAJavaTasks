package com.company;

public class Main {

    public static void main(String[] args) {
    Person man = new Person("Jack","Programmer",22);
        Person ralph = new Person("Ralph","President",66);
        Person tom = new Person("Ralph","President",66);
        PersonHandler handler = new PersonHandler();

        handler.addPerson(man);
       handler.addPerson(ralph);
        handler.writePeopleToFile();

        handler.readPeople();


        handler.addPerson(tom);
    }
}
