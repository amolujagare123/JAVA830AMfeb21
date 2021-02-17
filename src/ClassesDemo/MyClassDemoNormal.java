package ClassesDemo;
public class MyClassDemoNormal {
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

    MyClassDemoNormal()
    {
        a =1;
        d =1.1;
        c='a';
        str = "abc";
    }


    public static void main(String[] args) {

        MyClassDemoNormal ob = new MyClassDemoNormal();

        System.out.println("==== before setting new values =====");
        ob.display();


        ob.a =12;
        ob.d = 12.45;
        ob.c = 'g';
        ob.str = "str";
        System.out.println("==== After setting new values =====");
        ob.display();

    }


}
