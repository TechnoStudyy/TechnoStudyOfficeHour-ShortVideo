import java.util.Scanner;

public class ShortVideoClass4 {

      /*
            how we going to use it

            type of for loops

                        Simple For loop

                        Infinite for loop

                        while loop

                        do while loop

                        Enhanced For loop

           today for loops

                    Simple For loop

                    infinite loop




         */


    public static void main(String[] args) {

//        Simple For loop

//        start from the smaller number and go to bigger number
            for(int i = 1 ; i<=10 ; i++){

                System.out.println(i);

            }


//        int h =10;
//
//        int h =100;

        System.out.println("============================");

//            counting from the bigger number to smaller number 10-9-8-7-6...
        for(int i = 10 ; i>0 ;i--){

            System.out.println(i);

        }

        System.out.println("============================");
//        sum the numbers from 1 -> 5  1+2+3+4+5 = 15

        int total =0;

        for(int k = 1; k<6 ; k++){

//                   0    +1 = 1
//                   1    +2 = 3
//                   3    +3 = 6
//                   6    +4 = 10
//                   10   +5 = 15
            total = total +k;

            System.out.println(total);
        }


        System.out.println("============================");

//        what happens if the total inside the for loop
        for(int k = 1; k<6 ; k++){

            int total2 =0;

//                   0    +1 = 1
//                   0    +2 = 2
//                   0    +3 = 3
//                   0    +4 = 4
//                   0    +5 =  5
            total2 = total2 +k;

            System.out.println(total2);
        }

        System.out.println("============================");

//        give 3 numbers and sum them

//        tips use the scanner get the numbers and print total

         Scanner scan = new Scanner(System.in);

         int total3 = 0;

         for (int i =1 ;i<6 ;i++){

             System.out.println("Please enter your positive number ");
             int num = scan.nextInt();

//                     0     + 1  = 1
//                     1     + 2  = 3
//                     3     + 3  = 6
             total3 = total3 +num;

             System.out.println(total3);
         }


//        infinite loop


        for (int i =-1 ;i<0 ;i--){

            System.out.println(i);
        }

    }
}
