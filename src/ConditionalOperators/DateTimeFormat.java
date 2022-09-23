package ConditionalOperators;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFormat {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println(d.getTime());
        System.out.println(d.toString());
        System.out.println(s.format(d));
    }

}
