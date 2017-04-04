package pl.los.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by jagod on 03.04.2017.
 */
public class DateUtil {

    public static Date addDays(Date date, int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, days);
        return calendar.getTime();
    }

}
