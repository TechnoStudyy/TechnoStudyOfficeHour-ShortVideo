package ShortVideo11_Methods;

import java.util.Random;

public class JustMethods {

    public void myStudent(String anyName , int studentScore ){

        String name = anyName;

        int score = studentScore;

        String grade;

        if(score>85 && score<=100){

            grade ="A";

        }else if(score>75 && score <=85){

            grade="B";

        }else if(score>65 && score <=75){

            grade ="C";

        }else if(score>=0 &&score <=65){

            grade = "D";

        }else{

            grade ="There is no score like this ";

        }

        System.out.println("My student name is " + name + " grade is " + grade + " score is " + score );



    }


    public int Randomnumber(int maxNumber){

        Random rnd = new Random();

        int Myrandom = rnd.nextInt(maxNumber);

        return Myrandom;

    }



}
