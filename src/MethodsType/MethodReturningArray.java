package MethodsType;

public class MethodReturningArray {



    int[] getMySingleDiArray()
    {

        int[] arr = {11,2,33,4,55,12,21,23,44,54};

        return arr;
    }



    String[][]  getMyTwoDiStringArr()
    {
        String[][] strArr={
                {"abc1","pqr1","xyz1"},
                {"abc2","pqr2","xyz2"},
                {"abc3","pqr3","xyz3"},
                {"abc4","pqr4","xyz4"},
        };
        return  strArr;
    }


    public static void main(String[] args) {

        MethodReturningArray ob = new MethodReturningArray();


        int[] a = ob.getMySingleDiArray();

        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);



        String[][] myStrArr = ob.getMyTwoDiStringArr();

        for(int i=0;i<myStrArr.length;i++)
        {
            for(int j=0;j<myStrArr[0].length;j++)
            {
                System.out.print(myStrArr[i][j]+" ");
            }
            System.out.println();
        }

    }


}
