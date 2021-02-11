public class TwoDProgram {

    public static void main(String[] args) {
        int[][] a = new int[2][2]; // 0 ,1 ,2
        a[0][0] = 5;
        a[0][1] = 6;
        a[1][0] = 7;
        a[1][1] = 8;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++)
                System.out.print(a[i][j] + " ");

            System.out.println();
        }

    }


}
