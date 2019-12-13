package shortVideoOverloadingVSOverriding;

import java.util.Random;

public class overloadingVSoverriding {

    /*
    *       Overloading vs overriding
    *
    *       OVERLOADING
    *
    *       1) overloading is happening in the one class
    *
    *       2) Overloading we can change the return type , parameter type , parameter count
    *
    *       3) you can overload the private and final methods
    *
    *       4) You can overload the static methods
    *
    *       OVERRIDING
    *
    *       1) overriding is happening in the multiple classes (parent and child class)
    *
    *       2) overriding we can not change the return type , parameter type , parameter count
    *
    *       3) you can NOT override the private and final methods
     *
     *      4) you can NOT override the static methods
     *
     */

    public static void main(String[] args) {

        childClass c1 = new childClass();

        c1.myMethod("anything");

        superClass s1 = new superClass();

        superClass.IamStatic();

        int r1 = c1.randomNum(999999999);

        int r2 =c1.randomNum(999999999 - 100000000 );

        System.out.println(r1+"  r1 is here ");

        System.out.println(r2+"  r2 is here ");

    }



}
