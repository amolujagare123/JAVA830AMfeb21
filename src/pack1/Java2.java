package pack1;

public class Java2 {

    int a2;
    double d2;
    char c2;
    String str2;

    void display2()
    {
        System.out.println("a="+a2);
        System.out.println("d="+d2);
        System.out.println("c="+c2);
        System.out.println("str="+str2);
    }

    public static void main(String[] args) {

        Java1 obJava2 = new Java1();

        obJava2.a1 = 11;
       // obJava2.d1 = 1.1;

        obJava2.c1 ='f';
        obJava2.display1();

    }

}
