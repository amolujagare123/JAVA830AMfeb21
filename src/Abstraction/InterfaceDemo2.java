package Abstraction;

public interface InterfaceDemo2 {

    void start();
    void run();

    void display();
}

interface AnotherInterface
{
    void display();
}


class ChildInterface1 implements InterfaceDemo2 , AnotherInterface {

    public void start() {
        System.out.println("Start");
    }

    public void run() {
        System.out.println("run");
    }

    public void display() {
        System.out.println("display");
    }


    public static void main(String[] args) {

        ChildInterface1 ob1 = new ChildInterface1();
        ob1.display();

        InterfaceDemo2 ob2 =  new ChildInterface1();
        ob2.display();

        AnotherInterface ob3 = new ChildInterface1();
        ob3.display();


    }
}