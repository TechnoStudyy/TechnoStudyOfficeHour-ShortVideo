package shortVideoOverloadingVSOverriding;

import java.util.Random;

public class childClass extends superClass {


    public void myMethod(){
        System.out.println("im in the first myMethod");
    }


    public void myMethod(String s1){
        System.out.println("im in the first myMethod and s1 is here --->> " + s1);
    }

//      to make the overloading you need a at least one different parameter type  or parameter count
    public void myMethod(int s1){
        System.out.println("im in the first myMethod and s1 is here --->> " + s1);
    }

    public int myMethod(int s1 , int i2 ){
        System.out.println("im in the first myMethod and s1 is here --->> " + s1);

        return 2;
    }

//    if the parameter count and type is same even though return type is different overloading will not accept this
//    public int myMethod(String s1){
//        System.out.println("im in the first myMethod and s1 is here --->> " + s1);
//
//        System.out.println("im in the first --->> " + s1);
//    }

    public final void m1(){


    }

    public final void m1(int i1){


    }


    @Override
    public void IamSuper(int i1) {
        super.IamSuper(i1);

        System.out.println("I am in the child class ");
    }


    public static void IamStatic(){

        System.out.println("I am static in the Child class");

    }


    public int randomNum(int max){

        Random rnd = new Random();

        int myRandom = rnd.nextInt(max);

        return myRandom;

    }

    public int randomNum(int min , int max){

        Random rnd = new Random();

        int myRandom = rnd.nextInt(max-min )+min;

        return myRandom;

    }

}
