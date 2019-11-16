package OfficeHour12_Static;

public class OfficeHour12_Static {

    /*

        non Static variable and methods

        Creating the object in java

        What is static?

              if you have a non-static variable you need to create an object in the static method

              if you have a static variable you can call it in the static method and in the non static method --- if variable and
      method in the same class
                    else if --->> variable and method is not in the same class you need to type first class name then variable name


        Create static methods and variables and call it from different classes

        We are not able to create a static variable in the methods

 */

//    non Static variable and methods

        int id= 10;

        String name = "Ali";

        static int countofSStudent=0;

        int nonStaticCountofStudent=0;

        public void method1(){

            System.out.println("id is here --->>>> "+id);
            System.out.println("name is here --->>  "+name);
            countofSStudent++;
            System.out.println("count of student here ---->>>   "+countofSStudent);

            nonStaticCountofStudent++;
            System.out.println("nonStaticCountofStudent here ---->>>   "+nonStaticCountofStudent);

        }

        public static void methodStatic(){

//            countofSStudent=10;
//
//            System.out.println("i am in the static method ---->>>>   "+countofSStudent);

        }

//    public static void main(String[] args) {
//
////        System.out.println("id is here --->>>> "+id);
////        System.out.println("name is here --->>  "+name);
////
////        method1();
//
//
//        //    Creating the object in java
//
//        OfficeHour12_Static o1 = new OfficeHour12_Static();
//
//        o1.method1();
//
//        OfficeHour12_Static o2 = new OfficeHour12_Static();
//
//        o2.method1();
//    }





//
//    What is static?
//
//    Static is a keyword and we have a static fields and static methods
//
//    When you are creted one static field it doent matter how many times you call it
//
//
//    Create static methods and variables and call it from differe



}
