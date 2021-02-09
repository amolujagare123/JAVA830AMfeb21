public class ArrayDouble {

    public static void main(String[] args) {

        double[] d = new double[5];

        d[0] = 1.1;
        d[1] = 4.1;
        d[2] = 1.9;
        d[3] = 6.1;
        d[4] = 1.2;



     /*   System.out.println(d[1]);

        for(int i=0;i<5;i++)
            System.out.println(d[i]);
*/
        for(int i=0;i<d.length;i++)
            System.out.println(d[i]);
    }
}
