package OfficeHour13_OOP1;

public abstract class PersonInformation {

    private String name;
    private int age;
    private int income;


    public PersonInformation(String name, int age, int income ){

        this.name = name;
        this.age = age;
        this.income = income;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public abstract void anything();  this is a abstract method in the abstract class (You have to type the abstract keyword)



}
