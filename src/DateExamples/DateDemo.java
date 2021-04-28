package DateExamples;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) {


        Date date = new Date();

        System.out.println(date);

        SimpleDateFormat sd  = new SimpleDateFormat("dd/MM/yyyy");

        String dateStr =  sd.format(date);

        System.out.println(dateStr);
        System.out.println(sd.format(date));


        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");

        String str0 = sd0.format(date);
        System.out.println(str0);


        SimpleDateFormat sd1 = new SimpleDateFormat("dd |MMMM yy h:mm");

        String dateStr1 = sd1.format(date);
        System.out.println(dateStr1);





    }
}
