package OfficeHour12_Static;

public class OfficeHour12_StaticMain {


    public static void main(String[] args) {

        OfficeHour12_Static obj1 = new OfficeHour12_Static();

        obj1.method1();
//
//        OfficeHour12_Static.methodStatic();
//
//        OfficeHour12_Static obj2 = new OfficeHour12_Static();
//
//        obj2.method1();

        officehourMethods o1 = new officehourMethods();

        int myRandom = o1.randomNum();

        System.out.println("My Random number "+myRandom);

        String anyName= o1.Name("Tuba");

        System.out.println(anyName);

    }
}
