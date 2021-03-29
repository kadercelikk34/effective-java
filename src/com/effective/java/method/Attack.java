package com.effective.java.method;

import java.util.Date;

/**
 * @author kadercelik
 */
public class Attack {

  public static void main(String[] args) {
    Date start = new Date();
    Date end = new Date();
    Period period = new Period(start, end);
    // parametrenin orginal değeri bozuldu bunun önüne geçmek için Model içinde defansif kopya oluşturulur.
    end.setYear(78); // Modifies internals of period !
    System.out.println(period);

    //Second attack on the internals of a Period instance
    start = new Date();
    end = new Date();
    period = new Period(start, end);
    period.getEnd().setTime(78);
    System.out.println(period);
  }
}
