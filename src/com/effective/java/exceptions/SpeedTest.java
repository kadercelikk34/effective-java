package com.effective.java.exceptions;

import java.time.Instant;

/**
 * @author kadercelik
 * try-catch kullanmak uygulamayı yavaşlata bilir.
 */
public class SpeedTest {

  public static void main(String[] args) {
    long[] myLongArray = new long[10];
    long start = Instant.now().toEpochMilli();
    long i = 0;
    //
    for (int j = 0; j < Integer.MAX_VALUE; j++) {
      // try {
      i += j + myLongArray[j];
      //} catch (Exception ex) {
      //  //...
      //}
    }
    System.out.println("value = " + i);
    long stop = Instant.now().toEpochMilli();
    System.out.println("Time " + (stop - start));
  }
}
