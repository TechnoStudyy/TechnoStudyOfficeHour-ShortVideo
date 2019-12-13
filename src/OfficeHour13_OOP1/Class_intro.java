package OfficeHour13_OOP1;

public class Class_intro {


    /*
        Difference between abstraction vs interface

            You have to type abstract to create a abstract class    You have to type interface to create a interface class

            Abstraction class can contain regular variable(can contain final variable as well)          All the variables in the interface is final

            Variables in the abstract private                       All the variables should be public

            While creating the method you have to type abstract     Default method type is abstract in the interface class(Abstract method Dont have a body)

            Abstract can have a constructor                         Interface can not contain the constructor

        overloading vs overriding

     */


    public static void main(String[] args) {

        StudioApartment p1 = new StudioApartment("Ali" , 35, 600000);

        String person1 = p1.salaryIncome(p1.getIncome());

        System.out.println(person1);

        OneBedApartment o1 = new OneBedApartment("Ahmet" , 27 , 90000);

        String person2 = o1.salaryIncome(o1.getIncome());

        System.out.println(person2);

    }

}
