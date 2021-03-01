package Abstraction;

public class FinalDemo {

    final int speed = 100;

    void change()
    {
        speed =120;
    }

    public static void main(String[] args) {

        FinalDemo ob = new FinalDemo();

        System.out.println(ob.speed);
        ob.change();

        System.out.println(ob.speed);

    }
}
