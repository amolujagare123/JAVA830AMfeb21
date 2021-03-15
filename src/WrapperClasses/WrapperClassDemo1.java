package WrapperClasses;

public class WrapperClassDemo1 {

    public static void main(String[] args) {

        int i =5; // premitive  data type
        System.out.println("i="+i);

        Integer ii = new Integer(5); // wrapper class - boxing/wrapping
        System.out.println("ii="+ii);

       Integer ii1 = new Integer(i);// boxing/wrapping
        System.out.println("ii1="+ii1);


        int j =23;

        Integer ii2 = 19; // autoboxing / autowrapping
        Integer ii3 = j; // autoboxing / autowrapping

        System.out.println("ii2="+ii2);
        System.out.println("ii3="+ii3);
    }

}
