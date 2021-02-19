package Inheritance;

import pack1.Java1;

public class Animal extends Java1 {

    void eat()
    {
        System.out.println("eat");
    }
}

class Dog extends Animal
{
    void barks()
    {
        System.out.println("barks");
    }
}

class BabyDog extends  Dog
{
    void weeps()
    {
        System.out.println("weeps");
    }


    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();


        Dog d = new Dog();
        d.barks();
        d.eat();

        BabyDog babyDog = new BabyDog();

        babyDog.weeps();
        babyDog.barks();
        babyDog.eat();
    }
}