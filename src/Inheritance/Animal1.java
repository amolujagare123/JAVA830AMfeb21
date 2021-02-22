package Inheritance;

public class Animal1 {

    void eat()
    {
        System.out.println("eat");

    }
}

class Dog1 extends  Animal1{
    void bark()
    {
        System.out.println("bark");
    }
}

class Cat extends  Animal1
{
    void meow()
    {
        System.out.println("meow");
    }
}

class TestInheritance
{

    public static void main(String[] args) {

        Animal1 animal1 = new Animal1();
        animal1.eat();

        Dog1 dog1 = new Dog1();
        dog1.eat();
        dog1.bark();


        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }

}