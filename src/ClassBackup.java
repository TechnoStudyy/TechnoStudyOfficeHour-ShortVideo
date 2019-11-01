public class ClassBackup {
    public static void main(String[] args) {



        String str1 = "what";
        String str2 = "is";
        String str3 = "your";
        String str4 = "name?";

        System.out.println(str1 + str2 +str3 + str4);



        String a1 = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAasAAAAAAA";
        String b1 = "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS";
        System.out.println("Lengths are: " + (a1 + b1).length());

        System.out.println("Task 2-------------------------------------");

        if((a1.length () - b1.length()) < 0) {
            System.out.println("cannot proceed!");
        } else {
            System.out.println("we can do it!");
        }


        String a = "Techno";

        int a3 = a.length();

        int a4 = a.indexOf("e");

        System.out.println(a3 + a4);

        String a5="Techno";
        System.out.println("a5 index of "+a5.indexOf("e"));

        System.out.println(a5.length()+a5.indexOf("e"));

    }

}
