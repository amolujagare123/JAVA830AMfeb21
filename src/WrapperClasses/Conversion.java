package WrapperClasses;

public class Conversion {

    public static void main(String[] args) {

        String str1 = "11";
        String str2 = "22";

        System.out.println(str1+str2); // 1122

        int i1 = Integer.parseInt(str1);
        int i2 = Integer.parseInt(str2);

        System.out.println(i1+i2);

        String str3 = "11.2";
        String str4 = "22.3";
        System.out.println(str3+str4); // 11.222.3

        double d1 = Double.parseDouble(str3);
        double d2 = Double.parseDouble(str4);
        System.out.println(d1+d2);

        float f1 = Float.parseFloat(str3);
        float f2 = Float.parseFloat(str4);
        System.out.println(f1+f2);

        String str5 = "true";
        String str6 = "true";

        boolean b1 = Boolean.parseBoolean(str5);
        boolean b2 = Boolean.parseBoolean(str6);

        if(b1)
            System.out.println("b1 is true");
        else
            System.out.println("b1 is false");

        if(b2)
            System.out.println("b2 is true");
        else
            System.out.println("b2 is false");


        String str7 = "s";

        // how to convert a single character string into char

         char c = str7.charAt(0);

    }
}
