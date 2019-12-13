package OfficeHour14_Methods;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class OfficeHour14_Method {

/*
------------->>

        reverseString

        collections.reverse  <-  instead of using this one

        please the for loop

<---------------

        Create a method
         with scanner add 5 numbers in the arraylist(int) then return arraylist

               24   -    18  = 6
        9   11  13  15  18

        second medhod
            will take the arraylist as a parameter then return the result as int

            conditions
        if the number is prime then sum it

        if the number is even minus it

        else dont do anything

 */

public ArrayList<Integer> ScannerAddNum(){

    Scanner scan = new Scanner(System.in);

    ArrayList<Integer> myArr = new ArrayList<>();

    for(int i =0; i<5 ;i++){

        System.out.println("Please enter your number");

        myArr.add(scan.nextInt());

    }

    return myArr;
}

    public int SumOrMinus(ArrayList<Integer> arr){

        int result = 0;

        for(int i = 0 ; i< arr.size(); i++){
// 2
            int myNum = arr.get(i);

/*
        ||    vs   &&

        || -->    false , true , true , false  ---> true

        && -->   true ,true , true , false    ---> false

 */
            if(myNum == 2 ||myNum == 3 ||myNum == 5 ||myNum == 7) {

                result = result + myNum;

            }else if(myNum%2!=0  && myNum%3!=0 && myNum%5!=0 && myNum%7!=0 ){

                result = result + myNum;

            }else if(myNum%2==0){

                result = result - myNum;

            }else{

                continue;

            }

        }

        return result;
    }


    public int SumOrMinus2(ArrayList<Integer> arr){

        int result = 0;

        for(int myNum : arr){


            if(myNum == 2 ||myNum == 3 ||myNum == 5 ||myNum == 7) {

                result = result + myNum;

            }else if(myNum%2!=0  && myNum%3!=0 && myNum%5!=0 && myNum%7!=0 ){

                result = result + myNum;

            }else if(myNum%2==0){

                result = result - myNum;

            }else{

                continue;

            }

        }

        return result;
    }


    public static void main(String[] args) {

        OfficeHour14_Method obj1 = new OfficeHour14_Method();

        ArrayList<Integer> a1 = new ArrayList<>();

        a1 = obj1.ScannerAddNum();

        System.out.println(a1);

        int total = obj1.SumOrMinus2(a1);

        System.out.println("total --->>> "+total);
    }

}

/*

int i1 = 25

result 7


 */

