package OfficeHour13_OOP1;

public class StudioApartment extends PersonInformation  implements Int_Class{

    public StudioApartment(String name, int age, int income) {
        super(name, age, income);
    }
 

    @Override
    public String salaryIncome(int salary) {

        String result = null;

        if(salary>StudioMinSalary){

            result = "he can rent the studio , studio price is ==>  " + rent_studio;

        }else{

            result = "You are not for this apartment dude";

        }
        return result;
    }



}
