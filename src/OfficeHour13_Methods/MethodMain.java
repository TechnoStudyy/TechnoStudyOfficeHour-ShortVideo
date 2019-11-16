package OfficeHour13_Methods;

import java.util.Random;

public class MethodMain {

/*
        What is methods
            Methods allow us to reuse the code without retyping it.

            Methods are time savers and easy to maintain the code (Easy to change).

        return statement in method
        parameter in method

 */

    public static void main(String[] args) {

        JustMethods m1 = new JustMethods();

        int r1 =  m1.Randomnumber(100);
        m1.myStudent("John" , r1);

        System.out.println( "Random number in the main "+r1);

        int r2 =  m1.Randomnumber(200);
        m1.myStudent("Steven",  r2);


        int r3 =  m1.Randomnumber(300);
        m1.myStudent("Emily", r3);
    }



}
