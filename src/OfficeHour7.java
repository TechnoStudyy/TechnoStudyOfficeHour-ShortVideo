import java.util.Arrays;

public class OfficeHour7 {

    public static void main(String[] args) {

//      Reverse the array     seattle new york     new york seattle

        String[] strarr1 = {"Seattle" , "California" , "Florida", "Texas", "Georgia"};

//      Georgia   Texas  Florida   California   Seattle

            for(int i = strarr1.length-1 ; i>=0 ; i--){

                System.out.print(strarr1[i] + " ");

        }
        System.out.println();
        System.out.println("--------------------");


//      reverse multi dimontional array

//        0 0 ,  0 1 ,0 2
//        1 0 ,  1 1 ,1 2

        String[][] strarr2 = {{"USA" , "Mexico"} , {"South Korea" ,"Russia" , "China"} , {"India","Pakistan"}};

        for(int i = strarr2.length-1 ; i>=0 ; i--){

            for(int j = strarr2[i].length-1 ;j>=0; j--){

                System.out.print(strarr2[i][j] + " ");

            }

            System.out.println();

        }

        System.out.println("----------------------------------------");

//      reverse the each character in the array seattle elttaes new york kroy wen

        String[] strarr3 = {"London", "Paris" ,"Rome" , "Barcelona","Madrid"};

        for(int i = 0 ; i<strarr3.length ; i++){

            char[] strarr3Chars = strarr3[i].toCharArray();

            for(int j = strarr3Chars.length-1 ; j>=0 ; j-- ){

                System.out.print(strarr3Chars[j]);

            }

            System.out.println();
        }

        System.out.println("---------------------------");

//      dirdaM   anolecraB   emoR   siraP   nodnoL
        for(int i = strarr3.length-1 ; i>=0 ; i--){

            char[] strarr3Chars = strarr3[i].toCharArray();

            for(int j = strarr3Chars.length-1 ; j>=0 ; j-- ){

                System.out.print(strarr3Chars[j]);

            }

            System.out.println();
        }

//      Get the String array as $115  $23 , $75  remove the $ and sum the numbers

        System.out.println("----------------------------");


        String[] numarr1 = {"$50" , "$40" , "$30"};

        System.out.println(numarr1.length + " length is here ");

        int total = 0;

            for(int i = 0 ; i<numarr1.length; i++){

                String num1 = numarr1[i];

                num1 = num1.replace("$","");

                System.out.println(num1 + " num1 is  here");

                int mynum = Integer.valueOf(num1);

                total +=  mynum;

            }

        System.out.println(total);

    }
}
