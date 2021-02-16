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


        /*String dateStr0= "23-June-2016"

=> dd-MMMM-yyyy

String dateStr1= "23 | June 16  8:34"
=> dd | MMMM yy hh:mm
*/

        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");

        String str0 = sd0.format(date);
        System.out.println(str0);
        System.out.println(sd0.format(date));


        SimpleDateFormat sd1 = new SimpleDateFormat("dd |MMMM yy h:mm");

        String dateStr1 = sd1.format(date);
        System.out.println(dateStr1);

        System.out.println(sd1.format(date));



         // Date to string


    }
}
