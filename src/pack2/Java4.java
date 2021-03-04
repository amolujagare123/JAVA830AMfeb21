package pack2;

import StaticDemo.Student;
/*
import static StaticDemo.Student.college;
import static StaticDemo.Student.method1;*/

import static StaticDemo.Student.*;


public class Java4 {

    public int a4;
    public double d4;
    public char c4;
    public String str4;

    public void display4()
    {
        System.out.println("a="+a4);
        System.out.println("d="+d4);
        System.out.println("c="+c4);
        System.out.println("str="+str4);
    }

    public static void main(String[] args) {

        Java3 ob = new Java3();

      //  ob.c1 = 90;

        method1();


        method1();


        System.out.println(Student.college);

        System.out.println(college);

    }

}
