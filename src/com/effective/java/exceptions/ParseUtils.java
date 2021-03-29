package com.effective.java.exceptions;

/**
 * @author kadercelik
 */
public class ParseUtils {

  public static void parse(int value) {
    if (value > 1000) {
      throw new IllegalArgumentException();
    }
  }

  public static void main(String[] args) {
    ParseUtils.parse(200);
    System.out.println("finish");
  }
}
