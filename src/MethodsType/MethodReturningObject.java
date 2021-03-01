package MethodsType;

import pack2.Java4;

public class MethodReturningObject {


        Java4 getMyObject()
        {
            Java4 obj = new Java4();

            obj.a4 =10;
            obj.d4 =10.5;
            obj.c4 ='g';
            obj.str4 ="amol";

            return obj;
        }





    public static void main(String[] args) {

        MethodReturningObject ob = new MethodReturningObject();



        Java4 j4 = ob.getMyObject();

        j4.display4();

        System.out.println("value of a4 in = "+j4.a4);


    }


}
