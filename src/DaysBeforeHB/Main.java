package DaysBeforeHB;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        String s1 = "18.09.2021";
        String s2 = "16.03.2021";
        DateFormat f = DateFormat.getDateInstance();
        Date date1 = f.parse(s1);
        Date date2 = f.parse(s2);


        Calendar day1 = Calendar.getInstance();
        Calendar day2 = Calendar.getInstance();
        day1.setTime(date1);
        day2.setTime(date2);

        int daysBetween = day1.get(Calendar.DAY_OF_YEAR) - day2.get(Calendar.DAY_OF_YEAR);


        f = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("There " + daysBetween + " days between " + f.format(day1.getTime()) + " and " +
                f.format(day2.getTime()) + ".");


    }
}

