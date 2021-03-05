package ExceptionHandling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) throws ParseException {

        String str = "12/03/2021";

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM yyyy");

      //  try {
            Date date = sd.parse(str);
      /*  }
        catch (Exception e)
        {

        }*/
        System.out.println(date);
        System.out.println("end of the program");

    }

}
