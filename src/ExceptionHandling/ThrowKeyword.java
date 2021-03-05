package ExceptionHandling;

public class ThrowKeyword {

    void checkNumber(int n) throws Exception // number has to be between 1-10
    {
        if(n>=1 && n<=10)
            System.out.println("We are safe");

        else
            throw new Exception("we are in danger");
    }

    public static void main(String[] args) throws Exception {

        ThrowKeyword ob = new ThrowKeyword();

        System.out.println("start of the program");

        int n =12;

        ob.checkNumber(n);

        System.out.println("end of the program");

    }

}
