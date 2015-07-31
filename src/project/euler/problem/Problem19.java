package project.euler.problem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * You are given the following information, but you may prefer to do some research for yourself.
 *
 * 1 Jan 1900 was a Monday.
 * Thirty days has September,
 * April, June and November.
 * All the rest have thirty-one,
 * Saving February alone,
 * Which has twenty-eight, rain or shine.
 * And on leap years, twenty-nine.
 * A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
 * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 *
 * @author cp318674
 */
public class Problem19 extends AProblem {

    @Override
    public String answer() {
        Calendar calendar = GregorianCalendar.getInstance();
        try {
            calendar.setTime(new SimpleDateFormat("yyyy-MM-dd").parse("1901-01-01"));
        } catch (ParseException ex) {
            Logger.getLogger(Problem19.class.getName()).log(Level.SEVERE, null, ex);
        }

        Date endDate = null;
        try {
            endDate = new SimpleDateFormat("yyyy-MM-dd").parse("2000-12-31");
        } catch (ParseException ex) {
            Logger.getLogger(Problem19.class.getName()).log(Level.SEVERE, null, ex);
        }

        Integer count = 0;
        while (calendar.getTime().before(endDate)) {
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                count++;
            }

            calendar.add(Calendar.MONTH, 1);
        }
        return "" + count;
    }
}
