import java.util.*;

public class ShortVideoClass8_Set {

    public static void main(String[] args) {


//        What is set

//        Store the value in the set

//        Three set

//        linked hash set

//        Hashset

//        arrayList vs set

//        hashset vs tree set vs linked hash set



//        What is set

//        Set is like an arraylist and difference arraylist accept duplicated values but set doesnot accept duplicated values


//        Store the value in the set

        List<Integer> List1 = new ArrayList<>();
        List1.add(1);
        List1.add(2);
        List1.add(3);
        List1.add(4);
        List1.add(1);
        List1.add(1);

        System.out.println("this si list1 "+List1);

        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(1);
        set1.add(2);
        set1.add(3);

        System.out.println("this is set1"+set1);

        System.out.println("----------------------------------");

        System.out.println("3. value in the list "+List1.get(3));

//        get is not allowed in the set
//        System.out.println(set1.get);     IS NOT WORKING

        for(Integer i1 : set1){

            System.out.println(i1);

        }


//       Three set

        Set<Double> setTree = new TreeSet<>();

        setTree.add(3.4);
        setTree.add(2.1);
        setTree.add(10.2);
        setTree.add(3.6);
        setTree.add(34.8);
        setTree.add(0.5);
        setTree.add(34.8);
        setTree.add(0.5);


        System.out.println("setTree " + setTree);


//                   Tree set is printing the value by order from smaller to bigger



//        linked hash set

        Set<String> LinkedHashSet1 = new LinkedHashSet<>();

        LinkedHashSet1.add("USA");
        LinkedHashSet1.add("China");
        LinkedHashSet1.add("Russia");
        LinkedHashSet1.add("India");
        LinkedHashSet1.add("France");
        LinkedHashSet1.add("Spain");

        System.out.println("linked hashset is here --->    "+LinkedHashSet1);

        for(String i1 : LinkedHashSet1){

            System.out.println("linked hash set in the foreach loop "+i1);

        }

//        Hashset

        Set<Integer> hashset1 = new HashSet<>();

        hashset1.add(30);
        hashset1.add(25);
        hashset1.add(1);
        hashset1.add(40);
        hashset1.add(10);
        hashset1.add(20);
        hashset1.add(12);
        hashset1.add(14);
        hashset1.add(126);

        System.out.println("hashset 1 is here --->   "+hashset1);


//        arrayList vs set

//        arraylist                                                       Set
/*
          arraylist accept duplicated values                        does not accept duplicated values

          arraylist accept multiple null values                       does not accept multiple null values

          ArrayList print according to your store in the arraylist    set has some options to print it like hash set treeset and linkedhashset

 */

//        hashset vs tree set vs linked hash set

  /*
            linked hash set   ->       printing accourding to how you stored in your set
            tree set          ->       printing from smaller to bigger number
            hashset           ->       printing randomly


   */


    }
}
