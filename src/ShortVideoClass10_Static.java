public class ShortVideoClass10_Static {

/*
        Global variable vs local variable

                Global variable --->>  when you are creating a variable if it is not in the method and in the class it calls as a global variable

                Local variable --->> When you are creating a variable if it is in the method then it is calling as a local variable

        What is non static?

                non static field(variable )  and non static method

                int i =10;   non static field

                public void methods(){  non static method

                 System.out.println("Something");

                }

        creating an object in JAVA

        What is static?

            static field and static method in java

                you cannot connect to non static variable in the static method to connect to non static method or variable you need to create an object

                can you connect to static variable in the non static method ??  yes , i can connect to static variables in the non static methods

                if I am using multiple objects then static variable is taking the value from the previous object

                Connect to static method or static variable you dont need to create a object


 */

    int age = 20; //Global variable

    static int age2 =  20 ;

    public void myMethod1(){

        int carAge = 23; //local variable

        System.out.println("carage in the myMethod1 --->>> " + carAge);
    }

    public void myMethod2(){

        System.out.println("my age in the mymethod 2 non static --->> "+age++);

        System.out.println("age2 is here in the myMethod2  static   --->> " + age2++);

//        System.out.println(carAge);  this variable is local variable in the myMethod1 so we are able to connect just in the myMethod1

    }

    public static void myMethods(){

        ShortVideoClass10_Static s1 = new ShortVideoClass10_Static();


        s1.myMethod2();


    }


    public static void main(String[] args) {

        ShortVideoClass10_Static s1 = new ShortVideoClass10_Static();

        s1.myMethod2();

        ShortVideoClass10_Static s2 = new ShortVideoClass10_Static();

        s2.myMethod2();

        ShortVideoClass10_Static s3 = new ShortVideoClass10_Static();

        s3.myMethod2();

        myMethods();

    }


}
