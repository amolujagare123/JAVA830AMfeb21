package StringDemo;

public class SplitStringDemo {

    public static void main(String[] args) {

       String str = "This is a java class";

       String[] sArr =  str.split("a");

       for(int i =0; i< sArr.length;i++)
           System.out.println(sArr[i]);

    }
}
