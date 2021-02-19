package Inheritance;

public class ParentClass {

    int salary = 10000;

    void myMethod()
    {
        System.out.println("inside My medhod");
    }
}


class ChildClass extends  ParentClass
{
    int bonus = 2000;

    public static void main(String[] args) {

        ChildClass ob = new ChildClass();
        System.out.println(ob.bonus);
        System.out.println(ob.salary);
        ob.myMethod();

    }
}