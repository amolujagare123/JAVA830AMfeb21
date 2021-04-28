public class SwitchDemo {

    public static void main(String[] args) {

        int a = 10;
        int b =5;
        int c;

        String operation = "add";

        switch (operation)
        {

            case "add" : c = a + b ;
                System.out.println("Addition="+c);
                break;

            case "substract" : c = a - b;
                System.out.println("Substraction="+c);
                break;

            case "mulitplication" : c = a * b;
                System.out.println("Multiplication="+c);
                break;

            case "division" : c = a/b;
                System.out.println("Division="+c);
                break;

            default:
                System.out.println("wrong choice");
                break;
        }
    }
}
