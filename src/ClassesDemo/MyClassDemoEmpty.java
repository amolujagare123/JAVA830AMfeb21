package ClassesDemo;
public class MyClassDemoEmpty {
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


    MyClassDemoEmpty()
    {
        // no boday -> empty contructor
    }


    public static void main(String[] args) {

        MyClassDemoEmpty ob = new MyClassDemoEmpty();

       /* ob.a =12;
        ob.d = 12.45;
        ob.c = 'g';
        ob.str = "str";*/

        ob.display();

    }


}
