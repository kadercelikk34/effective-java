package com.effective.java.generics;

/**
 * @author kadercelik
 */
public class Interesting {

  //İlk değeri vermezsek hata alırız
  static Integer i = new Integer(42);

  public static void main(String[] args) {
    if (i == 42) {
      System.out.println("Interesting...");
    }
  }
}
