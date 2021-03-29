package com.effective.java.exceptions;

import java.text.DateFormatSymbols;
import java.util.Locale;

/**
 * @author kadercelik Runtime hatası fırlatmak yerine alternatifi varsa onu kullanalım.
 */
public class MonthUtil {

  public static String monthName(MonthNo monthNo) {
    //if (monthNo > 12) {
    //  throw new IllegalArgumentException("month cannot be greater than 12");
    //}
    Locale locale = new Locale("tr", "TR");
    DateFormatSymbols symbols = new DateFormatSymbols(locale);
    String[] months = symbols.getMonths();
    return months[monthNo.getMonthNumber()];
  }

  public static void main(String[] args) {
    //String monthName = monthName(14);
    //hata fırlatmamak için monthName içerisine enum veriyoruz.
    //hata fırlatmmaya gerek kalmıyor.
    String monthName = monthName(MonthNo.EYLUL);
    System.out.println(monthName);
  }

  enum MonthNo {
    OCAK(1), SUBAT(2), MART(3), NISAN(4), MAYIS(5), HAZIRAN(6),
    TEMMUZ(7), AGUSTOS(8), EYLUL(9), EKIM(10), KASIM(11), ARALIK(12);

    private int monthNumber;

    MonthNo(int monthNumber) {
      this.monthNumber = monthNumber;
    }

    public int getMonthNumber() {
      return monthNumber;
    }

    public void setMonthNumber(int monthNumber) {
      this.monthNumber = monthNumber;
    }
  }
}
