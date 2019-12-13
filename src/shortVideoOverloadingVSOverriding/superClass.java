package shortVideoOverloadingVSOverriding;

public class superClass {

        public void IamSuper(int i1 ){

            System.out.println("I am in the super class");

        }

//        because of the final means is you can not change the method after you declared but in override you can change the body of the method
//          so these two rules are not matching each other this is why java is not letting you override final methods
        public final void IamnotSuper(){


        }


        public static void IamStatic(){

            System.out.println("I am static in the super class");
        }

}
