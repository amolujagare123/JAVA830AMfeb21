package ClassesDemo;
public class MyClassDemoParameterizedThis {
    int a;
    double d;
    char c;
    String str; // data members

    void display() // member function / methods
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    MyClassDemoParameterizedThis(int a, double d, char c, String str)
    {
        this.a = a;
        this.d = d;
        this.c = c;
        this.str = str;
    }
    
    public static void main(String[] args) {

        MyClassDemoParameterizedThis ob = new MyClassDemoParameterizedThis(10,202.1,'f',"amol");

        ob.display();
    }


}
