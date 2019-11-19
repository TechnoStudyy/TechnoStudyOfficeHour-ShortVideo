package OfficeHour13_Methods;

import java.util.ArrayList;

public class OfficeHour13_Main {


    /*

    name is RadnomGenrator
    This method taking a number(int) as parameter  and return the int Creating random number

    Create one method name os reverseString
     This method takign a String as parameter and returning the String as a parameter and reverse_string

    Create one method name is CheckPalindrome
       This method taking two string and  verifying those are equal check the palindrome


     */

    public static void main(String[] args) {
        OfficeHour13_MethodExercise obj1 = new OfficeHour13_MethodExercise();

/*
        Create one arraylist <String>
        Get any Strign from it
        Get the reverse of that String
        Check is that string is palindrome

 */

        ArrayList<String> arr1 = new ArrayList<>();

        arr1.add("civic");
        arr1.add("dad");
        arr1.add("Water");
        arr1.add("mom");
        arr1.add("Apple");
        arr1.add("kayak");
        arr1.add("Windows");
        arr1.add("radar");
        arr1.add("Table");
        arr1.add("asd");
        arr1.add("Winsadsddows");
        arr1.add("raasddar");
        arr1.add("Tadsable");

        int myRand = obj1.RadnomGenrator(arr1.size());

        String myStr= arr1.get(myRand);

        String reverseMyStr = obj1.reverseString(myStr);

        boolean chckPalindrome = obj1.CheckPalindrome(myStr , reverseMyStr);

        System.out.println("word is -->" + myStr + " is it palindrome -->" + chckPalindrome);


//        int anyRnd = obj1.RadnomGenrator(100);
//
//        System.out.println("anyRnd -->>>  "+anyRnd);
//
//        String mystr="Sometinhg";
//
//        String reverseMyStr = obj1.reverseString(mystr);
//
//        System.out.println("reverseMyStr  -->>  "+reverseMyStr);
//
//        boolean isPalindrome = obj1.CheckPalindrome("s1s1" , "s1s2");
//
//        System.out.println(isPalindrome);




    }
}
