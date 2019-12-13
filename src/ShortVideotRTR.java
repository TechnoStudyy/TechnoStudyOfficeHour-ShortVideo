import OfficeHour14_Methods.OfficeHour14_Method;

import java.sql.SQLOutput;
import java.util.*;

public class ShortVideotRTR {


    /*

    note: from monday

            Learn how to do reverse the string by for loop << this is a interview question




        Create a method
         with scanner add 5 numbers in the arraylist(int) then return arraylist

        second medhod
            will take the arraylist as a parameter then return the result as int

            conditions
        if the number is prime then sum it

        if the number is even minus it

        else dont do anything

     */

    public ArrayList<Integer> myArr(int howMany){

        ArrayList<Integer> a1 = new ArrayList<>();

        for(int i =0 ; i<howMany ; i++) {
            Scanner scn = new Scanner(System.in);

            System.out.println("enter the number ");
            int scnInt = scn.nextInt();

            a1.add(scnInt);

        }

        return a1;

    }

    public int myResult(ArrayList<Integer> myArr){

        int total = 0;

        for(int i =0 ; i<myArr.size() ; i++){

            int myNum = myArr.get(i);

            if(myNum==2 || myNum==3 || myNum==5 || myNum==7){

                total = total+myNum;

            }else if(myNum%2!=0 && myNum%3!=0 && myNum%5!=0 && myNum%7!=0 ){

                total = total+myNum;

            }else if(myNum%2==0){

                total = total - myNum;

            }else{

                continue;

            }

        }

        return total;

    }

/*

int i1 = 25

result 7


 */

    public int[] numtoArr(int myNum){

        String s1 = String.valueOf(myNum);

        char[] c1 = s1.toCharArray();

        int[] charToint = new int[c1.length];

        for(int i = 0 ; i < c1.length ; i++){

            String chartoStr = Character.toString(c1[i]);

            int myInt = Integer.parseInt(chartoStr);

            charToint[i] = myInt;

        }

        return charToint;

    }

//    public int eachNum(int myNum){
//
//        OfficeHour14_Method obj1 = new OfficeHour14_Method();
//
//        int[] intArr = obj1.numtoArr(myNum);
//
//        int total = 0 ;
//
//        for(int  i=0 ; i < intArr.length ; i++){
//
//            total += intArr[i];
//
//        }
//
//        return total;
//    }



}

