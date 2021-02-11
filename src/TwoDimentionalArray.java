public class TwoDimentionalArray {

    public static void main(String[] args) {

        int[][] a = new int[4][3];

        a[0][0] = 32;
        a[0][1] = 42;
        a[0][2] = 52;

        a[1][0] = 11;
        a[1][1] = 12;
        a[1][2] = 13;


        a[2][0] = 62;
        a[2][1] = 72;
        a[2][2] = 82;

        a[3][0] = 17;
        a[3][1] = 18;
        a[3][2] = 19;

        int row = a.length;
        int col = a[0].length;


        for(int i=0;i<row;i++)
        {
            for(int j =0 ; j<col ; j++)
            {
                System.out.print(a[i][j]+" ");
            }

            System.out.println();
        }
    }


}
