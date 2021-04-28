package DateExamples;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy h:mm");
        String dateStr1 = sd1.format(date);
        System.out.println(dateStr1);

        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy - MM - dd | h:mm:ss");
        String dateStr2 = sd2.format(date);
        System.out.println(dateStr2);


        SimpleDateFormat sd3 = new SimpleDateFormat("EEEE yyyy/MM/dd");
        String dateStr3 = sd3.format(date);
        System.out.println(dateStr3);

        SimpleDateFormat sd4 = new SimpleDateFormat("dd-MM-yyyy | E | h:mm");
        String dateStr4 = sd4.format(date);
        System.out.println(dateStr4);

        SimpleDateFormat sd5 = new SimpleDateFormat("h:mm:ss");
        String dateStr5 = sd5.format(date);
        System.out.println(dateStr5);
    }
}
