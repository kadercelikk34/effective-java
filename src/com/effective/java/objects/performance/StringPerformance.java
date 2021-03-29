package com.effective.java.objects.performance;

/**
 * @author kadercelik
 */
public class StringPerformance {

  public static void main(String[] args) {
    String s1 = new String("Hello"); // her defasında yeni obje oluşturduğu için performansı düşürür.
    String s2 = "Hello";
    String s3 = "Hello";
    if (s1 == s2) {
      System.out.println("s1 = s2");
    }
    if (s2 == s3) {
      System.out.println("s2 = s3");
    }
    //içerikleri aynı olduğu için hash kodu aynıdır.
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s3.hashCode());
  }
}
