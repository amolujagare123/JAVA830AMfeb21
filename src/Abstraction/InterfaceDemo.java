package Abstraction;

public interface InterfaceDemo {

    void start();
    void run();

  /*  void method1() // Access Modifier
    {
        System.out.println("method1");
    }*/

    default void method2() // Access Modifier default
    {
        System.out.println("method1");
    }

    static void method3() // Access Modifier public
    {
        System.out.println("method1");
    }
}


class ChildInterface implements InterfaceDemo
{
     public void start()
        {
            System.out.println("Start");
        }

    public void run()
        {
            System.out.println("run");
        }


    public static void main(String[] args) {

         InterfaceDemo ob = new ChildInterface();

         ob.start();
         ob.run();
         ob.method2();
         InterfaceDemo.method3();
         // to access static method in interface use interface name
    }
}
