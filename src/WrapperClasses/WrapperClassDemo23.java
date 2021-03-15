package WrapperClasses;

public class WrapperClassDemo23 {

    public static void main(String[] args) {


        Integer ii = new Integer(5); // wrapper class
        System.out.println("ii="+ii);

        int i = ii.intValue();
        System.out.println("i="+i); // unboxing / unwrapping

        int j = ii; // autounboxing / autounwrapping
        System.out.println("j="+j);

        for(Integer a = 0 ; a< 10 ; a++)
            System.out.println(a);
    }

}
