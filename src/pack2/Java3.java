package pack2;

import pack1.Java1;

public class Java3 extends  Java1{

    int a3;
    double d3;
    char c3;
    String str3;

    void display3()
    {
        System.out.println("a="+a3);
        System.out.println("d="+d3);
        System.out.println("c="+c3);
        System.out.println("str="+str3);
    }

    public static void main(String[] args) {

        Java1 obJava3 = new Java1(); // parent class object
        obJava3.a1 =90;
      //  obJava3.c1 ='d'; // default, now protected
        // using same class object - not accesible

        Java3 ob = new Java3(); // child class object
        ob.a1 =89;
        ob.c1 = 'g'; // default, now protected
        // using child class object - accesible

    }

}
