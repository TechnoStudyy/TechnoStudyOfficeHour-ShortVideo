import javax.sound.sampled.Line;
import java.util.*;

public class ShortVideoClass9_Map {
    public static void main(String[] args) {

        /*

        what is map

        tree map ordering by the key value if it is string order by alphabet if it is number (int ,double... ) smaller to bigger

        Linked hash map ordering by the added order ( first in first out )

        Hashmap does not have any ordering any structure to print the values

        Store one key and multiple values in the map

 */

/*
    what is map

        map is like an arraylist you can store multiple values but it is key and value paired

        and key should be unique and value can be duplicated

 */

//  tree map ordering by the key value if it is string order by alphabet if it is number (int ,double... ) smaller to bigger

        Map<String , String> mapTree = new TreeMap<>();

        mapTree.put("James" , "Ohio");
        mapTree.put("Steven" , "Vegas");
        mapTree.put("David" , "New York");
        mapTree.put("Wayne" , "London");
        mapTree.put("James" , "Maine");
        mapTree.put("Carly" , "London");

        System.out.println("maptree  -->>> " + mapTree);

        Map<Integer , Integer> maptree2 = new TreeMap<>();

        maptree2.put(1,20);
        maptree2.put(5,20);
        maptree2.put(2,20);
        maptree2.put(0,20);

        System.out.println("maptree2 --->> "+maptree2);

//    Linked hash map ordering by the added order ( first in first out )

        Map<String , String> mapLinked1 = new LinkedHashMap<>();

        mapLinked1.put("USA" , "DC");
        mapLinked1.put("England" , "London");
        mapLinked1.put("France" , "Paris");
        mapLinked1.put("China" , "Beijing");
        mapLinked1.put("Germany" , "Berlin");

        System.out.println("Maplinked1 --->>" + mapLinked1);

//    hash map does not have any ordering any structure to print the values

        Map<String , String> mapHashMap1 = new HashMap<>();

        mapHashMap1.put("USA" , "DC");
        mapHashMap1.put("England" , "London");
        mapHashMap1.put("France" , "Paris");
        mapHashMap1.put("China" , "Beijing");
        mapHashMap1.put("Germany" , "Berlin");
        mapHashMap1.put("Russia" , "Moscow");
        mapHashMap1.put("Greece" , "Athene");

        System.out.println("mapHashMap1 --->>" + mapHashMap1);


//  Linked LinkedHashMap print with for loop

        Map<Integer , String> mapLinkedHash = new LinkedHashMap<>();

        mapLinkedHash.put(0 , "Lion");
        mapLinkedHash.put(1 , "Tiger");
        mapLinkedHash.put(2 , "Cat");
        mapLinkedHash.put(3 , "Dog");
        mapLinkedHash.put(4 , "Elephant");

        for(int i = 0 ; i< mapLinkedHash.size() ; i++){

            System.out.println(mapLinkedHash.get(i));

            if(mapLinkedHash.get(i).equals("Cat")){

                System.out.println("miao");

                break;

            }

        }


//      Store one key and multiple values in the map

        List<String> person1= new ArrayList<>();
        person1.add("James");
        person1.add("Dell");

        List<String> person2= new ArrayList<>();
        person2.add("Sergio");
        person2.add("Apple");

        List<String> person3= new ArrayList<>();
        person3.add("Lionel");
        person3.add("Lenovo");

        Map<Integer , List<String>> LinkedMap3 = new LinkedHashMap<>();

        LinkedMap3.put(1 , person1);
        LinkedMap3.put(2 , person2);
        LinkedMap3.put(3 , person3);

        System.out.println("LinkedMap3  ---->>> "+LinkedMap3);

        for(int i =1 ; i<=LinkedMap3.size() ; i++){

            for(int j = 0 ; j<LinkedMap3.get(i).size()-1 ; j++){

                System.out.println("person " + i + " name is " + LinkedMap3.get(i).get(j) + " and he/she is using the " + LinkedMap3.get(i).get(j+1));

            }


        }




    }


}
