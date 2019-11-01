import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShortVideoClass7 {

    public static void main(String[] args) {

//        Creating the arrayList

        List<String> str1 = new ArrayList<>();

        List<Integer> str2 = new ArrayList<>();

        List<Double> str3 = new ArrayList<>();

//        Add in the arraylist

        str1.add("new jersey");
        str1.add("1");


        str2.add(2);
        str2.add(10);
        str2.add(100);
        str2.add(1000);
        str2.add(20);
        str2.add(2000);
        str2.add(3000);

        str3.add(3.2);
        str3.add(3.5);

//        print all the arraylist
        System.out.println("str2 is here "+str2);
        System.out.println("str1 is here "+str1);

//        Get the value in the arraylist and print the value 1, 3 ,5
        int[] intArr ={1,2,3,4,5};
        System.out.println(intArr[2]);

        System.out.println("str2.get 5 is here "+str2.get(5));

        System.out.println("---------------------------");
//        print with a for loop

        for(int i = 0 ; i < str2.size() ; i++){

            System.out.println(str2.get(i));

        }

        System.out.println("---------------------------");
//        get the element position in the arraylist

        List<String> strArr = new ArrayList<>();

        strArr.add("New Jersey");
        strArr.add("New York");
        strArr.add("Virginia");
        strArr.add("Georgia");
        strArr.add("Maine");
        strArr.add("meine");


        System.out.println("index of is in this line "+strArr.indexOf("Virginia"));

        System.out.println("---------------------------");

//        sort the arraylist

        System.out.println("strarr before the sorting "+strArr);

        Collections.sort(strArr);

        System.out.println("strarr after the sorting "+strArr);

//       arraylist sorting with upper case (make all the value upper case and sort it )

//       create a int arraylist store multiple values and get the sum of the arraylist


    }
}
