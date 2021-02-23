package Inheritance.Polymorphism;

public class BaseOverriding {

    public void myMethod()
    {
        System.out.println("inside Base overriding");
    }
}

class DerivedOverriding extends  BaseOverriding
{
    public void myMethod() // derived / overriden method method
    {
        System.out.println("inside DerivedOverriding");
    }

    public static void main(String[] args) {

        BaseOverriding ob1 = new DerivedOverriding();
        ob1.myMethod();

        BaseOverriding ob2 = new BaseOverriding(); // upcasting
        ob2.myMethod();

    }
}
