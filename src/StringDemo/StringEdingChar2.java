package StringDemo;

public class StringEdingChar2 {

    public static void main(String[] args) {

        String str = "Hey baby you are so lovely";

        String[] sArr = str.split(" ");

        for(int i=0;i<sArr.length;i++)
        {

            if(sArr[i].endsWith("y"))
                System.out.println(sArr[i]);
        }

    }
}
