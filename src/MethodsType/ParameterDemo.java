package MethodsType;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ParameterDemo {

    void myBoolean(boolean b)
    {
        System.out.println("b="+b);
    }

    void myMonthofTheDate(Date date)// FDS | PSD
    {
        SimpleDateFormat sd =new SimpleDateFormat("MMMM");
        System.out.println(sd.format(date));

    }

    void printMySingldDiAray(int[] arr)
    {
        System.out.println("Below are the simple dimentional array Values");

        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");


       System.out.println();

    }

    void printTwoDiStringArray(String[][] strArr)
    {
        for(int i=0;i<strArr.length;i++)
        {
            for(int j=0;j<strArr[0].length; j++ )
            {
                System.out.print(strArr[i][j]+"\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        ParameterDemo ob =new  ParameterDemo();

        ob.myBoolean(true);

      //  ob.myMonthofTheDate(new Date());

        Date date1 = new Date();
        ob.myMonthofTheDate(date1);

        int[] a = {12,56,23,12,412,1,15,12,78,90};

        ob.printMySingldDiAray(a);


        String[][] sArr ={

                {"abc1","pqr1","xyz1"},
                {"abc2","pqr2","xyz2"},
                {"abc3","pqr3","xyz3"},
                {"abc4","pqr4","xyz4"},
        };

        ob.printTwoDiStringArray(sArr);
    }
}
