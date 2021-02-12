package StringDemo;

public class StringEdingChar {

    public static void main(String[] args) {

        String str = "Hey baby you are so lovely";

        String[] sArr = str.split(" ");

        for(int i=0;i<sArr.length;i++)
        {
            String tempStr = sArr[i];
            int l = tempStr.length();

            if(tempStr.charAt(l-1)=='y')
                System.out.println(sArr[i]);
        }

    }
}
