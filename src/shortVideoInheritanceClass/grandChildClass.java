package shortVideoInheritanceClass;

public class grandChildClass extends childClass {


    /*
           Why java is not allowing a multiple inheritance?

        IMPORTANT NOTE:
            one child can not extends two different classes

            reason : if both super class has the same name of the method but different type of return type(parameter type , parameter count)
                    then java is not able to solve that conflict.

     */
    @Override
    public void getAJob(String companyName) {
        super.getAJob(companyName);

        System.out.println("I am working here for a year");

    }


}
