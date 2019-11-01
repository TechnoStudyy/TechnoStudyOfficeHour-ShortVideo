import java.sql.SQLOutput;

public class ShortVideoClass2 {

    public static void main(String[] args) {

        /*
         * ToLowerCase
         * toUpperCase
         *
         * equal
         * equalIgnoreCase
         * contains
         *
         * endsWith
         * StartWith
         *
         * indexOf
         * charAt
         * length
         *
         * isEmpty
         * lastindexOf
         *
         * replace
         *
         * Substring
         *
         * trim
         *
         */

//          ToLowerCase
        String s1 = "TechnoStudySHOOL";

        System.out.println("Lowercase is here : " + s1.toLowerCase());

//          toUpperCase
        System.out.println("toUpper case is here : " + s1.toUpperCase());

        s1.toUpperCase();

        System.out.println("trying to make s1 toUpper case in next line is here : " + s1);

        s1 = s1.toUpperCase();
        System.out.println("making s1 toUpper case in next line is here : " + s1);

//          equal
        String s2 = "New Jersey";
        String s3 = "New Jersey";

        System.out.println("is s2 equals to s3 : "+s2.equals(s3));

        s3 = s3.toLowerCase();
        System.out.println("is s2 equals to s3 lower case  : "+s2.equals(s3));

//          equalIgnoreCase

        System.out.println("is s2 equals ignore case equal to s3 : " + s2.equalsIgnoreCase(s3) );

//          contains
        String s4 = "New Jersey";

        String s5 = "New";

        System.out.println("Is s4 contains s5 : " + s4.contains(s5));

        s5 = s5.toUpperCase();

        System.out.println("Is s4 contains s5 uppercase  : " + s4.contains(s5));

//          endsWith
        String s6 = "GoTOMeeting";
        System.out.println("is s6 endswith ing : " + s6.endsWith("ing"));

        boolean b1 = s6.endsWith("ong");

        System.out.println("is s6 endswith ong : " + b1 );


//          StartWith
        System.out.println("is s6 start with GO : " + s6.startsWith("GO"));
        System.out.println("is s6 start with Go : " + s6.startsWith("Go"));

//          indexOf  -> if I need to know the position of the one character then I should use index of
        String s7 = "I Love java";

        System.out.println("what is the position for the o : " + s7.indexOf('o'));

//          charAt  -> if i need to know in one position which caracter in there then I need to use char at
        System.out.println("what is the position for the 7 : " + s7.charAt(7));

//          length -> how many character in the string
        System.out.println("length is here :  " + s7.length());

        int i1 = s7.length();
        System.out.println("what is i1 in the length : " + i1);

//          isEmpty
        String s8 = "";
        System.out.println("is string s8 is empty " + s8.isEmpty());

        s8 = "something";

        System.out.println("is string s8 is empty " + s8.isEmpty());

//          lastindexOf
        String s9 = "I am using MSI" ;
        System.out.println("index of I is here : " + s9.indexOf('I'));

        System.out.println("Last index of I is here : " + s9.lastIndexOf('I'));

//          replace

//                String s9 = "I am using MSI" ;
        System.out.println("replace I with M : " + s9.replace('I' , 'M'));

        String st1 = "we started the String methods";

        st1.replace('e', 'K');

        System.out.print("trying to change st1   e to K : ");
        System.out.println(st1);

        System.out.print("st1 is changing e to K : ");
       st1 = st1.replace('e', 'K');

        System.out.println(st1);

//          Substring -> is cutting the string from the position which you gave to the end
        st1 = "we started the String methods";

        System.out.println("st1 cutting from 10 : "+st1.substring(10));

        System.out.println("st1 cutting from 5 to 12 : "+st1.substring(5,12));



//          trim  -> is deleting the spaces from beginning and from end

        String st2 ="        there is space in the begining and in the end           ";

        System.out.println("========================================================");


        System.out.println("st2 without trim " + st2);

        System.out.println("st2 with trim " +st2.trim());


        System.out.println("sysmbol \\");
        System.out.println("          tabulation");
        System.out.println("\ttabulation");

        System.out.println("Address :\nLosAngeles");
        System.out.println("Time :\n its very early");











    }

}
