package com.effective.java.method;

import java.util.Date;

/**
 * @author kadercelik
 */
public class Period {

  private final Date start;

  private final Date end;

  //Defancif kopya oluşturuldu
  public Period(Date start, Date end) {
    this.start = new Date(start.getTime());
    this.end = new Date(end.getTime());
    if (this.start.compareTo(this.end) > 0) {
      throw new IllegalArgumentException(start + " after " + end);
    }
  }

  public Date getStart() {
    return start;
  }

  public Date getEnd() {
    return end;
  }

  @Override
  public String toString() {
    return "Period{" +
           "start=" + start +
           ", end=" + end +
           '}';
  }
}
