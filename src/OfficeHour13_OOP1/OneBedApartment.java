package OfficeHour13_OOP1;

public class OneBedApartment extends PersonInformation  implements Int_Class{

    public OneBedApartment(String name, int age, int income) {
        super(name, age, income);
    }

    @Override
    public String salaryIncome(int salary) {

        String result = null;
        if(salary>oneBedMinSalary){

            result = "he can rent the studio , studio price is ==>  " + rent_1bed;

        }else{

            result = "You are not for this apartment dude";

        }
        return result;
    }
}
