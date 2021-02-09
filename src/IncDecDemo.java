public class IncDecDemo {

    public static void main(String[] args) {

        int i = 10;

        System.out.println(i); // 10 , 10 ,10 -correct--> 10
        System.out.println(i++);// 11 , 11,11----> 10
        System.out.println(i);// 10 , 11 ,11------> 11
        System.out.println(++i);// 9,12,12 ------> 12
        System.out.println(i); // 10,12 ,12------> 12

/*i++ / i-- : it first executes the statement  & then increments / decrements

++i / -- i : it first  increments / decrements  & executes the statement */

    }

}
