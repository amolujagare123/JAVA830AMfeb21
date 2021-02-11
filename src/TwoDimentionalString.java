public class TwoDimentionalString {

    public static void main(String[] args) {

        String[][] ss = {

                {"abc1", "pqr1", "xyz1", "lmn1"},
                {"abc2", "pqr2", "xyz2", "lmn2"},
                {"abc3", "pqr2", "xyz3", "lmn3"},
                {"abc4", "pqr4", "xyz4", "lmn4"}
        };


        for(int i=0;i<ss.length;i++)
        {
            for(int j=0;j<ss[0].length;j++)
            {
                System.out.print(ss[i][j]+" ");
            }

            System.out.println();
        }


        }
}
