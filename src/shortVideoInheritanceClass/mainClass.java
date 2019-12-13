package shortVideoInheritanceClass;

public class mainClass {

/*
*       What is inheritance?
*
*           Inheritance is part of the OOP , it helps to child class to get the methods from the parent class.
*
*           it also known as is-a Relationship which also called parent-child relationship.
*
*           note : we need to use extends keyword while we are using inheritance
*
*
*       Why we need to use inheritance
*           for method overriding
*           for code reusability.
*
*       What is the multiple types of inheritance
*
 */

    public static void main(String[] args) {

        childClass c1 = new childClass();

        c1.getAJob("abc");

        c1.studyInUnversity("international");

        System.out.println("*****************************");

        grandChildClass g1 = new grandChildClass();

        g1.getAJob("somewhere");

        g1.studyInUnversity("bergen");


    }

}
