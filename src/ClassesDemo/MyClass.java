package ClassesDemo;
public class MyClass {
    int a;
    double d;
    char c;
    String str;

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        int a1;
        a1 = 10 ;
        System.out.println(a1);

        MyClass ob = new MyClass();

        ob.a =12;
        ob.d = 12.45;
        ob.c = 'g';
        ob.str = "str";

        ob.display();

       MyClass ob2 = new MyClass();
       ob2.a = 11;
       ob2.d =8.9;
       ob2.c='f';
       ob2.str="amol";

       ob2.display();


    }


}
