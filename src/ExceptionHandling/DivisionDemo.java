package ExceptionHandling;

public class DivisionDemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int c = 1;

        try {
            c = a / b;
            System.out.println("print statement");
        }
        catch (Exception e)
        {
            System.out.println("inside catch");
            System.out.println("Error Message:"+e);
            System.out.println("Message only:"+ e.getMessage());
            System.out.println("class only:"+ e.getClass());

            e.printStackTrace();
        }

        System.out.println("c="+c);

        System.out.println("End of the program");

    }
}
