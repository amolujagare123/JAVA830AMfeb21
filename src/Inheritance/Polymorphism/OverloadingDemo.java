package Inheritance.Polymorphism;

    public class OverloadingDemo {

        void display()
        {
            System.out.println("this is a display");
        }

        void display(int a)
        {
            System.out.println("I am printing value of a");
            System.out.println("a="+a);
        }

        public static void main(String[] args) {
            OverloadingDemo ob =new  OverloadingDemo();

            ob.display();
            ob.display(34);

        }


}
