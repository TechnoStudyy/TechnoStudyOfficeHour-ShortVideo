public class OfficeHour10 {

    public static void main(String[] args) {

//          Split String and array

            String str = "I love Java";

//          why we need to use split

            String[] strArr =str.split(" ");

            for(int i = 0 ;i<strArr.length ; i++){

                System.out.println(strArr[i]);
            }

            String URL = "https://www.etsy.com/TeddyBear/listing/674066061/ring-security-teddy-bear-and-gift-bag-8?ga_order=most_relevant&ga_search_type=all&ga_view_type=gallery&ga_search_query=teddy+bear&ref=sc_gallery-1-2&plkey=4c19dd30850b84785c5ce85d6741aa27ccebb5ed%3A674066061&bes=1";

//          674066061

            String[] URLArr = URL.split("/");

//            first way:
            System.out.println("first wayy  ----->>>>    "+URLArr[5]);

//            second way:
                for(int i = 0; i<URLArr.length; i++){

                    if(URLArr[i].equals("listing")){

                        System.out.println("second way ----->>>>   "+URLArr[i+1]);

                    }

                }



//          there is one double and stored 16 digits and if even numbers total (16) and odd numbers total (14) 16+14 =30 % 10 ==0

//                                0123456
                String CardNum = "6654784521589758";

//                                 6 4 8 5 1 8 9 8  = 49 total  even numbers
//                                6 5 7 4 2 5 9 5  =  43 total odd numbers
//                                                    92 % 10 = 2
//                                                 print this is not a valid card number
//                                                    90 % 10 = 0
//                                                 print this is a valid card number


//                  need to separate the string by each character
                char[] CardChar = CardNum.toCharArray();


                int TotalEven = 0;
                int TotalOdd = 0 ;


//             read the value in the char one by one
                    for(int i =0 ; i<CardChar.length ; i++){

                        int myNum = 0 ;
//                     odd numbers
                        int myNum1 = Integer.parseInt(String.valueOf(CardChar[i]));
                        if(i%2==0){

                             myNum = myNum1;

                            TotalOdd = TotalOdd + myNum;

//                            even numbers
                         }else if(i%2==1){

                             myNum = myNum1;

                            TotalEven = TotalEven + myNum;

                        }


                    }

        System.out.println(TotalEven);
        System.out.println(TotalOdd);

        int myTotal = TotalEven+TotalOdd;

        System.out.println("my total ---->>>   "+myTotal);


        if(myTotal%10==0){

            System.out.println("This is a valid number ");
        }else{
            System.out.println("This is not a valid number ");
        }




//        What is parse int

            String myNume = "1000";

            String myNume2 = "2000";

             int myNumint = Integer.parseInt(myNume);
             int myNume2int = Integer.parseInt(myNume2);

             int totalParse=  myNumint  + myNume2int;

        System.out.println(totalParse);








//          tochararray
    }
}
