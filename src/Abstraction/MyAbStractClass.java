package Abstraction;

public abstract class MyAbStractClass {
     abstract void start();
     abstract void run();
     void show()
     {
         System.out.println("inside show");
     }
}

class ChildAbStract extends MyAbStractClass
{
     void start()
     {
          System.out.println("start");
     }
     void run()
     {
          System.out.println("run");
     }

     public static void main(String[] args) {
          MyAbStractClass ob = new ChildAbStract(); // upcasting
          ob.run();
          ob.start();
          ob.show();
     }
}
