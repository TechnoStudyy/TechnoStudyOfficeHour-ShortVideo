package OfficeHour12_Static;

import java.util.Random;

public class officehourMethods {

    /*
            static method vs non static method

            return types

            parameters in the methods

     */

//     void --> not returning any thing from the method

    public int randomNum(){

        Random rnd = new Random();

        int myRandomNum =  rnd.nextInt(100);

        return  myRandomNum;

    }

    public String Name(String name){

        String myName = name;

        return myName;

    }





}
