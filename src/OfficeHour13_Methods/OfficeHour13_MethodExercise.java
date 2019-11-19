package OfficeHour13_Methods;

import java.util.Random;

public class OfficeHour13_MethodExercise {

      /*

    name is RadnomGenrator  <-----   copy the nmae from here
    This method taking a number(int) as parameter  and return the int Creating random number

    Create one method name os reverseString
     This method takign a String as parameter and returning the String as a parameter and reverse_string

    Create one method name is CheckPalindrome
       This method return type boolean taking two string and verifying those are equal check the palindrome

     */

    public int RadnomGenrator(int max){

        Random rnd = new Random();

        int myRnd = rnd.nextInt(max);

        return myRnd;

    }


//      something  gnihtemos
    public String reverseString(String s1){

        String reverse="";

        char[] strarray = s1.toCharArray();

        for(int i = strarray.length-1 ; i>=0 ; i--){

            reverse = reverse + strarray[i];

        }

        return reverse;
    }

    public boolean CheckPalindrome(String s1 , String s2){

        boolean b1 = s1.equals(s2);

        return  b1;

    }

}
