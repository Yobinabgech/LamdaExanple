package ConditionalOperators;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SubstractDate {


    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy, MM, dd");

        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
       //Calendar cal = new GregorianCalendar(2021,0,10);
        Calendar cal = Calendar.getInstance();
       System.out.println("printing date before subtracting days = " + s.format(cal.getTime()));
        cal.add(Calendar.DAY_OF_WEEK,-5);
        System.out.println("printing date after subtracting days = " + s.format(cal.getTime()));


        }


    }

