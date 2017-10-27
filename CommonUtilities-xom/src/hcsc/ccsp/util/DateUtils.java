package hcsc.ccsp.util;

import java.util.Date;
import java.util.*;
import java.lang.Math;

/**
 * 
 * @author ppandiarajan
 *
 */
public class DateUtils {

	/**
	   * This method is used to find the different between two dates
	   * and returns as number
	   * 
	   */
	public static long differenceBetweenDates(Date oldDate, Date newDate) {
		return Math.abs(newDate.getTime() - oldDate.getTime())
				/ (1000 * 60 * 60 * 24);
	}
	
	/**
	   * This method is used to get the future date from the no.of days given
	   * and the date as an input and returns the date
	   * 
	   */
    public static Date getLaterDate(Date Reqdate, int days) {

          Calendar c = Calendar.getInstance();
          c.setTime(Reqdate);
          c.add(Calendar.DAY_OF_MONTH, days);
          return c.getTime();
    }

    /**
	   * This method is used to get the earlier date from the no.of days given
	   * and the date as an input and returns the date
	   * 
	   */
    public static Date getEarlierDate(Date Reqdate, int days) {

          Calendar c = Calendar.getInstance();
          c.setTime(Reqdate);
          c.add(Calendar.DAY_OF_MONTH, -days);
          return c.getTime();
    }

    /**
	   * This method is used to get the future date from today and no.of days given
	   * and returns the date
	   * 
	   */
    public static Date getLaterTodayDate(int days) {

          Calendar c = Calendar.getInstance();
          c.add(Calendar.DAY_OF_MONTH, days);
          return c.getTime();
    }

    /**
	   * This method is used to get the earlier date from today and no.of days given
	   * and returns the date
	   * 
	   */
    public static Date getEarlierTodayDate(int days) {

          Calendar c = Calendar.getInstance();
          c.add(Calendar.DAY_OF_MONTH, -days);
          return c.getTime();
    }
}
