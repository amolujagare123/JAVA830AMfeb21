package StringDemo;

public class StringComparision {

    public static void main(String[] args) {

        String str1 = "amol";
        String str2 = "amol";
        String str3 = "Amol";
        String str4 = "kuldeep";
        String str5 = "abcd";
        String str6 = new String("amol");

        System.out.println("str1,str6-->"+str1.equals(str6));

        int a = 10;
        int b = 20;

        System.out.println(a==b); // --> true / false

        // int , float , char , boolean , double

        System.out.println(str1.equals(str2));

        System.out.println(str1.equals(str3)); // amol --> Amol

        System.out.println("str1,str3->"+str1.equalsIgnoreCase(str3)); // true

        System.out.println(str1.equals(str4));

        System.out.println("str1==str2 ->"+(str1==str2)); // false
        System.out.println("str1==str6 ->"+(str1==str6)); //
    }
}
