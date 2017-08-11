package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 09/08/2017.
 */
public class PersonHandler {
    List<Person> people = new ArrayList<Person>();
    List<Person> peopleFromFile = new ArrayList<Person>();


    public void writePeopleToFile() {
        BufferedWriter bufferedWriter = null;
        try{
            File file = new File("C:/Users/Administrator/myFile.txt");

            if(!file.exists()){
                file.createNewFile();

            }
            FileWriter fw = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fw);
            for(Person i : people){

                bufferedWriter.write(i.toString());
                bufferedWriter.newLine();

            }




        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                if(bufferedWriter!= null){
                    bufferedWriter.close();
                }

            }catch (Exception e){

            }
        }


    }
    public void addPerson(Person person){
        people.add(person);

    }
    public void readPeople(){
        BufferedReader bufferedReader = null;

        try{
            File file = new File("C:/Users/Administrator/myFile.txt");
            if(file.exists()){
                FileReader fr = new FileReader(file);
                bufferedReader = new BufferedReader(fr);




                while(bufferedReader.lines() != null){
                    String toBeAdded = bufferedReader.readLine();
                    String[] attr = toBeAdded.split(Pattern.quote("."));

                    Person person = new Person(attr[0],attr[1],Integer.parseInt(attr[2]));
                    peopleFromFile.add(person);
                }



            }

        }catch(Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                if (bufferedReader != null){
                    bufferedReader.close();
                }
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }



    }



}