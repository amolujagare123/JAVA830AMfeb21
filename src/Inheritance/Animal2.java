package Inheritance;

public class Animal2 {

    void dispalyAnimal()
    {
        System.out.println("Animal");
    }
}

class Mamal extends  Animal2
{
    void displayMamal()
    {
        System.out.println("Mamal");
    }
}

class  Tiger extends  Mamal
{
    void displayTiger()
    {
        System.out.println("Tiger");
    }
}

class Reptile extends Animal2
{
    void displayReptile()
    {
        System.out.println("Reptile");
    }
}

class TestHybridInheritance
{
    public static void main(String[] args) {

        Animal2 animal2 = new Animal2();
        animal2.dispalyAnimal();


        Mamal mamal = new Mamal();
        mamal.displayMamal();
        mamal.dispalyAnimal();

        Tiger tiger = new Tiger();
        tiger.displayTiger();
        tiger.displayMamal();
        tiger.dispalyAnimal();


        Reptile reptile = new Reptile();
        reptile.displayReptile();
        reptile.dispalyAnimal();
    }
}