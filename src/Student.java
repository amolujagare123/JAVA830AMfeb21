public class Student {

    int rno;
    String name ;
    static String college = "ITC";

    void  display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("collge="+college);
    }

    public static void main(String[] args) {

        Student ob1 = new Student();
        ob1.rno = 1;
        ob1.name = "Pooja";

        Student ob2 = new Student();
        ob2.rno = 2;
        ob2.name = "Monica";

        Student ob3 = new Student();
        ob3.rno = 3;
        ob3.name = "Rohit";



        ob2.college="ABC";


        ob1.display();
        ob2.display();
        ob3.display();


        System.out.println("Assessing Using Class Name="+Student.college);

        Student.college = "PICT";

        System.out.println("ob1.college="+ob2.college); // 1.
        System.out.println("ob2.college="+ob2.college); // 1.
        System.out.println("ob3.college="+ob2.college); // 1.

    }

}
