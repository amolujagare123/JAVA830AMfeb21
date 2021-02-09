public class ArrayDemo {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 12;
        a[1] = 32;
        a[2] = 16;
        a[3] = 62;
        a[4] = 19;

     //   System.out.println(a[3]);
        /*for(int i =0 ; i<5;i++)
        {
            System.out.println(a[i]);
        }*/


        for(int i =0 ; i<a.length;i++)
        {
            System.out.println(a[i]);
        }


    }
}
