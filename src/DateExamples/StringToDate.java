package DateExamples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

    public static void main(String[] args) throws ParseException {

        String dateStr = "10/27/2021"; // MM/dd/yyyy
        System.out.println(dateStr);

        SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy");

        Date date = sd.parse(dateStr);

        System.out.println(date);
        System.out.println(sd.parse(dateStr));

        String dateStr0= "23-June-2016";
            //=> dd-MMMM-yyyy
        SimpleDateFormat sd0  = new SimpleDateFormat("dd-MMMM-yyyy");
        System.out.println(sd0.parse(dateStr0));


        String dateStr1= "23 | June 16  8:34";
        //=> dd | MMMM yy hh:mm
        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        System.out.println(sd1.parse(dateStr1));

    }

}
