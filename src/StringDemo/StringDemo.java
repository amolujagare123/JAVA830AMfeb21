package StringDemo;

public class StringDemo {


    public static void main(String[] args) {

        String str = "Hi this is a java";

        System.out.println(str);
        System.out.println("length="+str.length());

        int l = str.length(); // 17 - 3 = 14

        System.out.println("char at index 3="+str.charAt(l-3));


        System.out.println(str.toUpperCase());

        String str2 ="MY NAME IS AMOL";

        System.out.println(str2.toLowerCase());

    }


}
