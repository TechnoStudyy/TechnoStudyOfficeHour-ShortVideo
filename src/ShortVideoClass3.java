import java.util.Random;
import java.util.Scanner;

public class ShortVideoClass3 {

    public static void main(String[] args) {

//        Scanner

//        Random Class

//        If else statement




//        Scanner

        Scanner scan = new Scanner(System.in);

        System.out.println("PLease type your first name");

        String s1 = scan.next();

        System.out.println("Your name is ==>  "+s1);

        System.out.println("please type your age ");

        int i1 = scan.nextInt();

        System.out.println("your age is ==> "+  i1 );


//        Random Class

        Random rnd = new Random();

            int randomNum = rnd.nextInt();

            System.out.println("first random number ==>  "+randomNum);

            randomNum = rnd.nextInt(10);

            System.out.println("second random number ==>  "+randomNum);

            randomNum = rnd.nextInt(100);

            System.out.println("third random number ==>  "+randomNum);


        Random rnd2 = new Random();

        double d1 = rnd2.nextDouble();



//        If else statement



//        if you have money more then 9000 you should go to japan for this summer 8000
//
//        else if you have 6000 then go to hawaii 5000
//
//        else if you have 2000 then you should go to miami
//
//        else just stay at home

        Random rnd3 = new Random();

        int i3 = rnd3.nextInt(10000);

        if(i3>9000){

            System.out.println("dude you should go to japan this summer it is just 8000");

        } else if (i3 > 6000 ){

            System.out.println("i think hawaii is also great option for you ");

        }else if ( i3 > 2000){

            System.out.println("at least go to miami i want you to go somewhere ");

        }else {

            System.out.println("just tay at home bro ");
        }

        System.out.println("i3 is here ==> " + i3);












    }
}
