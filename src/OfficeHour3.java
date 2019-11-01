import java.util.Random;
import java.util.Scanner;

public class OfficeHour3 {

    public static void main(String[] args) {

//        Scanner

//        Random Class

//        Switch statement




//        Scanner

        System.out.println("What is your name? ");

        Scanner scan = new Scanner(System.in);

//        next vs nextLine

//        "next()" is taking until the space for example if you type Ali Koklu in the Run(console):
//      it will print just "Ali"
//
//        "nextLine()" is taking all the text for example if you type Ali Koklu in the Run(console):
//        it will print "Ali Koklu"


        String s1 = scan.nextLine();

        System.out.println("Your name is --> "+s1);


//        typing the int

        System.out.println("How many car you have?");

        System.out.println("scan is in the system out -->  "+scan.nextInt());

        int i1 = scan.nextInt();

        System.out.println("printing the integer i1  -->  " + i1);


//        Random Class

        Random rnd = new Random();

        int i9 = rnd.nextInt();

        System.out.println("random number i1 -->  "+  i1);

        int i2 = rnd.nextInt(20);

        System.out.println("random number i2 -->   "+i2);

        double i4 = Math.random();

        System.out.println(i4);

        double d1 = rnd.nextDouble();

        System.out.println("random d1 is here --> " + d1 );

//        Switch statement

        System.out.println("Type any month");

         Scanner scn2 = new Scanner(System.in);

         String month = scn2.nextLine();

//        type this month :
//           for example if it is January then print January is the first month of the year
//           for example if it is February then print February is the second month of the year

        switch(month){
            case("January"):

                System.out.println(month + " is the first month of the year ");
            break;

            case("February"):

                System.out.println(month + " is the second month of the year ");
            break;

            case("March"):

                System.out.println(month +" is the third month of the year");

            default:
                System.out.println(month + " is not in my options dude ");

        }


        Random rnd3 = new Random();

        int i3 = 12;

        switch(i3){

            case(1):
                System.out.println(i3+". month of the year is January ");
                break;
            case(2):
                System.out.println(i3+". month of the year is February ");
                break;
            case(3):
                System.out.println(i3+". month of the year is March ");
                break;
            case(4):
                System.out.println(i3+". month of the year is April ");
                break;

            default:
                System.out.println("this is out of my range but its okay !!!!!   " + i3 );

            case(5):
                System.out.println("THis is after default");

        }


    }

}
