import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class OfficeHour11 {

    public static void main(String[] args) {

        //   break       vs       continue

/*
            We are using break and continue in the for loop

                    when the for loop hit the break it stop the for loop

                    When the for loop hit the continue it pass that step in the for loop

 */

// example of the BREAK
    for(int i =0 ; i<100 ; i++){


       if(i==50){

           break;
       }

        System.out.println(i);

    }

        System.out.println("I am after the for loop ");


        System.out.println("-------------------------------------");

//  example of the CONTINUE

        for(int i = 0; i< 100 ;i++){

            if(i%2==1){

                continue;

            }

            System.out.println(i);

        }


//        verify first array equal to  second array

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Lion");
        list1.add("Tiger");
        list1.add("Elephant");
        list1.add("Cow");

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("Lion");
        list2.add("Tiger");
        list2.add("Cat");
        list2.add("Cow");

//        first use for loop and then use the if statement

        System.out.println("---------------------------");

        boolean result= true;

        for(int i = 0 ; i< list1.size() ; i++){

            if(list1.get(i).equals(list2.get(i))){

                result = true;

            }else{

                result = false;
                break;
            }

        }

        System.out.println("my result is --->> "+  result );


        System.out.println("------------------------------");


        ArrayList<String> list3 = new ArrayList<>();

        list3.add("Lion");
        list3.add("Dog");
        list3.add("Tiger");
        list3.add("Cat");
        list3.add("Lizard");
        list3.add("Elephant");
        list3.add("Cow");


        ArrayList<String> list4 = new ArrayList<>();

        list4.add("Lion");
        list4.add("Elephant");
        list4.add("Dog");
        list4.add("Cow");
        list4.add("Tiger");
        list4.add("Cat");
        list4.add("Lizard");


//      please make sure list 3 contains list 4

//      nested for loop then use a if statment

        boolean check = false;

        for(int i = 0 ; i < list3.size();  i++){

            for(int j =0 ; j<list4.size() ; j++){

              if(list3.get(i).contains(list4.get(j))){

                    check = true;

                    break;
                }else{

                    check = false;


                }



              }

            if(check==false){

                break;
            }

        }

        System.out.println("Check is here ---->>>>   "+check);

    }
}
