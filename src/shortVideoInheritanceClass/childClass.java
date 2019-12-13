package shortVideoInheritanceClass;

public class childClass extends superClass{

/*
*       In override we can NOT change the:
*
*           method name
*           return type
*           parameter count
*           parameter type
*
*               but you can change the body
*
*           to achive to override you need a parent and child relationship
*
*           override can not happen in one class
*
*           overloading vs overriding
 */


    @Override
    public void studyInUnversity(String universityName ) {
        super.studyInUnversity(universityName);
        System.out.println("I also get my master in the same school");
    }

//    public String getAJob(String companyName){
//
//        String s1 ="I am working in this company --> " + companyName;
//
//        return s1;
//    }

}
