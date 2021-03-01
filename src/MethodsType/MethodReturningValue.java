package MethodsType;

public class MethodReturningValue {


    int getMyInt()
    {

        System.out.println("inside getMyInt");

        int a = 10;

        int y =11;

        int z= 111;

        return y;
    }

    double getMyDouble()
    {
       double d =11.2;

      return d;


        //    return 1.1;
    }


    public static void main(String[] args) {

        MethodReturningValue ob = new MethodReturningValue();

        int x = ob.getMyInt(); // 11

        int y1 = ob.getMyInt(); // 10

        int z1 = ob.getMyInt(); // 10



        System.out.println("x="+x);

        System.out.println(ob.getMyInt());


        double d1 = ob.getMyDouble();
        System.out.println(d1);

        System.out.println(ob.getMyDouble());
    }


}
