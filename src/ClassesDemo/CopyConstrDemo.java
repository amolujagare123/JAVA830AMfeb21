package ClassesDemo;

public class CopyConstrDemo {

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

    CopyConstrDemo()
    {

    }

    CopyConstrDemo(CopyConstrDemo obj) // Copy constructor
    {
           a  = obj.a;
           d = obj.d;
           c = obj.c;
           str = obj.str;
    }

    public static void main(String[] args) {

        CopyConstrDemo ob1 = new CopyConstrDemo();
        ob1.a =10;
        ob1.d =1.1;
        ob1.c= 'g';
        ob1.str="abcd";
        ob1.display();


        CopyConstrDemo ob3 = new CopyConstrDemo();
        ob3.a =101;
        ob3.d =11.1;
        ob3.c= '2';
        ob3.str="wder";
        ob3.display();


        CopyConstrDemo ob2 = new CopyConstrDemo(ob3);
        ob2.display();
    }
}
