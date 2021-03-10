package Inheritance.Polymorphism;

public class MultipleAdditions {

    int a;
    int b;

    void  addition()
    {
        int c = a+b;
        System.out.println("Addition="+c);
    }

    void  addition(int x, int y)
    {
        int c = x+y;
        System.out.println("Addition="+c);
    }

    void  addition(int x, int y, int z)
    {
        int c = x+y+z;
        System.out.println("Addition="+c);
    }

    void addition(double d1, double d2)
    {
        double c = d1 + d2;
        System.out.println("Addition="+c);
    }

    void addition(String str1,String str2)
    {
        String strAdd = str1 + str2;
        System.out.println("Addition==>"+strAdd);
    }

    void addition(int a, char b)
    {
        int c = a+b;
        System.out.println("Addition="+c);

    }


    public static void main(String[] args) {

       /* char ch ='c';
        System.out.println(ch);

        int i = ch;
        System.out.println(i);*/

        MultipleAdditions ob = new MultipleAdditions();
        ob.a=11;
        ob.b=22;
        ob.addition();

        ob.addition(12,12);
        ob.addition(11,11,11);
        ob.addition(1.1,2.2);
        ob.addition("abc","xyz");
        ob.addition(11,'j');

    }

}
