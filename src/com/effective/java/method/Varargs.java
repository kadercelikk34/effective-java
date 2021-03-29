package com.effective.java.method;

/**
 * @author kadercelik
 */
public class Varargs {

  static int sum(int... args) {
    int sum = 0;
    for (int arg : args) {
      sum += arg;
    }
    return sum;
  }

  /**
   * @param first dizinin boş olsa bile ilk parametereyi göndereceğim için hata almayı engelleriz.
   * @param args  dizinbin boyutları belli olmadığı için int... args kullandık
   * @return
   */
  static int min(int first, int... args) {
    int min = first;
    for (int i = 0; i < args.length; i++) {
      if (args[i] < min) {
        min = args[i];
      }
    }
    return min;
  }

  public static void main(String[] args) {
    System.out.println(sum(1, 2, 3, 4, 5, 6, 8));
    System.out.println(min(2, 6, 7, 8, 4, 3));
  }
}
