import java.util.Random;

public class OfficeHour4 {

    public static void main(String[] args) {

        /*

            type of for loops

                    Simple For loop

                    Infinite for loop

                    while loop

                    do while loop

                    Enhanced For loop

           today for loops

                     do while loop

                     for loop with if statement

                            examples : - String in the if statement

                                       - int in the if statement

                                       -

         */


//        Simple For loop

//        counting from 1 to 5
        for(int i = 1 ; i<=5 ; i++ ){

            System.out.println("i is here --->  " + i);

        }

        System.out.println("===============================");

//        sum the numbers from 1 to 5  --> 1+2+3+4+5 = 15

            int total = 0;


            for(int i = 1 ; i<=5 ; i++){

//               0    + 1  =  1
//               1    + 2  =  3
//               3    + 3  =  6
//               6    + 4  =  10
//              10    + 5  =  15
                total = total + i;



            }

        System.out.println("total is here -->  " +total);

        System.out.println("===============================");

//        create 3 random number and between 0 and 30 and sum them


//
//       int num1 = rnd.nextInt(30);
//
//       int num2 = rnd.nextInt(30);
//
//       int num3 = rnd.nextInt(30);
//
//       int total2 = num1 +num2 + num3;
//
//        System.out.println("total2 is here ---> "+total2);

        Random rnd = new Random();

        int total2 = 0 ;

        for (int i=0;i<3;i++){

            int num = rnd.nextInt(30);

            total2 = total2 +num;

            System.out.println("num is here " + num);
        }


        System.out.println("total2 is here ----> "+total2);


//        infinite loop

//        for (short i = 1 ; i>0 ; i++){
//
//            System.out.println(i);
//        }


//        while loop


        int j = 1 ;

        while ( j < 10  ){

            int num = j*5;

            System.out.println(num);

            j++;

        }





    }
}
