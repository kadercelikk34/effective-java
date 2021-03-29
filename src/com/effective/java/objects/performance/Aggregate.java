package com.effective.java.objects.performance;

/**
 * @author kadercelik
 */
public class Aggregate {

  public static void main(String[] args) {
    // Long sum = 0L;
    long sum = 0L;
    for (long i = 0; i < Integer.MAX_VALUE; i++) {
      //sum Long olursa performans kaybı olur.sum += new Long(i);
      sum += i;
    }
    System.out.println(sum);
  }
}
