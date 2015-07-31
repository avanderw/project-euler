package project.euler.problem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
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
