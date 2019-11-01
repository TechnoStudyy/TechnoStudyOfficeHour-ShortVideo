import java.util.Scanner;

public class OfficeHour5 {

    public static void main(String[] args) {

//        print even numbers 1 - 100
//              2 - 4 -6 -8 -10

//        any number % 2 = 0

            for(int i = 1 ; i<100 ;i++){

               if(i%2==0){

                   System.out.println("even numbers are here " + i);

               }


            }


        System.out.println("==============================================");

//        print odd numbers  1 - 100 1- 3- 5- 7- 9-11

            for (int i= 1;i<100 ;i++){

                if(i%2==1){

                    System.out.println("odd numbers are here " + i);

                }

            }

        System.out.println("========================================");


//        enter 3 numbers and find the bigger one
//        int i = 5 int i2 = 10 int i3 = 1

        int i1 = 17;

        int i2 =15;

        int i3 =18;

//        || "or"  is even one condition is true then it is going in that statement

//        && "and" two of the conditions are should be true then it is going to that statement

        if(i1>=i2){

            if(i1>=i3) {

                System.out.println("this is the bigger number i1 " + i1);

            }

        }else if(i2>=i1 ){

            if(i2>=i3) {

                System.out.println("this is the bigger number i2 " + i2);

            }

        }else{

            System.out.println("this is the bigger number i3 " + i3);

        }


//        print prime numbers from 1 to 100
//          7-11-13-17-19 - 23

//        == equals sign
//        != is not equal sign

//        prime should divide by 1 or itself

//
        for (int i=2 ; i<100 ; i++){

            if(i<9){

               if(i%2!=0){

                   System.out.println("this is a prime number "+i);

               }

            }else if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0){

                System.out.println("this is a prime number" + i);

            }


        }



        for(int i = 2 ; i<100 ;i++){

//            if(i%num!=0){
//
//            }

        }



//        enter your salary and find the tax according to that salary
//          find the tex rate enter salary and
//          if salary<20000  tax is 10 % salary * 10 / 100
//          if salary<50000  tax is 15 % salary * 15 / 100
//          if salary<80000  tax is 25 % salary * 25 / 100
//          if salary<10000  tax is 30 % salary * 30 / 100
//             print the result salary - tax = net income

        Scanner scan = new Scanner(System.in);

        System.out.println("Please type your salary");

           int salary = scan.nextInt();

           int tax = 0;

        if(salary<20000){

           tax =  salary * 10 / 100;

        }else if(salary<30000){

            tax =  salary * 15 / 100;

        }else if(salary<80000){

            tax = salary *25 / 100 ;

        }else{

            tax = salary *30 /100;
        }

        int netIncome = salary - tax;

        System.out.println("net income is here --- > "+netIncome);


    }
}
