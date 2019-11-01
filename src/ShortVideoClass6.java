public class ShortVideoClass6 {

    public static void main(String[] args) {


//    Why we need to use array

//      If you want to store multiple values then you can use array

        String name1 = "Ali";

        String name2 = "Ahmet";

        String name3 = "Omer";

        System.out.println("String name 1 is here "+name1);


//    how to declare the array

        String[] MyName = new String[10];

//        these are the ways to type the array but it is better to use line 21
        String myName2[] = new String[10];

        MyName[0] = "Ali";
        MyName[1] = "Omer";
        MyName[2] = "Ahmet";
        MyName[3] = "Ali";
        MyName[4] = "Omer";
        MyName[5] = "Ahmet";
        MyName[6] = "Omer";
        MyName[7] = "Ahmet";
        MyName[8] = "Omer";
        MyName[9] = "Ahmet";

        System.out.println("String array myname 9 is here "+MyName[9]);

        int[] number = new int[5];

        number[0] = 1;
        number[1] = 10;
        number[2] = 20;
        number[3] = 30;
        number[4] = 40;

        System.out.println("int array number 1 is here "+ number[1] );

//        other way to create the array
        String[] cars = {"BWM" , "Honda" , "Mercedes" ,"Toyota"};

        System.out.println("String cars2 is here "+cars[3]);



//    how to print the array

//        first way is :
//                    System.out.println("String cars2 is here "+cars[2]);

//        Second way

        String[] countries = {"USA" , "Canada" , "Mexico" ,"Brazil" ,"Peru" , "China" , "Japan" ,"Tayland"};


        for(int i = 0 ; i < countries.length ; i++){

            System.out.println("i is here " + i);
            System.out.println("array value is here "+countries[i]);

        }






//        String s1 ="Techno";
//
//        System.out.println("s1 length is here "+s1.length());








    }
}
