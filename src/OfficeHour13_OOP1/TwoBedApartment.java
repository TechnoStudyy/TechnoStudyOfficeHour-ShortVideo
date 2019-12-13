package OfficeHour13_OOP1;

public class TwoBedApartment extends PersonInformation  implements Int_Class{

    public TwoBedApartment(String name, int age, int income) {
        super(name, age, income);
    }




    @Override
    public String salaryIncome(int salary) {

        String result = null;
        if(salary>twoBedMinSalary){

            result = "he can rent the studio , studio price is ==>  " + rent_2bed;

        }else{

            result = "You are not for this apartment dude";

        }
        return result;

    }
}
