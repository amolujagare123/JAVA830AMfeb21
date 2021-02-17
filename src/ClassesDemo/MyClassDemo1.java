package ClassesDemo;
public class MyClassDemo1 {
    int a;
    double d;
    char c;
    String str; // data members

    void display() // member function / methods
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

 // default constructor

    public static void main(String[] args) {

        MyClassDemo1 ob = new MyClassDemo1();

       /* ob.a =12;
        ob.d = 12.45;
        ob.c = 'g';
        ob.str = "str";*/

        ob.display();

    }


}
